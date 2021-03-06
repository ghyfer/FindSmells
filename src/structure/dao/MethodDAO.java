/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.dao;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metrics.MetricMethod;
import structure.DetectionStrategy;
import structure.Method;
import structure.Project;

/**
 *
 * @author bruno
 */
public class MethodDAO implements DAOMetric{

    @Override
    public Object selectByObject(Object object) {
        Method method = (Method) object;
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            String sql = createQuerySelectByObject(method);
            ps = connection.prepareStatement(sql);
            ps = assignAttributeInQuery(ps, method);
            ResultSet rs = ps.executeQuery();
            List<Method> methods = new ArrayList<>();
            while (rs.next()) {
                Method m = new Method(rs.getString("name"), method.getProject(), rs.getString("source"), rs.getString("package"));
                m.setId(rs.getInt("id"));
                for (MetricMethod metric : MetricMethod.values()) {
                    String nameMetric = metric.toString().toLowerCase();
                    m.updateValueMetric(nameMetric, rs.getDouble(nameMetric));
                }
                methods.add(m);
            }
            return methods;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
        return null;
    }

    @Override
    public void register(Object object) {
        Method method = (Method) object;
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("INSERT INTO measure_method(project, name, source, package, mloc, nbd, par, vg) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, method.getProject().getId());
            ps.setString(2, method.getName());
            ps.setString(3, method.getSource());
            ps.setString(4, method.getPack());
            int index = 5;
            for (MetricMethod metric : MetricMethod.values()) {
                ps.setObject(index, method.getValueMetric(metric));
                index++;
            }
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
    }

    @Override
    public void update(Object object) {
        Method method = (Method) object;
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("UPDATE measure_method SET project=?, name=?, source=?, package=?, mloc=?, nbd=?, par=?, vg=? WHERE id=?");
            ps.setInt(1, method.getProject().getId());
            ps.setString(2, method.getName());
            ps.setString(3, method.getSource());
            ps.setString(4, method.getPack());
            int index = 5;
            for (MetricMethod metric : MetricMethod.values()) {
                ps.setObject(index, method.getValueMetric(metric));
                index++;
            }
            ps.setInt(index, method.getId());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
    }

    @Override
    public Object selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String createQuerySelectByObject(Method method) {
        String sql = "SELECT * FROM measure_method WHERE ";
        sql = (method.getName() == null) ? (sql + "name is NULL AND ") : (sql + "name=? AND ");
        sql = (method.getSource() == null) ? (sql + "source is NULL AND ") : (sql + "source=? AND ");
        sql = (method.getPack() == null) ? (sql + "package is NULL AND project=?") : (sql + "package=? AND project=?");
        return sql;
    }

    private PreparedStatement assignAttributeInQuery(PreparedStatement ps, Method method) throws SQLException {
        int index = 1;
        if (method.getName() != null) {
            ps.setObject(index, method.getName());
            index++;
        }
        if (method.getSource() != null) {
            ps.setObject(index, method.getSource());
            index++;
        }
        if (method.getPack() != null) {
            ps.setObject(index, method.getPack());
            index++;
        }
        ps.setInt(index, method.getProject().getId());
        return ps;
    }
    
    @Override
    public Object applyDetectionStrategy(DetectionStrategy detectionStrategy, Project project) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("SELECT * FROM measure_method WHERE (" + detectionStrategy.getExpression() + ") AND project=?");
            ps.setInt(1, project.getId());
            ResultSet rs = ps.executeQuery();
            List<Method> methods = new ArrayList<>();
            while (rs.next()) {
                Method method = new Method(rs.getInt("id"), rs.getString("name"), project, rs.getString("source"), rs.getString("package"));
                for (MetricMethod metric : MetricMethod.values()) {
                    String nameMetric = metric.toString().toLowerCase();
                    method.updateValueMetric(nameMetric, rs.getDouble(nameMetric));
                }
                methods.add(method);
            }
            return methods;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
        return null;
    }

    @Override
    public int totalArtifacts(Project project) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("SELECT sum(nom) as nom FROM measure_class WHERE project=?");
            ps.setInt(1, project.getId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                return rs.getInt("nom");
            }
            return 0;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
        return 0;
    }
    
    public static void removeByIdProject(Integer idProject){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = DBConnection.getConnection();
            ps = connection.prepareStatement("DELETE FROM measure_method WHERE project=?");
            ps.setInt(1, idProject);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(connection, ps);
        }
    }
    
}
