/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import metrics.MetricMethod;
import metrics.MetricPackage;
import metrics.MetricType;
import structure.Project;
import structure.dao.LogDAO;
import structure.dao.ProjectDAO;
import structure.log.Log;

/**
 *
 * @author bruno
 */
public class LogsForm extends javax.swing.JFrame {

    /**
     * Creates new form LogsForm
     */
    public LogsForm() {
        initComponents();
        verifyStateButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelFilter = new javax.swing.JPanel();
        jLabelProject = new javax.swing.JLabel();
        jComboBoxProject = new javax.swing.JComboBox();
        jLabelFilter = new javax.swing.JLabel();
        jComboBoxMetric = new javax.swing.JComboBox();
        jLabelSubject = new javax.swing.JLabel();
        jComboBoxSubject = new javax.swing.JComboBox();
        jButtonFilter = new javax.swing.JButton();
        jPanelLogs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLogs = new javax.swing.JTable();
        jButtonPrevious = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabelHighlighter = new javax.swing.JLabel();
        jButtonExport = new javax.swing.JButton();

        setTitle("FindSmells");
        setResizable(false);

        jPanelMain.setBorder(javax.swing.BorderFactory.createTitledBorder("Logs"));

        jPanelFilter.setBorder(javax.swing.BorderFactory.createTitledBorder("Filters"));

        jLabelProject.setText("Project:");

        jComboBoxProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        refreshComboProjects();

        jLabelFilter.setText("Metric:");

        jComboBoxMetric.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        refreshComboMetrics();

        jLabelSubject.setText("Subject:");

        jComboBoxSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        refreshComboSubjects();

        jButtonFilter.setText("Filter");
        jButtonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFilterLayout = new javax.swing.GroupLayout(jPanelFilter);
        jPanelFilter.setLayout(jPanelFilterLayout);
        jPanelFilterLayout.setHorizontalGroup(
            jPanelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFilterLayout.createSequentialGroup()
                        .addComponent(jLabelProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProject, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFilterLayout.createSequentialGroup()
                        .addComponent(jLabelFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMetric, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addComponent(jLabelSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFilterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFilter)
                .addGap(328, 328, 328))
        );
        jPanelFilterLayout.setVerticalGroup(
            jPanelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProject)
                    .addComponent(jComboBoxProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubject)
                    .addComponent(jComboBoxSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilter)
                    .addComponent(jComboBoxMetric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonFilter)
                .addContainerGap())
        );

        jPanelLogs.setBorder(javax.swing.BorderFactory.createTitledBorder("Logs"));

        jTableLogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableLogs.setToolTipText("");
        this.logs = new LogDAO().selectLogsByFilter(projects.get(jComboBoxProject.getSelectedIndex()), ((String) jComboBoxMetric.getSelectedItem()), ((String) jComboBoxSubject.getSelectedItem()));
        updatePages();
        tableResults();
        jScrollPane1.setViewportView(jTableLogs);

        jButtonPrevious.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButtonPrevious.setText("<<");
        jButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPreviousActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButtonNext.setText(">>");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabelHighlighter.setText("jLabel1");
        updateHighlighter();

