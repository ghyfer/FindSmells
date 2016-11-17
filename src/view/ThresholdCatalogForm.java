/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author bruno
 */
public class ThresholdCatalogForm extends javax.swing.JFrame {

    /**
     * Creates new form ThresholdCatalogForm
     */
    public ThresholdCatalogForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void image() {
            ImageIcon image = new ImageIcon(getClass().getResource("../image/catalog.png"));
            this.jLabel1 = new JLabel(image);
            jPanelThreshold.add(this.jLabel1);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelThreshold = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReference = new javax.swing.JTextArea();

        setResizable(false);

        jPanelThreshold.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");
        image();

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setText("Catalog of Threshold");

        jTextAreaReference.setEditable(false);
        jTextAreaReference.setColumns(20);
        jTextAreaReference.setRows(3);
        jTextAreaReference.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextAreaReference.setSelectionColor(new java.awt.Color(255, 255, 255));
        String reference = "Filó,  T.  G.  S.  and  da  Silva  Bigonha,  M.  A.  and  Ferreira,  K.  A.  M.  A  catalogue\n"
        + "of thresholds  for object-oriented software metrics. The First Int. Conf. on Advances\n"
        + "and Trends in Software Engineering, 2015.";

        jTextAreaReference.setText(reference);
        jScrollPane1.setViewportView(jTextAreaReference);

        javax.swing.GroupLayout jPanelThresholdLayout = new javax.swing.GroupLayout(jPanelThreshold);
        jPanelThreshold.setLayout(jPanelThresholdLayout);
        jPanelThresholdLayout.setHorizontalGroup(
            jPanelThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThresholdLayout.createSequentialGroup()
                .addGroup(jPanelThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThresholdLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanelThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelThresholdLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabelTitle))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelThresholdLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelThresholdLayout.setVerticalGroup(
            jPanelThresholdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThresholdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelThreshold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelThreshold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelThreshold;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaReference;
    // End of variables declaration//GEN-END:variables
}
