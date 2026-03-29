package centsible.frames.user;

import centsible.functions.UserFunctions;

public class PayBillsChoice extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    
    UserFunctions uf;
    
    public PayBillsChoice() {
        initComponents();
        setLocationRelativeTo(null);
        uf = new UserFunctions();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblIB = new javax.swing.JLabel();
        lblWB = new javax.swing.JLabel();
        lblEB = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblSirkol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 798));

        jPanel1.setBackground(new java.awt.Color(12, 150, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 798));
        jPanel1.setLayout(null);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack);
        lblBack.setBounds(1270, 700, 74, 74);

        lblIB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/internet.png"))); // NOI18N
        lblIB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIBMouseClicked(evt);
            }
        });
        jPanel1.add(lblIB);
        lblIB.setBounds(910, 330, 210, 211);

        lblWB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/water.png"))); // NOI18N
        lblWB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWBMouseClicked(evt);
            }
        });
        jPanel1.add(lblWB);
        lblWB.setBounds(580, 330, 210, 211);

        lblEB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/electric.png"))); // NOI18N
        lblEB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEBMouseClicked(evt);
            }
        });
        jPanel1.add(lblEB);
        lblEB.setBounds(250, 330, 210, 211);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        jPanel1.add(lblLogo);
        lblLogo.setBounds(40, 50, 209, 70);

        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        jPanel1.add(lblSirkol);
        lblSirkol.setBounds(300, 30, 860, 770);

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
                .addContainerGap(1298, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEBMouseClicked
        uf.billChoice(1);
        dispose();
        new PayBillWhere().setVisible(true);
    }//GEN-LAST:event_lblEBMouseClicked

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

    private void lblWBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWBMouseClicked
        uf.billChoice(2);
        this.dispose();
        new PayBillWhere().setVisible(true);
    }//GEN-LAST:event_lblWBMouseClicked

    private void lblIBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIBMouseClicked
        uf.billChoice(3);
        this.dispose();
        new PayBillWhere().setVisible(true);
    }//GEN-LAST:event_lblIBMouseClicked

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
            java.util.logging.Logger.getLogger(PayBillsChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayBillsChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayBillsChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayBillsChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PayBillsChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblEB;
    private javax.swing.JLabel lblIB;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblWB;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
