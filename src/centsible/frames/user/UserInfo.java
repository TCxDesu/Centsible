package centsible.frames.user;

import centsible.frames.startup.Login;
import centsible.functions.UserFunctions;
import javax.swing.JOptionPane;

public class UserInfo extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    
    UserFunctions uf;

    public UserInfo() {
        initComponents();
        setLocationRelativeTo(null);
        uf = new UserFunctions();
        uf.setUserInfo(lblNumber, lblName, lblUsername, lblEmailInfo, lblBirth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblBT = new javax.swing.JLabel();
        lblAccNam = new javax.swing.JLabel();
        lblAccNum = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmailInfo = new javax.swing.JLabel();
        lblLine = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblChangePass = new javax.swing.JLabel();
        lblBirth = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnLogout = new centsible.components.CustomButton();
        btnChangePass = new centsible.components.CustomButtonOTP();
        lblSirkol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 798));

        jPanel1.setBackground(new java.awt.Color(12, 150, 156));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblBT.setFont(new java.awt.Font("Lovelo Black", 0, 48)); // NOI18N
        lblBT.setForeground(new java.awt.Color(3, 47, 48));
        lblBT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBT.setText("account information");
        jPanel1.add(lblBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 580, 60));

        lblAccNam.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblAccNam.setForeground(new java.awt.Color(3, 47, 48));
        lblAccNam.setText("UserName:");
        jPanel1.add(lblAccNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        lblAccNum.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblAccNum.setForeground(new java.awt.Color(3, 47, 48));
        lblAccNum.setText("Account Number:");
        jPanel1.add(lblAccNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        lblEmail.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(3, 47, 48));
        lblEmail.setText("Email:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        lblDOB.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(3, 47, 48));
        lblDOB.setText("Date oF Birth:");
        jPanel1.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        lblName.setFont(new java.awt.Font("ITC Souvenir", 0, 23)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Raven Ariesgado");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, 40));

        lblNumber.setFont(new java.awt.Font("ITC Souvenir", 0, 23)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblNumber.setText("1234567");
        jPanel1.add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, -1, 40));

        lblUsername.setFont(new java.awt.Font("ITC Souvenir", 0, 23)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("ventenz");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, 40));

        lblEmailInfo.setFont(new java.awt.Font("ITC Souvenir", 0, 23)); // NOI18N
        lblEmailInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailInfo.setText("venthings@gmail.com");
        jPanel1.add(lblEmailInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, 40));
        jPanel1.add(lblLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 610, 10));

        lblFullName.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(3, 47, 48));
        lblFullName.setText("FULL NAME:");
        jPanel1.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        lblChangePass.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        lblChangePass.setForeground(new java.awt.Color(3, 47, 48));
        lblChangePass.setText("CHANGE PASSWORD:");
        jPanel1.add(lblChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        lblBirth.setFont(new java.awt.Font("ITC Souvenir", 0, 23)); // NOI18N
        lblBirth.setForeground(new java.awt.Color(255, 255, 255));
        lblBirth.setText("10/31/6969");
        jPanel1.add(lblBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, -1, 40));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, -1, -1));

        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOG OUT");
        btnLogout.setBorderColor(new java.awt.Color(12, 150, 156));
        btnLogout.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        btnLogout.setRadius(60);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 170, 50));

        btnChangePass.setText("CHANGE");
        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChangePass.setRadius(40);
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 140, 40));

        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        jPanel1.add(lblSirkol, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 0, -1, -1));

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
                .addContainerGap(1294, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        UserFunctions.logOut(this);
    }//GEN-LAST:event_lblXMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        new Homescreen(UserFunctions.username).setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        this.dispose();
        new ChangePassword(lblUsername.getText()).setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Would you "
                + "like to Log out?");

        if (x == JOptionPane.YES_OPTION) {
            uf.toLogout(lblNumber.getText());
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private centsible.components.CustomButtonOTP btnChangePass;
    private centsible.components.CustomButton btnLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccNam;
    private javax.swing.JLabel lblAccNum;
    private javax.swing.JLabel lblBT;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblChangePass;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailInfo;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
