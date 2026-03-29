package centsible.frames.admin;

import centsible.functions.AdminFunction;
import centsible.functions.AuditFunction;
import centsible.functions.GeneralFunction;
import centsible.functions.UserFunctions;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class AccountTable extends javax.swing.JFrame {

    int index = 0;
    TableRowSorter<TableModel> sorter;
    List<RowSorter.SortKey> sortKeys;

    String searchBy = "";

    AdminFunction af;
    AuditFunction auf;

    DecimalFormat df;

    GeneralFunction gf;

    public AccountTable() {
        initComponents();
        setLocationRelativeTo(null);

        af = new AdminFunction();
        auf = new AuditFunction();
        gf = new GeneralFunction();

        setTable();

        df = new DecimalFormat("#,##0.00");

        sorter = new TableRowSorter<>(tblAccount.getModel());
        tblAccount.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popOptions = new javax.swing.JPopupMenu();
        changeStatus = new javax.swing.JMenuItem();
        addBalance = new javax.swing.JMenuItem();
        subtractBalance = new javax.swing.JMenuItem();
        deleteAccount = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        customButton1 = new centsible.components.CustomButton();
        scpTransaction = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbSort = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbOrder = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox<>();
        lblSirkol = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        changeStatus.setText("jMenuItem1");
        changeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStatusActionPerformed(evt);
            }
        });
        popOptions.add(changeStatus);

        addBalance.setText("Raise Balance");
        addBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBalanceActionPerformed(evt);
            }
        });
        popOptions.add(addBalance);

        subtractBalance.setText("Reduce Balance");
        subtractBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractBalanceActionPerformed(evt);
            }
        });
        popOptions.add(subtractBalance);

        deleteAccount.setText("Delete Account");
        deleteAccount.setActionCommand("Delete Account");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });
        popOptions.add(deleteAccount);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 798));

        jPanel1.setBackground(new java.awt.Color(12, 150, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 798));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Centsible 209 50.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        customButton1.setForeground(new java.awt.Color(255, 255, 255));
        customButton1.setText("PRINT");
        customButton1.setBorderColor(new java.awt.Color(12, 150, 156));
        customButton1.setFocusable(false);
        customButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 25)); // NOI18N
        customButton1.setRadius(60);
        customButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(customButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 140, 50));

        tblAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account Number", "Username", "Balance", "Account Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccount.setFocusable(false);
        tblAccount.setOpaque(false);
        tblAccount.setRowHeight(25);
        tblAccount.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tblAccount.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tblAccount.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAccount.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblAccount.getTableHeader().setReorderingAllowed(false);
        tblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAccountMouseReleased(evt);
            }
        });
        scpTransaction.setViewportView(tblAccount);

        jPanel1.add(scpTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 950, 450));

        jPanel2.setBackground(new java.awt.Color(3, 47, 48));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 30));

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

        jPanel3.setBackground(new java.awt.Color(12, 150, 156));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/icons8-search-32.png"))); // NOI18N

        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        jLabel2.setText("Sort By: ");

        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Number", "Username", "Balance", "Account Type", "Status" }));
        cmbSort.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSortItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        jLabel3.setText("Order: ");

        cmbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASCENDING", "DESCENDING" }));
        cmbOrder.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrderItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("ITC Souvenir", 0, 18)); // NOI18N
        jLabel4.setText("Search By: ");

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Number", "Username", "Balance", "Account Type", "Status" }));
        cmbSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSearchItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(cmbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cmbOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(cmbSort))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 950, 50));

        lblSirkol.setFont(new java.awt.Font("Source Serif Pro Semibold", 0, 26)); // NOI18N
        lblSirkol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Ground Circle 768 768.png"))); // NOI18N
        jPanel1.add(lblSirkol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userImages/Back Button 74 74.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 670, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void customButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton1ActionPerformed
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
        
        MessageFormat header = null;
        header = new MessageFormat(dtf.format(ldt));
        MessageFormat footer = new MessageFormat("Page {0}");

        try {
            tblAccount.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_customButton1ActionPerformed

    private void tblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountMouseClicked
        int temp = tblAccount.getSelectedRow();
        String order = cmbOrder.getSelectedItem() + "";

        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (temp == index) {
                af.setAccountTable(order, (DefaultTableModel) tblAccount.getModel());
                index = -1;
            } else {
                index = temp;
            }
        }
    }//GEN-LAST:event_tblAccountMouseClicked

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        String sort = cmbOrder.getSelectedItem() + "";
        String option = cmbSort.getSelectedItem() + "";
        String searchBy = cmbSearch.getSelectedItem() + "";
        String search = txtSearch.getText();

        af.searchAccount(sort, option, searchBy, search,
                (DefaultTableModel) tblAccount.getModel());
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void cmbSortItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSortItemStateChanged
        sortAccounts();
    }//GEN-LAST:event_cmbSortItemStateChanged

    private void cmbOrderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrderItemStateChanged
        sortAccounts();
    }//GEN-LAST:event_cmbOrderItemStateChanged

    private void cmbSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSearchItemStateChanged
        searchBy = cmbSearch.getSelectedItem() + "";
        txtSearch.setText("");
        sortAccounts();
    }//GEN-LAST:event_cmbSearchItemStateChanged

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        new AdminHomescreen(AdminFunction.adminID).setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void tblAccountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountMouseReleased
        int temp = tblAccount.getSelectedRow();
        String status = tblAccount.getValueAt(temp, 4) + "";

        if (evt.getButton() == MouseEvent.BUTTON3 && temp != -1) {
            if (status.equals("Blocked")) {
                changeStatus.setVisible(true);
                changeStatus.setText("Unblock Account");
            } else if (status.equals("Signed In")) {
                changeStatus.setVisible(false);
                deleteAccount.setVisible(false);
            } else {
                changeStatus.setVisible(true);
                changeStatus.setText("Block Account");
            }
            popOptions.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblAccountMouseReleased

    private void changeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeStatusActionPerformed
        String order = cmbOrder.getSelectedItem() + "";
        int temp = tblAccount.getSelectedRow();
        String status = tblAccount.getValueAt(temp, 4) + "";

        int index = Integer.parseInt(tblAccount.getValueAt(temp, 0) + "");

        if (status.equals("Blocked")) {
            GeneralFunction.list.get(index).setBlockCount(0);
            GeneralFunction.rewrite();
            af.setAccountTable(order, (DefaultTableModel) tblAccount
                    .getModel());
            JOptionPane.showMessageDialog(null, "Account has been unblocked.");
            auf.createAudit(tblAccount.getValueAt(temp, 1) + "", "Unblocked "
                    + "by Admin");

        } else if (status.equals("Not Blocked")) {
            GeneralFunction.list.get(index).setBlockCount(3);
            GeneralFunction.rewrite();
            af.setAccountTable(order, (DefaultTableModel) tblAccount
                    .getModel());
            JOptionPane.showMessageDialog(null, "Account has been blocked.");
            auf.createAudit(tblAccount.getValueAt(temp, 1) + "", "Blocked "
                    + "by Admin");
        }
    }//GEN-LAST:event_changeStatusActionPerformed

    private void addBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBalanceActionPerformed
        String order = cmbOrder.getSelectedItem() + "";
        int temp = tblAccount.getSelectedRow();
        int index = Integer.parseInt(tblAccount.getValueAt(temp, 0) + "");

        try {
            String input = JOptionPane.showInputDialog(null,
                    "Please enter amount to add: ");
            double in = Double.parseDouble(input.replaceAll(",", ""));

            if (in == 0.0) {
                JOptionPane.showMessageDialog(null, "Invalid Input.");
            } else {
                String balance = (tblAccount.getValueAt(temp, 2) + "")
                        .replaceAll(",", "");
                double amount = in;
                in = Double.parseDouble(balance) + in;

                GeneralFunction.list.get(index).setBalance(in);
                JOptionPane.showMessageDialog(null,
                        "Balance has been updated.");

                gf.writeTransaction(tblAccount.getValueAt(temp, 0) + "",
                        "Over the counter Cash In ", "+" + df.format(amount));

                auf.createAudit(tblAccount.getValueAt(temp, 1) + "",
                        "Cashed in " + df.format(amount) + " from Admin");

                GeneralFunction.rewrite();
                af.setAccountTable(order, (DefaultTableModel) 
                        tblAccount.getModel());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input must only be digits.");
            System.out.println(e);
        }
    }//GEN-LAST:event_addBalanceActionPerformed

    private void subtractBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractBalanceActionPerformed
        String order = cmbOrder.getSelectedItem() + "";
        int temp = tblAccount.getSelectedRow();
        int index = Integer.parseInt(tblAccount.getValueAt(temp, 0) + "");

        try {
            String input = JOptionPane.showInputDialog(null, "Please enter "
                    + "amount to deduct: ");
            double in = Double.parseDouble(input.replaceAll(",", ""));
            if (in == 0.0) {
                JOptionPane.showMessageDialog(null, "Invalid Input.");
            } else {
                String balance = (tblAccount.getValueAt(temp, 2) + "")
                        .replaceAll(",", "");
                double amount = in;
                in = Double.parseDouble(balance) - in;

                GeneralFunction.list.get(index).setBalance(in);
                JOptionPane.showMessageDialog(null,
                        "Balance has been updated.");

                gf.writeTransaction(tblAccount.getValueAt(temp, 0) + "",
                        "Over the counter Cash Out ", "-"
                        + df.format(amount));

                auf.createAudit(tblAccount.getValueAt(temp, 1) + "",
                        "Cashed out " + df.format(amount) + " from Admin");

                GeneralFunction.rewrite();
                af.setAccountTable(order, (DefaultTableModel) tblAccount.getModel());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Input must only be digits.");
            System.out.println(e);
        }
    }//GEN-LAST:event_subtractBalanceActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed
        int row = tblAccount.getSelectedRow();
        String order = cmbOrder.getSelectedItem() + "";

        String accountToDelete = tblAccount.getValueAt(row, 1) + "";

        String accLocation = System.getProperty("user.dir") + "\\Accounts\\";
        String transactionLocation = System.getProperty("user.dir")
                + "\\Transaction History\\";

        int message = JOptionPane.showConfirmDialog(null, "Would you like to "
                + "delete this account?");

        if (message == JOptionPane.YES_OPTION) {
            try {
                File f = new File(accLocation + tblAccount.getValueAt(row, 0)
                        + ".txt");
                File f2 = new File(transactionLocation + tblAccount
                        .getValueAt(row, 0) + ".txt");

                System.out.println(f.toString());
                if (f.exists() && f2.exists()) {
                    f.delete();
                    f2.delete();
                    JOptionPane.showMessageDialog(null, "Account has "
                            + "been deleted.");
                    auf.createAudit("Admin",
                            "Deleted " + accountToDelete + "'s Account.");
                    String account[] = gf.getListofAccounts();
                    gf.initAccInfo(account);
                    af.setAccountTable(order, (DefaultTableModel) tblAccount.getModel());
                }
            } catch (Exception e) {
                System.out.println("Error (deleteAccount): " + e);
            }
        }
    }//GEN-LAST:event_deleteAccountActionPerformed

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
            java.util.logging.Logger.getLogger(AccountTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AccountTable().setVisible(true);
            }
        });
    }

    public void setTable() {
        tblAccount.getTableHeader().setFont(new Font("Segoe UI",
                Font.BOLD, 14));
        tblAccount.getTableHeader().setOpaque(false);
        tblAccount.getTableHeader().setBackground(new Color(12, 150, 156));
        tblAccount.getTableHeader().setForeground(new Color(3, 47, 48));
        tblAccount.setRowHeight(25);

        tblAccount.setOpaque(false);
        ((DefaultTableCellRenderer) tblAccount.getDefaultRenderer(Object.class))
                .setBackground(new Color(12, 150, 156));
        tblAccount.setGridColor(new Color(0, 0, 0, 0));

        JTableHeader jth = tblAccount.getTableHeader();
        jth.setBackground(new Color(0, 0, 0, 0));

        scpTransaction.setBackground(new Color(0, 0, 0, 0));
        scpTransaction.setOpaque(false);
        scpTransaction.getViewport().setOpaque(false);
        scpTransaction.setBorder(BorderFactory.createEmptyBorder());

        af.setAccountTable(cmbOrder.getSelectedItem() + "", (DefaultTableModel) 
                tblAccount.getModel());
    }

    public void sortAccounts() {
        sortKeys = new ArrayList<>();

        String order = cmbOrder.getSelectedItem() + "";
        String sort = cmbSort.getSelectedItem() + "";

        if (order.equals("ASCENDING")) {
            if (sort.equals("Account Number")) {
                af.sortAccounts("ASCENDING", "Account Number",
                        (DefaultTableModel) tblAccount.getModel());
            } else if (sort.equals("Username")) {
                sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
            } else if (sort.equals("Balance")) {
                af.sortAccounts("ASCENDING", "Balance", (DefaultTableModel) tblAccount.getModel());
            } else if (sort.equals("Account Type")) {
                sortKeys.add(new RowSorter.SortKey(3, SortOrder.ASCENDING));
            } else if (sort.equals("Status")) {
                sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
            }
        } else if (order.equals("DESCENDING")) {
            if (sort.equals("Account Number")) {
                af.sortAccounts("DESCENDING", "Account Number",
                        (DefaultTableModel) tblAccount.getModel());
            } else if (sort.equals("Username")) {
                sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
            } else if (sort.equals("Balance")) {
                af.sortAccounts("DESCENDING", "Balance", (DefaultTableModel) tblAccount.getModel());
            } else if (sort.equals("Account Type")) {
                sortKeys.add(new RowSorter.SortKey(3, SortOrder.DESCENDING));
            } else if (sort.equals("Status")) {
                sortKeys.add(new RowSorter.SortKey(4, SortOrder.DESCENDING));
            }
        }
        sorter.setSortKeys(sortKeys);
        sorter.sort();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addBalance;
    private javax.swing.JMenuItem changeStatus;
    private javax.swing.JComboBox<String> cmbOrder;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JComboBox<String> cmbSort;
    private centsible.components.CustomButton customButton1;
    private javax.swing.JMenuItem deleteAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblSirkol;
    private javax.swing.JLabel lblX;
    private javax.swing.JPopupMenu popOptions;
    private javax.swing.JScrollPane scpTransaction;
    private javax.swing.JMenuItem subtractBalance;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
