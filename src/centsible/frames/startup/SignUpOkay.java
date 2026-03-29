package centsible.frames.startup;

public class SignUpOkay extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    
    public SignUpOkay() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBackG = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblSignUpMessage = new javax.swing.JLabel();
        btnOk = new centsible.components.CustomButton();
        jPanel1 = new javax.swing.JPanel();
        lblGreetings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 47, 48));
        setUndecorated(true);
        setSize(new java.awt.Dimension(790, 585));

        lblBackG.setBackground(new java.awt.Color(3, 47, 48));
        lblBackG.setPreferredSize(new java.awt.Dimension(790, 542));
        lblBackG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lblBackG.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        lblSignUpMessage.setFont(new java.awt.Font("Lovelo Black", 0, 25)); // NOI18N
        lblSignUpMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUpMessage.setText("<html><center>Welcome to Centsible, Citicents!<BR><BR>Your sign-up was successful, and you're officially part of the Centsible community! <BR>Get ready to enjoy a smarter, simpler, and more secure way to manage your money.<BR><BR>Enjoy your journey with centsible,<BR> where every cents count!</html>");
        lblBackG.add(lblSignUpMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 620, 322));

        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OKAY");
        btnOk.setBorderColor(new java.awt.Color(12, 150, 156));
        btnOk.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnOk.setRadius(40);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        lblBackG.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 100, -1));

        jPanel1.setBackground(new java.awt.Color(3, 47, 48));
        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblBackG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        lblGreetings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGreetings.setForeground(new java.awt.Color(255, 255, 255));
        lblGreetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreetings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Logo (Light) 45.png"))); // NOI18N
        lblBackG.add(lblGreetings, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 40, 810, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBackG, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnOkActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(SignUpOkay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpOkay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpOkay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpOkay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpOkay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private centsible.components.CustomButton btnOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lblBackG;
    private javax.swing.JLabel lblGreetings;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSignUpMessage;
    // End of variables declaration//GEN-END:variables
}
