/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.bai2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JosCongQuy
 */
public class NewJFrame extends javax.swing.JFrame {
    public static DecimalFormat df = new DecimalFormat("#.###");
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstnumber = new javax.swing.JTextField();
        txtSecondnumber = new javax.swing.JTextField();
        txtResult = new javax.swing.JTextField();
        Tong = new javax.swing.JButton();
        Hieu = new javax.swing.JButton();
        Tich = new javax.swing.JButton();
        thương = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Xây dựng Ứng Dụng Máy Tính");

        jLabel2.setText("First number");

        jLabel3.setText("Second number");

        jLabel4.setText("Result");

        Tong.setText("+");
        Tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TongActionPerformed(evt);
            }
        });

        Hieu.setText("-");
        Hieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HieuActionPerformed(evt);
            }
        });

        Tich.setText("*");
        Tich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TichActionPerformed(evt);
            }
        });

        thương.setText("/");
        thương.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thươngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSecondnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtFirstnumber)
                            .addComponent(txtResult)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tong)
                                .addGap(18, 18, 18)
                                .addComponent(Hieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(thương))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSecondnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tich)
                    .addComponent(thương)
                    .addComponent(Hieu)
                    .addComponent(Tong))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thươngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thươngActionPerformed
        // TODO add your handling code here:
        Float so1, so2;
        double ketqua;
        if (check()) {
            so1 = Float.parseFloat(txtFirstnumber.getText());
            so2 = Float.parseFloat(txtSecondnumber.getText());
            ketqua = so1 / so2;
            txtResult.setText(df.format(Double.valueOf(ketqua)) + "");
        }
    }//GEN-LAST:event_thươngActionPerformed

    private void TongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TongActionPerformed
        // TODO add your handling code here:
        float so1, so2;
        double ketqua;
        
        if (check()) {
            so1 = Float.parseFloat(txtFirstnumber.getText());
            so2 = Float.parseFloat(txtSecondnumber.getText());
            ketqua = so1 + so2;
            txtResult.setText(df.format(ketqua) + "");
        }
    }//GEN-LAST:event_TongActionPerformed

    private void HieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HieuActionPerformed
        // TODO add your handling code here:
        float so1, so2;
        double ketqua;
        if (check()) {
            so1 = Float.parseFloat(txtFirstnumber.getText());
            so2 = Float.parseFloat(txtSecondnumber.getText());
            ketqua = so1 - so2;
            txtResult.setText(ketqua + "");
        }
    }//GEN-LAST:event_HieuActionPerformed

    private void TichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TichActionPerformed
        // TODO add your handling code here:
        float so1, so2;
        double ketqua;
        if (check()) {
            so1 = Float.parseFloat(txtFirstnumber.getText());
            so2 = Float.parseFloat(txtSecondnumber.getText());
            ketqua = so1 * so2;
            txtResult.setText(ketqua + "");
        }
    }//GEN-LAST:event_TichActionPerformed
    public boolean check() {
        if (txtFirstnumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Firstnumber không được để trống");
            txtFirstnumber.requestFocus();
            return false;
        }
        if (txtSecondnumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Secondnumber không được để trống");
            txtSecondnumber.requestFocus();
            return false;
        } else {
            return true;
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        df.setRoundingMode(RoundingMode.CEILING);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hieu;
    private javax.swing.JButton Tich;
    private javax.swing.JButton Tong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton thương;
    private javax.swing.JTextField txtFirstnumber;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSecondnumber;
    // End of variables declaration//GEN-END:variables
}