        javax.swing.GroupLayout jPanelLogsLayout = new javax.swing.GroupLayout(jPanelLogs);
        jPanelLogs.setLayout(jPanelLogsLayout);
        jPanelLogsLayout.setHorizontalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanelLogsLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButtonPrevious)
                .addGap(34, 34, 34)
                .addComponent(jLabelHighlighter)
                .addGap(34, 34, 34)
                .addComponent(jButtonNext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLogsLayout.setVerticalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrevious)
                    .addComponent(jButtonNext)
                    .addComponent(jLabelHighlighter))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButtonExport.setText("Export Log");
        jButtonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExport)))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilterActionPerformed
        this.logs = new LogDAO().selectLogsByFilter(projects.get(jComboBoxProject.getSelectedIndex()), ((String) jComboBoxMetric.getSelectedItem()), ((String) jComboBoxSubject.getSelectedItem()));
        updatePages();
        tableResults();
        verifyStateButtons();
        updateHighlighter();
    }//GEN-LAST:event_jButtonFilterActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        this.pageCurrent++;
        tableResults();
        updateHighlighter();
        verifyStateButtons();
        this.jButtonPrevious.setEnabled(true);
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void verifyStateButtons() {
        if (this.pageCurrent == this.pages) {
            this.jButtonNext.setEnabled(false);
        } else {
            this.jButtonNext.setEnabled(true);
        }
        if (this.pageCurrent == 1) {
            this.jButtonPrevious.setEnabled(false);
        } else {
            this.jButtonPrevious.setEnabled(true);
        }
    }

    private void jButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPreviousActionPerformed
        this.pageCurrent--;
        tableResults();
        updateHighlighter();
        verifyStateButtons();
        this.jButtonNext.setEnabled(true);
    }//GEN-LAST:event_jButtonPreviousActionPerformed

    private void jButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        int returnVal = jfileChooser.showSaveDialog(this);
        int confirm = 0;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File log = jfileChooser.getSelectedFile();
                log.createNewFile();
                if (!logs.isEmpty()) {
                    confirm = createLog(log);
                    if (confirm == 1) {
                        JOptionPane.showMessageDialog(this, "Log successfully generated!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Couldn't export logs!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "There aren't logs to exported!");
                }
            } catch (IOException ex) {
                Logger.getLogger(LogsForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonExportActionPerformed

    private int createLog(File file) {
        FileWriter log = null;
        try {
            log = new FileWriter(file);
            for (Log l : this.logs) {
                String info = l.printLog();
                log.write(info);
            }
            log.close();
            return 1;
        } catch (IOException ex) {
            Logger.getLogger(LogsForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void tableResults() {
        String[] column = getColumns();
        String[][] data = getData();
        if (data != null) {
            jTableLogs = new JTable(data, column);
            DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
            cellRender.setHorizontalAlignment(SwingConstants.CENTER);
            jTableLogs.getTableHeader().setReorderingAllowed(false);
            jTableLogs.setEnabled(false);
            jScrollPane1.setViewportView(jTableLogs);
        } else {
            JLabel emptyLabel = new JLabel("There aren't logs for this filter!!!");
            emptyLabel.setHorizontalAlignment(SwingConstants.CENTER);
            jScrollPane1.setViewportView(emptyLabel);
        }
    }

    private String[][] getData() {
        String[][] data = null;
        if (!logs.isEmpty()) {
            int start = (LIMIT * pageCurrent) - LIMIT;
            if ((start + LIMIT) <= this.logs.size()) {
                data = new String[LIMIT][5];
            } else {
                data = new String[(logs.size() - start)][5];
            }
            int i = 0;
            while (((i + start) < logs.size()) && (i < LIMIT)) {
                data[i][0] = logs.get(i + start).getArtifact().getProject().getName();
                data[i][1] = logs.get(i + start).getArtifact().getName();
                data[i][2] = logs.get(i + start).getMetric();
                data[i][3] = logs.get(i + start).getSubject();
                data[i][4] = logs.get(i + start).getMessage();
                i++;
            }
        }
        return data;
    }

    private String[] getColumns() {
        String[] columns = new String[]{"Project", "Name of Artifact", "Metric", "Subject", "Message"};
        return columns;
    }

    private void refreshComboProjects() {
        projects = new ArrayList<>();
        projects.add(new Project(0, "None"));
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement("None");
        List<Project> allProjects = (List<Project>) new ProjectDAO().selectAll();
        for (Project p : allProjects) {
            projects.add(p);
            combo.addElement(p.getName());
        }
        jComboBoxProject.setModel(combo);
    }

    private void refreshComboMetrics() {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement("None");
        List<String> list = new ArrayList<>();
        for (MetricMethod m : MetricMethod.values()) {
            list.add(m.toString());
        }
        for (MetricType m : MetricType.values()) {
            list.add(m.toString());
        }
        for (MetricPackage m : MetricPackage.values()) {
            list.add(m.toString());
        }
        Collections.sort(list);
        for (String l : list) {
            combo.addElement(l);
        }
        jComboBoxMetric.setModel(combo);
    }

    private void updateHighlighter() {
        this.jLabelHighlighter.setText(this.pageCurrent + " of " + this.pages);
    }

    private void updatePages() {
        if (!logs.isEmpty()) {
            if ((this.logs.size() % LIMIT) == 0) {
                pages = (this.logs.size() / LIMIT);
            } else {
                pages = (this.logs.size() / LIMIT) + 1;
            }
        } else {
            pages = 1;
        }
    }

    private void refreshComboSubjects() {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement("None");
        combo.addElement("Character invalid");
        jComboBoxSubject.setModel(combo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExport;
    private javax.swing.JButton jButtonFilter;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonPrevious;
    private javax.swing.JComboBox jComboBoxMetric;
    private javax.swing.JComboBox jComboBoxProject;
    private javax.swing.JComboBox jComboBoxSubject;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelHighlighter;
    private javax.swing.JLabel jLabelProject;
    private javax.swing.JLabel jLabelSubject;
    private javax.swing.JPanel jPanelFilter;
    private javax.swing.JPanel jPanelLogs;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLogs;
    // End of variables declaration//GEN-END:variables
    private List<Project> projects;
    private List<Log> logs;
    private int pages;
    private int pageCurrent = 1;
    private static final int LIMIT = 20;
}
