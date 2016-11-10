/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import metrics.Granulatiry;
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
public class PutThresholdForm extends javax.swing.JFrame {

    /**
     * Creates new form PutThreshold
     *
     * @param nameDetectionStrategy
     * @param granularity
     * @param expression
     */
    public PutThresholdForm(String nameDetectionStrategy, String granularity, String expression, FilterSystemForm mainScreen) {
        this.nameDetectionStrategy = nameDetectionStrategy;
        this.granularity = granularity;
        this.expression = expression;
        this.mainScreen = mainScreen;
        identifyMetrics();
        initComponents();
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
        jLabelNameDetectionStrategy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelGranularityDetectionStrategy = new javax.swing.JLabel();
        jButtonDone = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jScrollPanePutThreshold = new javax.swing.JScrollPane();

        setTitle("FindSmells");
        setResizable(false);

        jPanelMain.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelDetectionStrategy.setText("Detection Strategy:");

        jLabelNameDetectionStrategy.setText(this.nameDetectionStrategy);

        jLabel1.setText("Granularity:");

        jLabelGranularityDetectionStrategy.setText(this.granularity);

        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        initMetrics();
        jScrollPanePutThreshold.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Define the threshold to the metrics"));

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDone))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDetectionStrategy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNameDetectionStrategy)
                            .addComponent(jLabelGranularityDetectionStrategy)
                            .addComponent(jScrollPanePutThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetectionStrategy)
                    .addComponent(jLabelNameDetectionStrategy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelGranularityDetectionStrategy))
                .addGap(28, 28, 28)
                .addComponent(jScrollPanePutThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDone)
                    .addComponent(jButtonBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        if (inputValuesToStrategy()) {
            DetectionStrategy detectionStrategy = new DetectionStrategy(this.nameDetectionStrategy, Granulatiry.valueOf(this.granularity), this.expression);
            DAO dao = new DetectionStrategyDAO();
            dao.register(detectionStrategy);
            JOptionPane.showMessageDialog(this, "Detection strategy successfully registered!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            this.mainScreen.refreshDetectionStrategies();
            CreateDetectionStrategyForm frame = new CreateDetectionStrategyForm();
            frame.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        CreateDetectionStrategyForm createDetectionStrategy = new CreateDetectionStrategyForm(nameDetectionStrategy, granularity, expression, this.mainScreen);
        createDetectionStrategy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private boolean inputValuesToStrategy() {
        String validator = "0987654321";
        String exp = this.expression;
        String[] split = exp.split("VALUE");
        for (int index = 0; index < (split.length - 1); index++) {
            if (!this.fieldsMetrics[index].getText().isEmpty()) {
                if (validateNumber(this.fieldsMetrics[index].getText())) {
                    exp = exp.replaceFirst("VALUE", this.fieldsMetrics[index].getText());
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
        this.expression = exp;
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

    private void initMetrics() {
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

            JTextField text = new JTextField();
            text.setSize(new Dimension(10, 10));
            this.fieldsMetrics[row] = text;
            c.weightx = 1;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 10;
            c.gridy = row;
            p.add(text, c);
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

        this.jScrollPanePutThreshold = new JScrollPane(p);
    }

    private void identifyMetrics() {
        String[] split = this.expression.split("VALUE");
        this.metrics = new Enum[split.length - 1];
        this.fieldsMetrics = new JTextField[split.length - 1];
        switch (this.granularity) {
            case "Method":
                identifyMetricMethod(split);
                break;
            case "Package":
                identifyMetricPackage(split);
                break;
            case "Type":
                identifyMetricType(split);
                break;
        }
    }

    private void identifyMetricMethod(String[] split) {
        for (int index = 0; index < (split.length - 1); index++) {
            for (MetricMethod metric : MetricMethod.values()) {
                if (split[index].contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    break;
                }
            }
        }
    }

    private void identifyMetricPackage(String[] split) {
        for (int index = 0; index < (split.length - 1); index++) {
            for (MetricPackage metric : MetricPackage.values()) {
                if (split[index].contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    break;
                }
            }
        }
    }

    private void identifyMetricType(String[] split) {
        for (int index = 0; index < (split.length - 1); index++) {
            for (MetricType metric : MetricType.values()) {
                if (split[index].contains(metric.toString().toLowerCase())) {
                    this.metrics[index] = metric;
                    break;
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDetectionStrategy;
    private javax.swing.JLabel jLabelGranularityDetectionStrategy;
    private javax.swing.JLabel jLabelNameDetectionStrategy;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPanePutThreshold;
    // End of variables declaration//GEN-END:variables
    private Enum[] metrics;
    private JTextField[] fieldsMetrics;
    private String expression;
    private String granularity;
    private String nameDetectionStrategy;
    private FilterSystemForm mainScreen;
}
