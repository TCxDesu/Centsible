package centsible.frames.startup;

import centsible.functions.OTPFunctions;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class OTPVerification extends javax.swing.JFrame {

    public static JFrame ref;

    OTPFunctions otpf;

    String code = "";

    int xMouse = 0, yMouse = 0;

    public OTPVerification() {
        initComponents();
        setLocationRelativeTo(null);
        otpf = new OTPFunctions(txtOTP, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBackG = new javax.swing.JPanel();
        lblOTP = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblVerification = new javax.swing.JLabel();
        txtOTP = new javax.swing.JTextField();
        btnConfirm = new centsible.components.CustomButton();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblSirkol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 47, 48));
        setUndecorated(true);
        setSize(new java.awt.Dimension(790, 585));

        lblBackG.setBackground(new java.awt.Color(12, 150, 156));
        lblBackG.setPreferredSize(new java.awt.Dimension(790, 542));
        lblBackG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOTP.setFont(new java.awt.Font("Lovelo Black", 0, 22)); // NOI18N
        lblOTP.setForeground(new java.awt.Color(3, 47, 48));
        lblOTP.setText("Confirmation OTP");
        lblBackG.add(lblOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 230, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        lblBackG.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblVerification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/verMess.png"))); // NOI18N
        lblBackG.add(lblVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtOTP.setFont(new java.awt.Font("ITC Souvenir", 0, 36)); // NOI18N
        txtOTP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOTPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOTPKeyTyped(evt);
            }
        });
        lblBackG.add(txtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 320, 50));

        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("CONFIRM");
        btnConfirm.setBorderColor(new java.awt.Color(12, 150, 156));
        btnConfirm.setFocusable(false);
        btnConfirm.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnConfirm.setRadius(60);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        lblBackG.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 170, 60));

        jPanel2.setBackground(new java.awt.Color(3, 47, 48));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 30));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        lblX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/x.png"))); // NOI18N
        lblX.setPreferredSize(new java.awt.Dimension(30, 30));
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
        });

        lblMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Minimize.png"))); // NOI18N
        lblMin.setToolTipText("");
        lblMin.setPreferredSize(new java.awt.Dimension(30, 30));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(878, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(lblMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblBackG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        lblBackG.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, -1, -1));

        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        lblBackG.add(lblSirkol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackG, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackG, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        dispose();
    }//GEN-LAST:event_lblXMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void txtOTPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOTPKeyTyped
        char c = evt.getKeyChar();
        if (txtOTP.getText().length() < 6) {
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtOTPKeyTyped

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        code = txtOTP.getText();
        otpf.checkOTP(code);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        dispose();
        ref.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void txtOTPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOTPKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            code = txtOTP.getText();
            otpf.checkOTP(code);
        }
    }//GEN-LAST:event_txtOTPKeyPressed

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
            java.util.logging.Logger.getLogger(OTPVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OTPVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OTPVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OTPVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OTPVerification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private centsible.components.CustomButton btnConfirm;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JPanel lblBackG;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblOTP;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblVerification;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextField txtOTP;
    // End of variables declaration//GEN-END:variables
}
