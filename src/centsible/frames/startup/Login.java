package centsible.frames.startup;

import centsible.components.CustomFont;
import centsible.functions.GeneralFunction;
import centsible.functions.LoginFunction;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse, flag = 0;

    String username, password;

    LoginFunction lf;
    
    public Login() {
        initComponents();
        setComps();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dragFrame = new javax.swing.JPanel();
        pnlGreen = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        pnlWhite = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        pnlUsername = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pnlPassword = new javax.swing.JPanel();
        lblShowPassword = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblForgot = new javax.swing.JLabel();
        btnSignin = new centsible.components.CustomButton();
        jLabel2 = new javax.swing.JLabel();
        pnlSignup = new javax.swing.JPanel();
        lblGreetings = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        lblMessage2 = new javax.swing.JLabel();
        btnSignup = new centsible.components.CustomButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dragFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragFrameMouseDragged(evt);
            }
        });
        dragFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragFrameMousePressed(evt);
            }
        });
        dragFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlGreen.setBackground(new java.awt.Color(3, 47, 48));
        pnlGreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlGreen.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 40));

        lblMinimize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        pnlGreen.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 40));

        dragFrame.add(pnlGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 370, 540));

        pnlWhite.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlWhiteLayout = new javax.swing.GroupLayout(pnlWhite);
        pnlWhite.setLayout(pnlWhiteLayout);
        pnlWhiteLayout.setHorizontalGroup(
            pnlWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        pnlWhiteLayout.setVerticalGroup(
            pnlWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        dragFrame.add(pnlWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 420, 550));

        getContentPane().add(dragFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLoginMouseClicked(evt);
            }
        });
        pnlLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlLoginKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlLoginKeyReleased(evt);
            }
        });

        pnlUsername.setBackground(new java.awt.Color(12, 150, 156));
        pnlUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlUsername.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(12, 150, 156));
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUser.setText("Enter Username");
        txtUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserCaretUpdate(evt);
            }
        });
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        pnlUsername.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (1).png"))); // NOI18N
        pnlUsername.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 40));

        pnlPassword.setBackground(new java.awt.Color(12, 150, 156));
        pnlPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        lblShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowPasswordMouseClicked(evt);
            }
        });
        pnlPassword.add(lblShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 40));

        txtPass.setBackground(new java.awt.Color(12, 150, 156));
        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPass.setText("Enter Password");
        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPassCaretUpdate(evt);
            }
        });
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        pnlPassword.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock.png"))); // NOI18N
        pnlPassword.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 40));

        lblForgot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblForgot.setText("Forgot Password?");
        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
        });

        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign in");
        btnSignin.setRadius(50);
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Picture1 (3).png"))); // NOI18N

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblForgot))))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pnlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblForgot)
                .addGap(44, 44, 44)
                .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 420, 550));

        pnlSignup.setBackground(new java.awt.Color(3, 47, 48));

        lblGreetings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGreetings.setForeground(new java.awt.Color(255, 255, 255));
        lblGreetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreetings.setText("Hello, Dear Citicents!");

        lblMessage1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMessage1.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("Be part of our community, sign up your");

        lblMessage2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMessage2.setForeground(new java.awt.Color(255, 255, 255));
        lblMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage2.setText("personal details and start your journey with us ");

        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSignupLayout = new javax.swing.GroupLayout(pnlSignup);
        pnlSignup.setLayout(pnlSignupLayout);
        pnlSignupLayout.setHorizontalGroup(
            pnlSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGreetings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblMessage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignupLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        pnlSignupLayout.setVerticalGroup(
            pnlSignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignupLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblGreetings)
                .addGap(29, 29, 29)
                .addComponent(lblMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage2)
                .addGap(72, 72, 72)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        getContentPane().add(pnlSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 370, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragFrameMouseDragged

    private void dragFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragFrameMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        GeneralFunction.rewrite();
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordMouseClicked
        flag = lf.showPassword(flag, txtPass, lblShowPassword);
    }//GEN-LAST:event_lblShowPasswordMouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        lf.usernameFocusGained(txtUser, username);
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        username = lf.usernameFocusLost(txtUser, username);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        lf.passFocusGained(txtPass, password, flag);
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        password = lf.passFocusLost(txtPass, password);
    }//GEN-LAST:event_txtPassFocusLost

    private void txtUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserCaretUpdate
        username = txtUser.getText();
    }//GEN-LAST:event_txtUserCaretUpdate

    private void txtPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPassCaretUpdate
        password = txtPass.getText();
    }//GEN-LAST:event_txtPassCaretUpdate

    private void pnlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLoginMouseClicked
        pnlLogin.requestFocus();
    }//GEN-LAST:event_pnlLoginMouseClicked

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        lf.checkKeyPressed(evt, txtUser, txtPass, this);
    }//GEN-LAST:event_txtUserKeyPressed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        lf.validation(txtUser, txtPass, this);
    }//GEN-LAST:event_btnSigninActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        lf.checkKeyPressed(evt, txtUser, txtPass, this);
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        new Signup().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        dispose();
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_lblForgotMouseClicked

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        lf.checkKeyReleased(evt);
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        lf.checkKeyReleased(evt);
    }//GEN-LAST:event_txtPassKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        lf.checkKeyPressed(evt, txtUser, txtPass, this);
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        lf.checkKeyReleased(evt);
    }//GEN-LAST:event_formKeyReleased

    private void pnlLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlLoginKeyPressed
        lf.checkKeyPressed(evt, txtUser, txtPass, this);
    }//GEN-LAST:event_pnlLoginKeyPressed

    private void pnlLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlLoginKeyReleased
        lf.checkKeyReleased(evt);
    }//GEN-LAST:event_pnlLoginKeyReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void setComps() {
        this.setLocationRelativeTo(null);

        pnlLogin.requestFocus();
        CustomFont cf = new CustomFont();

        lf = new LoginFunction(txtUser, txtPass);
        GeneralFunction gf = new GeneralFunction();

        cf.setFont(pnlLogin, 18);
        cf.setFont(pnlUsername, 18);
        cf.setFont(pnlPassword, 18);
        cf.setFont(pnlSignup, 18);
        cf.setFont(lblGreetings, 18);
        cf.setFont(lblMessage1, 16);
        cf.setFont(lblMessage2, 16);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private centsible.components.CustomButton btnSignin;
    private centsible.components.CustomButton btnSignup;
    private javax.swing.JPanel dragFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblGreetings;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblShowPassword;
    private javax.swing.JPanel pnlGreen;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlSignup;
    private javax.swing.JPanel pnlUsername;
    private javax.swing.JPanel pnlWhite;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
