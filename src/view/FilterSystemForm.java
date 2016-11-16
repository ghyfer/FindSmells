/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.DBConnection;
import filter.Filter;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import metrics.Granulatiry;
import structure.DetectionStrategy;
import structure.Project;
import structure.dao.DAO;
import structure.dao.DetectionStrategyDAO;
import structure.dao.ProjectDAO;
import structure.dao.MethodDAO;
import structure.dao.PackageDAO;
import structure.dao.TypeDAO;

/**
 *
 * @author bruno
 */
public class FilterSystemForm extends javax.swing.JFrame {

    /**
     * Creates new form FIlterSystemForm
     */
    public FilterSystemForm() {
        DBConnection.createDataBase();
        initComponents();
        this.xmlFiles = new LinkedHashSet<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jPanelFilterSystem = new javax.swing.JPanel();
        jLabelProject = new javax.swing.JLabel();
        jComboBoxProject = new javax.swing.JComboBox();
        jLabelDetectionStrategy = new javax.swing.JLabel();
        jComboBoxDetectionStrategy = new javax.swing.JComboBox();
        jButtonFilter = new javax.swing.JButton();
        jPanelRegisterProject = new javax.swing.JPanel();
        jLabelNameProject = new javax.swing.JLabel();
        jTextFieldNameProject = new javax.swing.JTextField();
        jButtonSelectXML = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaXmlFiles = new javax.swing.JTextArea();
        jButtonDone = new javax.swing.JButton();
        jLabelXmlSelected = new javax.swing.JLabel();
        jButtonCleanTextArea = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemLog = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenuTool = new javax.swing.JMenu();
        jMenuItemCreateDetectionStrategy = new javax.swing.JMenuItem();
        jMenuItemUpdateThreshold = new javax.swing.JMenuItem();
        jMenuItemRemoveDetectionStrategy = new javax.swing.JMenuItem();
        jMenuItemRemoveProject = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemHelp = new javax.swing.JMenuItem();
        jMenuItemMetricsCatalog = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAboutFindSmells = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FindSmells");
        setResizable(false);

        jPanelFilterSystem.setBorder(javax.swing.BorderFactory.createTitledBorder("Bad Smells Detection"));

        jLabelProject.setText("Choose a Project:");

        jComboBoxProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectProjects();

        jLabelDetectionStrategy.setText("Choose a Detection Strategy:");

        jComboBoxDetectionStrategy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectDetectionStrategies();

        jButtonFilter.setText("Filter");
        jButtonFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFilterSystemLayout = new javax.swing.GroupLayout(jPanelFilterSystem);
        jPanelFilterSystem.setLayout(jPanelFilterSystemLayout);
        jPanelFilterSystemLayout.setHorizontalGroup(
            jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilterSystemLayout.createSequentialGroup()
                .addGroup(jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilterSystemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDetectionStrategy))
                    .addGroup(jPanelFilterSystemLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelProject)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxDetectionStrategy, 0, 320, Short.MAX_VALUE)
                    .addComponent(jComboBoxProject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFilterSystemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonFilter)
                .addGap(246, 246, 246))
        );
        jPanelFilterSystemLayout.setVerticalGroup(
            jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilterSystemLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetectionStrategy)
                    .addComponent(jComboBoxDetectionStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelFilterSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProject)
                    .addComponent(jComboBoxProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButtonFilter)
                .addGap(27, 27, 27))
        );

        jPanelRegisterProject.setBorder(javax.swing.BorderFactory.createTitledBorder("Submit System"));
        jPanelRegisterProject.setMinimumSize(new java.awt.Dimension(597, 376));

        jLabelNameProject.setText("Project:");

        jButtonSelectXML.setText("Select XML Files");
        jButtonSelectXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectXMLActionPerformed(evt);
            }
        });

        jTextAreaXmlFiles.setEditable(false);
        jTextAreaXmlFiles.setColumns(20);
        jTextAreaXmlFiles.setRows(5);
        jScrollPane1.setViewportView(jTextAreaXmlFiles);

        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jLabelXmlSelected.setText("XMLs Selected:");

        jButtonCleanTextArea.setText("Clean XML Selected");
        jButtonCleanTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanTextAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegisterProjectLayout = new javax.swing.GroupLayout(jPanelRegisterProject);
        jPanelRegisterProject.setLayout(jPanelRegisterProjectLayout);
        jPanelRegisterProjectLayout.setHorizontalGroup(
            jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                        .addComponent(jLabelNameProject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNameProject)
                        .addGap(20, 20, 20))
                    .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                        .addComponent(jLabelXmlSelected)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterProjectLayout.createSequentialGroup()
                                .addComponent(jButtonDone)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterProjectLayout.createSequentialGroup()
                                .addComponent(jButtonCleanTextArea)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterProjectLayout.createSequentialGroup()
                                .addComponent(jButtonSelectXML)
                                .addGap(35, 35, 35))))))
        );
        jPanelRegisterProjectLayout.setVerticalGroup(
            jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNameProject)
                    .addComponent(jTextFieldNameProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelXmlSelected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegisterProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRegisterProjectLayout.createSequentialGroup()
                        .addComponent(jButtonSelectXML)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonCleanTextArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDone))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFilterSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRegisterProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFilterSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRegisterProject, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanelRegisterProject.getAccessibleContext().setAccessibleName("Register Project");

        jMenu1.setText("File");

        jMenuItemLog.setText("Vizualize Logs");
        jMenuItemLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemLog);
        jMenu1.add(jSeparator1);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar.add(jMenu1);

        jMenuTool.setText("Tool");

        jMenuItemCreateDetectionStrategy.setText("Create Detection Strategy");
        jMenuItemCreateDetectionStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreateDetectionStrategyActionPerformed(evt);
            }
        });
        jMenuTool.add(jMenuItemCreateDetectionStrategy);

        jMenuItemUpdateThreshold.setText("Update Detection Strategy");
        jMenuItemUpdateThreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdateThresholdActionPerformed(evt);
            }
        });
        jMenuTool.add(jMenuItemUpdateThreshold);

        jMenuItemRemoveDetectionStrategy.setText("Remove Detection Strategy");
        jMenuItemRemoveDetectionStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoveDetectionStrategyActionPerformed(evt);
            }
        });
        jMenuTool.add(jMenuItemRemoveDetectionStrategy);

        jMenuItemRemoveProject.setText("Remove Project");
        jMenuItemRemoveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoveProjectActionPerformed(evt);
            }
        });
        jMenuTool.add(jMenuItemRemoveProject);

        jMenuBar.add(jMenuTool);

        jMenu2.setText("About");

        jMenuItemHelp.setText("Tutorial");
        jMenu2.add(jMenuItemHelp);

        jMenuItemMetricsCatalog.setText("Threshold Catalog");
        jMenu2.add(jMenuItemMetricsCatalog);
        jMenu2.add(jSeparator2);

        jMenuItemAboutFindSmells.setText("About FindSmells");
        jMenu2.add(jMenuItemAboutFindSmells);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCreateDetectionStrategyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreateDetectionStrategyActionPerformed
        CreateDetectionStrategyForm frame = new CreateDetectionStrategyForm(this);
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItemCreateDetectionStrategyActionPerformed

    private void jMenuItemUpdateThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdateThresholdActionPerformed
        UpdateThresholdForm updateThresholdForm = new UpdateThresholdForm(this);
        updateThresholdForm.setVisible(true);
    }//GEN-LAST:event_jMenuItemUpdateThresholdActionPerformed

    private void jButtonSelectXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectXMLActionPerformed
        JFileChooser c = new JFileChooser();
        c.setMultiSelectionEnabled(true);
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");
        c.setDialogTitle("Open schedule file");
        c.setFileFilter(xmlfilter);
        c.showOpenDialog(this);
        File[] files = c.getSelectedFiles();

        try {
            if (files != null) {
                long length = 0;
                for (File f : files) {
                    this.xmlFiles.add(f);
                    Path path = Paths.get(f.getName());
                    if (this.jTextAreaXmlFiles.getText().equals("")) {
                        this.jTextAreaXmlFiles.setText(path.toString());
                    } else {
                        this.jTextAreaXmlFiles.setText(this.jTextAreaXmlFiles.getText() + "\n" + path.toString());
                    }
                }
            }

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(this, "File Upload Failed!");
        }
    }//GEN-LAST:event_jButtonSelectXMLActionPerformed

    private void jButtonCleanTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanTextAreaActionPerformed
        this.xmlFiles.clear();
        this.jTextAreaXmlFiles.setText("");
    }//GEN-LAST:event_jButtonCleanTextAreaActionPerformed

    private void jButtonFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFilterActionPerformed
        if (!jComboBoxProject.getSelectedItem().equals("There aren't projects recorded!") && !jComboBoxDetectionStrategy.getSelectedItem().equals("There aren't detection strategies recorded!")) {
            List<DetectionStrategy> detections = (List<DetectionStrategy>) new DetectionStrategyDAO().selectAll();
            List<Project> projects = (List<Project>) new ProjectDAO().selectAll();
            Object artefactsWithBadSmells;
            if (detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()).getGranularity().equals(Granulatiry.Type)) {
                artefactsWithBadSmells = new TypeDAO().applyDetectionStrategy(detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()), projects.get(this.jComboBoxProject.getSelectedIndex()));
            } else if (detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()).getGranularity().equals(Granulatiry.Method)) {
                artefactsWithBadSmells = new MethodDAO().applyDetectionStrategy(detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()), projects.get(this.jComboBoxProject.getSelectedIndex()));
            } else {
                artefactsWithBadSmells = new PackageDAO().applyDetectionStrategy(detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()), projects.get(this.jComboBoxProject.getSelectedIndex()));
            }
            ResultsFilteringForm results = new ResultsFilteringForm(artefactsWithBadSmells, detections.get(this.jComboBoxDetectionStrategy.getSelectedIndex()).getGranularity(), projects.get(this.jComboBoxProject.getSelectedIndex()));
            results.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Verify if there is any project and detection strategy recorded!", "Attention", JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonFilterActionPerformed

    public void refreshDetectionStrategies() {
        selectDetectionStrategies();
    }

    public void refreshProjects() {
        selectProjects();
    }

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogActionPerformed
        LogsForm logs = new LogsForm();
        logs.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        if (!xmlFiles.isEmpty() && !jTextFieldNameProject.getText().isEmpty()) {
            Filter filter = new Filter(this.xmlFiles, this.jTextFieldNameProject.getText(), this);
//            filter.convertFiles();
            filter.start();
//            Filter filter = Filter.getInstance();
//            filter.convertFiles(this.xmlFiles, this.jTextFieldNameProject.getText());
//            finish();
        } else {
            JOptionPane.showMessageDialog(this, "Make sure that the field \"Project\" is completed and there is at least one selected file!", "Attention", JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jMenuItemRemoveDetectionStrategyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoveDetectionStrategyActionPerformed
        RemoveDetectionStrategyForm remove = new RemoveDetectionStrategyForm(this);
        remove.setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoveDetectionStrategyActionPerformed

    private void jMenuItemRemoveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoveProjectActionPerformed
        RemoveProjectForm remove = new RemoveProjectForm(this);
        remove.setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoveProjectActionPerformed

    public void refresh() {
        selectProjects();
        selectDetectionStrategies();
        this.xmlFiles.clear();
        jTextFieldNameProject.setText("");
        jTextAreaXmlFiles.setText("");
        JOptionPane.showMessageDialog(this, "Operation was successful!");
    }

    private void selectProjects() {
        DAO dao = new ProjectDAO();
        List<Project> projects = (List<Project>) dao.selectAll();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        if (projects.size() > 0) {
            for (Project p : projects) {
                combo.addElement(p.getName());
            }
            this.jComboBoxProject.setModel(combo);
        } else {
            combo.addElement("There aren't projects recorded!");
            this.jComboBoxProject.setModel(combo);
        }
    }

    private void selectDetectionStrategies() {
        DAO dao = new DetectionStrategyDAO();
        List<DetectionStrategy> detectionStrategies = (List<DetectionStrategy>) dao.selectAll();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        if (detectionStrategies.size() > 0) {
            for (DetectionStrategy p : detectionStrategies) {
                combo.addElement(p.getName());
            }
            this.jComboBoxDetectionStrategy.setModel(combo);
        } else {
            combo.addElement("There aren't detection strategies recorded!");
            this.jComboBoxDetectionStrategy.setModel(combo);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilterSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterSystemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterSystemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonCleanTextArea;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonFilter;
    private javax.swing.JButton jButtonSelectXML;
    private javax.swing.JComboBox jComboBoxDetectionStrategy;
    private javax.swing.JComboBox jComboBoxProject;
    private javax.swing.JLabel jLabelDetectionStrategy;
    private javax.swing.JLabel jLabelNameProject;
    private javax.swing.JLabel jLabelProject;
    private javax.swing.JLabel jLabelXmlSelected;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemAboutFindSmells;
    private javax.swing.JMenuItem jMenuItemCreateDetectionStrategy;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHelp;
    private javax.swing.JMenuItem jMenuItemLog;
    private javax.swing.JMenuItem jMenuItemMetricsCatalog;
    private javax.swing.JMenuItem jMenuItemRemoveDetectionStrategy;
    private javax.swing.JMenuItem jMenuItemRemoveProject;
    private javax.swing.JMenuItem jMenuItemUpdateThreshold;
    private javax.swing.JMenu jMenuTool;
    private javax.swing.JPanel jPanelFilterSystem;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelRegisterProject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea jTextAreaXmlFiles;
    private javax.swing.JTextField jTextFieldNameProject;
    // End of variables declaration//GEN-END:variables
    private Set<File> xmlFiles;
}
