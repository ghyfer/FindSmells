/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import metrics.MetricMethod;
import metrics.MetricPackage;
import metrics.MetricType;
import structure.DetectionStrategy;
import structure.dao.DAO;
import structure.dao.DetectionStrategyDAO;

/**
 *
 * @author bruno
 */
public class UpdateThresholdForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateThresholdForm
     */
    public UpdateThresholdForm() {
        this.detectionStrategies = new ArrayList<>();
        initComponents();
        this.jButtonReset.setVisible(false);
    }

    public UpdateThresholdForm(FilterSystemForm frame) {
        this.detectionStrategies = new ArrayList<>();
        this.mainScreen = frame;
        initComponents();
        this.jButtonReset.setVisible(false);
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
        jLabelDetectionStrategy = new javax.swing.JLabel();
        jComboBoxDetectionStrategy = new javax.swing.JComboBox();
        jScrollPaneThresholds = new javax.swing.JScrollPane();
        jButtonDone = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jPanelDetectionStrategyCurrent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDetectionStrategyCurrent = new javax.swing.JTextArea();

        setTitle("FindSmells");
        setResizable(false);

        jPanelMain.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Thresholds"));

        jLabelDetectionStrategy.setText("Choose the Detection Strategy: ");

        jComboBoxDetectionStrategy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectDetectionStrategies();
        jComboBoxDetectionStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDetectionStrategyActionPerformed(evt);
            }
        });

        jScrollPaneThresholds.setBorder(javax.swing.BorderFactory.createTitledBorder("Thresholds"));

        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jPanelDetectionStrategyCurrent.setBorder(javax.swing.BorderFactory.createTitledBorder("Detection Strategy Current"));
        jPanelDetectionStrategyCurrent.setToolTipText("");
        jPanelDetectionStrategyCurrent.setPreferredSize(new java.awt.Dimension(678, 121));

        jTextAreaDetectionStrategyCurrent.setEditable(false);
        jTextAreaDetectionStrategyCurrent.setColumns(20);
        jTextAreaDetectionStrategyCurrent.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDetectionStrategyCurrent);

        javax.swing.GroupLayout jPanelDetectionStrategyCurrentLayout = new javax.swing.GroupLayout(jPanelDetectionStrategyCurrent);
        jPanelDetectionStrategyCurrent.setLayout(jPanelDetectionStrategyCurrentLayout);
        jPanelDetectionStrategyCurrentLayout.setHorizontalGroup(
            jPanelDetectionStrategyCurrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetectionStrategyCurrentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDetectionStrategyCurrentLayout.setVerticalGroup(
            jPanelDetectionStrategyCurrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetectionStrategyCurrentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelDetectionStrategy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDetectionStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addComponent(jButtonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDone))
                    .addComponent(jScrollPaneThresholds)
                    .addComponent(jPanelDetectionStrategyCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetectionStrategy)
                    .addComponent(jComboBoxDetectionStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPaneThresholds, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelDetectionStrategyCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDone)
                    .addComponent(jButtonReset))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDetectionStrategyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDetectionStrategyActionPerformed
        int index = this.jComboBoxDetectionStrategy.getSelectedIndex();
        if (index != 0) {
            DetectionStrategy detectionStrategy = this.detectionStrategies.get(index);
            identifyMetrics(detectionStrategy);
            loadMetrics();
            loadDetectionStrategy();
        } else {
            JPanel p = new JPanel();
            p.setSize(600, 400);
            this.jScrollPaneThresholds.setViewportView(p);
        }
    }//GEN-LAST:event_jComboBoxDetectionStrategyActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        if (this.jComboBoxDetectionStrategy.getSelectedIndex() != 0) {
            if (inputValuesToStrategy()) {
                int index = jComboBoxDetectionStrategy.getSelectedIndex();
                DAO dao = new DetectionStrategyDAO();
                dao.update(this.detectionStrategies.get(index));
                JOptionPane.showMessageDialog(this, "Detection strategy successfully updated!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                this.mainScreen.refreshDetectionStrategies();
                selectDetectionStrategies();
                this.jComboBoxDetectionStrategy.setSelectedIndex(index);
                loadDetectionStrategy();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a detection strategy to update!", "Attention", JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private boolean inputValuesToStrategy() {
        int idDetectionStrategy = this.jComboBoxDetectionStrategy.getSelectedIndex();
        String exp = this.detectionStrategies.get(idDetectionStrategy).getExpression();
        exp = exp.replaceAll("[0-9]+(\\.[0-9]+)?", "THRESHOLD");
        String[] split = exp.split("THRESHOLD");
        for (int index = 0; index < (split.length - 1); index++) {
            if (!this.fieldsMetrics[index].getText().isEmpty()) {
                if (validateNumber(this.fieldsMetrics[index].getText())) {
                    exp = exp.replaceFirst("THRESHOLD", this.fieldsMetrics[index].getText());
                } else {
                    JOptionPane.showMessageDialog(this, "The field of metric " + this.metrics[index].toString() + " has a value invalid. is empty. Insert a value valid!", "Attention", JOptionPane.WARNING_MESSAGE, null);
                    this.fieldsMetrics[index].grabFocus();
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(this, "The field of metric " + this.metrics[index].toString() + " is empty. Insert a value in this field!", "Attention", JOptionPane.WARNING_MESSAGE, null);
                this.fieldsMetrics[index].grabFocus();
                return false;
            }
        }
        this.detectionStrategies.get(idDetectionStrategy).setExpression(exp);
        return true;
    }

    private boolean validateNumber(String arg) {
        Double valor;
        try {
            valor = Double.parseDouble(arg);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        int index = this.jComboBoxDetectionStrategy.getSelectedIndex();
        if (index != 0) {
            DetectionStrategy detectionStrategy = this.detectionStrategies.get(index);
            identifyMetrics(detectionStrategy);
            loadMetrics();
        } else {
            JPanel p = new JPanel();
            p.setSize(600, 400);
            this.jScrollPaneThresholds.setViewportView(p);
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void loadMetrics() {
        JPanel p = new JPanel();
        p.setSize(600, 400);
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        int row = 0;
        for (Enum e : this.metrics) {
            JLabel label = new JLabel(e.toString().toUpperCase() + ": ");
            c.weightx = 0.5;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = row;
            p.add(label, c);

            c.weightx = 1;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 10;
            c.gridy = row;
            p.add(this.fieldsMetrics[row], c);
            row++;
        }
        c.weightx = 0.5;
        c.weighty = 50;
        c.gridx = 0;
        c.gridy = row;
        p.add(new Label(""), c);

        c.weightx = 10;
        c.gridx = 10;
        c.gridy = row;
        p.add(new Label(""), c);

        this.jScrollPaneThresholds.setViewportView(p);
    }

    private void loadDetectionStrategy() {
        int index = this.jComboBoxDetectionStrategy.getSelectedIndex();
        if (this.detectionStrategies.get(index).getExpression() != null) {
            this.jTextAreaDetectionStrategyCurrent.setText(this.detectionStrategies.get(index).getExpression());
        } else {
            this.jTextAreaDetectionStrategyCurrent.setText("");
        }
    }

    private void identifyMetrics(DetectionStrategy detectionStrategy) {
        String[] split = detectionStrategy.getExpression().split(" ");
        int length = identifyAmountMetrics(split, detectionStrategy.getGranularity().toString());
        this.metrics = new Enum[length];
        this.fieldsMetrics = new JTextField[length];
        switch (detectionStrategy.getGranularity().toString()) {
            case "Method":
                identifyMetricMethod(split);
                break;
            case "Package":
                identifyMetricPackage(split);
                break;
            case "Class":
                identifyMetricType(split);
                break;
        }
        identifyValues(detectionStrategy);
    }

    private void identifyMetricMethod(String[] split) {
        int index = 0;
        for (String part : split) {
            for (MetricMethod metric : MetricMethod.values()) {
                if (part.contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    index++;
                    break;
                }
            }
        }
    }

    private void identifyMetricPackage(String[] split) {
        int index = 0;
        for (String part : split) {
            for (MetricType metric : MetricType.values()) {
                if (part.contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    index++;
                    break;
                }
            }
        }
    }

    private void identifyMetricType(String[] split) {
        int index = 0;
        for (String part : split) {
            for (MetricType metric : MetricType.values()) {
                if (part.contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    index++;
                    break;
                }
            }
        }
    }

    private void identifyValues(DetectionStrategy detectionStrategy) {
        Matcher matcher = Pattern.compile("[0-9]+(\\.[0-9]+)?").matcher(detectionStrategy.getExpression());
        int index = 0;
        while (matcher.find()) {
            this.fieldsMetrics[index] = new JTextField(matcher.group());
            index++;
        }
    }

    private int identifyAmountMetrics(String[] split, String granularity) {
        int amount = 0;
        for (String part : split) {
            if (MetricMethod.verifyInString(part) || MetricPackage.verifyInString(part) || MetricType.verifyInString(part)) {
                amount++;
            }
        }
        return amount;
    }

    private void selectDetectionStrategies() {
        DetectionStrategyDAO dao = new DetectionStrategyDAO();
        List<DetectionStrategy> strategies = (List<DetectionStrategy>) dao.selectAllAllowed();
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        this.detectionStrategies.add(new DetectionStrategy("None", null, null));
        combo.addElement("None");
        if (strategies.size() > 0) {
            for (DetectionStrategy p : strategies) {
                this.detectionStrategies.add(p);
                combo.addElement(p.getName());
            }
        }
        this.jComboBoxDetectionStrategy.setModel(combo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JComboBox jComboBoxDetectionStrategy;
    private javax.swing.JLabel jLabelDetectionStrategy;
    private javax.swing.JPanel jPanelDetectionStrategyCurrent;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneThresholds;
    private javax.swing.JTextArea jTextAreaDetectionStrategyCurrent;
    // End of variables declaration//GEN-END:variables
    private Enum[] metrics;
    private JTextField[] fieldsMetrics;
    private List<DetectionStrategy> detectionStrategies;
    private JPanel jPanel;
    private FilterSystemForm mainScreen;
}
