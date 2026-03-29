package centsible.frames.user;

import centsible.functions.UserFunctions;

/**
 *
 * @author Venthings
 */
public class PayBillWhere extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    
    UserFunctions uf;
    
    public PayBillWhere() {
        initComponents();
        setLocationRelativeTo(null);
        uf = new UserFunctions();
        lblBill1.setIcon(UserFunctions.bill1);
        lblBill2.setIcon(UserFunctions.bill2);
        lblBillType.setIcon(UserFunctions.billType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBill1 = new javax.swing.JLabel();
        lblBill2 = new javax.swing.JLabel();
        lblBillType = new javax.swing.JLabel();
        lblSirkol = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 798));
        setSize(new java.awt.Dimension(1366, 798));

        jPanel1.setBackground(new java.awt.Color(12, 150, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 798));
        jPanel1.setLayout(null);

        lblBill1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/meralco.png"))); // NOI18N
        lblBill1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBill1MouseClicked(evt);
            }
        });
        jPanel1.add(lblBill1);
        lblBill1.setBounds(370, 310, 230, 230);

        lblBill2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/beneco.png"))); // NOI18N
        lblBill2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBill2MouseClicked(evt);
            }
        });
        jPanel1.add(lblBill2);
        lblBill2.setBounds(770, 310, 230, 230);

        lblBillType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/elec.png"))); // NOI18N
        jPanel1.add(lblBillType);
        lblBillType.setBounds(80, 620, 110, 130);

        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        jPanel1.add(lblSirkol);
        lblSirkol.setBounds(300, 30, 770, 770);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        jPanel1.add(lblLogo);
        lblLogo.setBounds(40, 50, 210, 70);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack);
        lblBack.setBounds(1260, 700, 80, 80);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        new PayBillsChoice().setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblBill1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBill1MouseClicked
        uf.setBill(1);
        dispose();
        new FillInfoPayBills().setVisible(true);
    }//GEN-LAST:event_lblBill1MouseClicked

    private void lblBill2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBill2MouseClicked
        uf.setBill(2);
        dispose();
        new FillInfoPayBills().setVisible(true);
    }//GEN-LAST:event_lblBill2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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
            java.util.logging.Logger.getLogger(PayBillWhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayBillWhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayBillWhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayBillWhere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayBillWhere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBill1;
    private javax.swing.JLabel lblBill2;
    private javax.swing.JLabel lblBillType;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
