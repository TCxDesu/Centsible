package centsible.frames.user;

import centsible.functions.SavingsFunction;
import centsible.functions.UserFunctions;

public class Savings extends javax.swing.JFrame {

    int xMouse = 0, yMouse = 0;
    
    SavingsFunction sf;
    
    public Savings() {
        initComponents();
        setLocationRelativeTo(null);
        sf = new SavingsFunction();
        sf.setFunds(UserFunctions.username, lblAmountFF, lblAmountOF, 
                lblAmount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAmountOF = new javax.swing.JLabel();
        lblAmountFF = new javax.swing.JLabel();
        lblPesoOF = new javax.swing.JLabel();
        lblPesoFF = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        LBLOF = new javax.swing.JLabel();
        lblFF = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblSirkol = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 150, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 798));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAmountOF.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        lblAmountOF.setForeground(new java.awt.Color(255, 255, 255));
        lblAmountOF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmountOF.setText("0.00");
        jPanel1.add(lblAmountOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 510, 90, -1));

        lblAmountFF.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        lblAmountFF.setForeground(new java.awt.Color(255, 255, 255));
        lblAmountFF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmountFF.setText("0.00");
        jPanel1.add(lblAmountFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 510, 100, -1));

        lblPesoOF.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        lblPesoOF.setForeground(new java.awt.Color(255, 255, 255));
        lblPesoOF.setText("PHP");
        jPanel1.add(lblPesoOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, -1, -1));

        lblPesoFF.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        lblPesoFF.setForeground(new java.awt.Color(255, 255, 255));
        lblPesoFF.setText("PHP");
        jPanel1.add(lblPesoFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        lblPeso.setFont(new java.awt.Font("ITC Souvenir", 0, 26)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(255, 255, 255));
        lblPeso.setText("PHP");
        jPanel1.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 60, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 700, -1, -1));

        LBLOF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/own funds.png"))); // NOI18N
        LBLOF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBLOFMouseClicked(evt);
            }
        });
        jPanel1.add(LBLOF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, -1, -1));

        lblFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/family funds.png"))); // NOI18N
        lblFF.setName(""); // NOI18N
        lblFF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFFMouseClicked(evt);
            }
        });
        jPanel1.add(lblFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        lblTotal.setFont(new java.awt.Font("Lovelo Black", 0, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(3, 47, 48));
        lblTotal.setText("TOTAL SAVINGS");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        lblAmount.setFont(new java.awt.Font("ITC Souvenir", 0, 26)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAmount.setText("0.00");
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 140, -1));

        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        jPanel1.add(lblSirkol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        UserFunctions.logOut(this);
    }//GEN-LAST:event_lblXMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void lblFFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFFMouseClicked
        this.dispose();
        sf.setBill(1);
        FundAction.choice = 1;
        new CheckFunds().setVisible(true);
    }//GEN-LAST:event_lblFFMouseClicked

    private void LBLOFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBLOFMouseClicked
        this.dispose();
        sf.setBill(2);
        FundAction.choice = 2;
        new CheckFunds().setVisible(true);
    }//GEN-LAST:event_LBLOFMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        this.dispose();
        new Homescreen(UserFunctions.username).setVisible(true);
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
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Savings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Savings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLOF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountFF;
    private javax.swing.JLabel lblAmountOF;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFF;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPesoFF;
    private javax.swing.JLabel lblPesoOF;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
