package centsible.functions;

import centsible.datas.Accounts;
import centsible.datas.AuditTrails;
import centsible.datas.TransactionHistory;
import static centsible.functions.GeneralFunction.transaction;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class AdminFunction {

    public static LinkedList<AuditTrails> auditTrails;

    public static String adminID;

    public void setAudits() {
        EncryptionDecryption ed = new EncryptionDecryption();

        String location = System.getProperty("user.dir") + "\\Audit\\";
        auditTrails = new LinkedList<>();

        File f = new File(location + "Actions.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while (br.ready()) {
                String dateTime = ed.decrypt(br.readLine());
                String action = ed.decrypt(br.readLine());
                String name = ed.decrypt(br.readLine());

                AuditTrails at = new AuditTrails(dateTime, action, name);
                AdminFunction.auditTrails.add(at);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error (setAudits): " + e);
        }
    }

    public void sortAmount(String sort, DefaultTableModel tbl) {
        String[] row;

        tbl.setRowCount(0);

        LinkedList<TransactionHistory> tempTransaction = transaction;

        Collections.sort(tempTransaction, new Comparator<TransactionHistory>() {
            @Override
            public int compare(TransactionHistory s1, TransactionHistory s2) {
                return Double.compare(Double.parseDouble(s1.getAmount().
                        replaceAll(",", "")), Double.parseDouble(s2.getAmount()
                        .replaceAll(",", "")));
            }
        });
        if (sort.equals("ASCENDING")) {
            for (int i = 0; i < tempTransaction.size(); i++) {
                if (tempTransaction.get(i).getAccID()
                        .equals(UserFunctions.userID)) {

                    row = new String[3];
                    row[0] = tempTransaction.get(i).getDateTime();
                    row[1] = tempTransaction.get(i).getTransaction();
                    row[2] = tempTransaction.get(i).getAmount();
                    tbl.addRow(row);

                }
            }
        } else {
            for (int i = tempTransaction.size() - 1; i > -1; i--) {
                if (tempTransaction.get(i).getAccID()
                        .equals(UserFunctions.userID)) {

                    row = new String[3];
                    row[0] = tempTransaction.get(i).getDateTime();
                    row[1] = tempTransaction.get(i).getTransaction();
                    row[2] = tempTransaction.get(i).getAmount();
                    tbl.addRow(row);

                }
            }
        }
    }

    public void setAccountTable(String sort, DefaultTableModel table) {
        GeneralFunction gf = new GeneralFunction();

        String[] accounts = gf.getListofAccounts();
        gf.initAccInfo(accounts);

        DecimalFormat df = new DecimalFormat("#,##0.00");
        table.setRowCount(0);
        
        LinkedList <Accounts> tempList = GeneralFunction.list;

        String[] row;
        if (sort.equals("ASCENDING")) {
            for (Accounts a : tempList) {
                row = new String[5];
                row[0] = a.getAccID();
                row[1] = a.getUsername();
                if (a.getAccountType() == 1) {
                    row[3] = "---------";
                } else {
                    row[2] = df.format(a.getBalance());
                }
                if (a.getAccountType() == 1) {
                    row[3] = "Admin";
                } else {
                    row[3] = "User";
                }
                if (a.getBlockCount() == 3) {
                    row[4] = "Blocked";
                } else if (a.getLoginStatus() == 1) {
                    row[4] = "Signed In";
                } else {
                    row[4] = "Not Blocked";
                }
                table.addRow(row);
            }
        } else {
            for (int i = tempList.size() - 1; i > -1; i--) {
                row = new String[5];
                row[0] = tempList.get(i).getAccID();
                row[1] = tempList.get(i).getUsername();
                if (tempList.get(i).getAccountType() == 1) {
                    row[3] = "---------";
                } else {
                    row[2] = df.format(GeneralFunction.list.get(i)
                            .getBalance());
                }
                if (tempList.get(i).getAccountType() == 1) {
                    row[3] = "Admin";
                } else {
                    row[3] = "User";
                }
                if (tempList.get(i).getBlockCount() == 3) {
                    row[4] = "Blocked";
                } else if (tempList.get(i).getLoginStatus() == 1) {
                    row[4] = "Signed In";
                } else {
                    row[4] = "Not Blocked";
                }
                table.addRow(row);
            }
        }
    }

    public void setAdminInfo(JLabel accNum, JLabel fullName, JLabel username,
            JLabel email, JLabel dateOfBirth) {
        if (AdminFunction.adminID.equals("Power Admin")) {
            accNum.setText("Admin123");
            fullName.setText("POWER ADMIN");
            username.setText("-----------");
            email.setText("-----------");
            dateOfBirth.setText("-----------");
        } else {
            for (Accounts a : GeneralFunction.list) {
                if (a.getAccID().equals(AdminFunction.adminID)) {
                    accNum.setText(a.getAccID());
                    fullName.setText(a.getFullName());
                    username.setText(a.getUsername());
                    email.setText(a.getEmail());
                    dateOfBirth.setText(a.getBirthdate());
                    break;
                }
            }
        }
    }

    public void searchAccount(String sort, String option, String searchBy,
            String search, DefaultTableModel tbl) {
        String[] row;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        tbl.setRowCount(0);

        LinkedList<Accounts> tempAccount = GeneralFunction.list;

        if (sort.equals("ASCENDING")) {
            for (int i = 0; i < tempAccount.size(); i++) {
                if (searchBy.equals("Account Number")) {
                    if (tempAccount.get(i).getAccID().contains(search)) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Username")) {
                    if (tempAccount.get(i).getUsername()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Balance")) {
                    if ((tempAccount.get(i).getBalance() + "").replaceAll(",",
                            "").contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Account Type")) {
                    String tempSearch = "";
                    if (tempAccount.get(i).getAccountType() == 0) {
                        tempSearch = "User";
                    } else {
                        tempSearch = "Admin";
                    }
                    if (tempSearch.toLowerCase().contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Status")) {
                    String tempSearch = "";
                    if (tempAccount.get(i).getBlockCount() == 0) {
                        tempSearch = "NOT BLOCKED";
                    } else if (tempAccount.get(i).getLoginStatus() == 1) {
                        tempSearch = "SIGNED IN";
                    } else {
                        tempSearch = "BLOCKED";
                    }
                    if (tempSearch.contains(search.toUpperCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                }
            }
        } else {
            for (int i = tempAccount.size() - 1; i > -1; i--) {
                if (searchBy.equals("Account ID")) {
                    if (tempAccount.get(i).getAccID().contains(search)) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Username")) {
                    if (tempAccount.get(i).getUsername()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Balance")) {
                    if ((tempAccount.get(i).getBalance() + "")
                            .replaceAll(",", "").contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Account Type")) {
                    String tempSearch = "";
                    if (tempAccount.get(i).getAccountType() == 0) {
                        tempSearch = "User";
                    } else {
                        tempSearch = "Admin";
                    }
                    if (tempSearch.toLowerCase().contains(search.toLowerCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Status")) {
                    String tempSearch = "";
                    if (tempAccount.get(i).getBlockCount() == 0) {
                        tempSearch = "NOT BLOCKED";
                    } else if (tempAccount.get(i).getLoginStatus() == 1) {
                        tempSearch = "SIGNED IN";
                    } else {
                        tempSearch = "BLOCKED";
                    }
                    if (tempSearch.contains(search.toUpperCase())) {
                        row = new String[5];
                        row[0] = tempAccount.get(i).getAccID();
                        row[1] = tempAccount.get(i).getUsername();
                        row[2] = df.format(tempAccount.get(i).getBalance());
                        if (tempAccount.get(i).getAccountType() == 1) {
                            row[3] = "Admin";
                        } else {
                            row[3] = "User";
                        }
                        if (tempAccount.get(i).getBlockCount() == 3) {
                            row[4] = "Blocked";
                        } else if (tempAccount.get(i).getLoginStatus() == 1) {
                            row[4] = "Signed In";
                        } else {
                            row[4] = "Not Blocked";
                        }
                        tbl.addRow(row);
                    }
                }
            }
        }
    }

    public void searchAudit(String sort, String option, String searchBy,
            String search, DefaultTableModel tbl) {
        String[] row;

        tbl.setRowCount(0);

        LinkedList<AuditTrails> tempAudit = auditTrails;

        if (sort.equals("ASCENDING")) {
            for (int i = 0; i < auditTrails.size(); i++) {
                if (searchBy.equals("Name")) {
                    if (tempAudit.get(i).getName()
                            .replaceAll(",", "").contains(search)) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Action")) {
                    if (tempAudit.get(i).getTransaction()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                } else {
                    if (tempAudit.get(i).getDateTime()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                }
            }
        } else {
            for (int i = tempAudit.size() - 1; i > -1; i--) {
                if (searchBy.equals("Name")) {
                    if (tempAudit.get(i).getName()
                            .replaceAll(",", "").contains(search)) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Action")) {
                    if (tempAudit.get(i).getTransaction()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                } else {
                    if (tempAudit.get(i).getDateTime()
                            .toLowerCase()
                            .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempAudit.get(i).getDateTime();
                        row[1] = tempAudit.get(i).getTransaction();
                        row[2] = tempAudit.get(i).getName();
                        tbl.addRow(row);
                    }
                }
            }
        }
    }

    public void sortAccounts(String sort, String option, DefaultTableModel tbl) {
        String[] row;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        tbl.setRowCount(0);

        LinkedList<Accounts> tempAccount = GeneralFunction.list;

        if (option.equals("Balance")) {
            Collections.sort(tempAccount, new Comparator<Accounts>() {
                @Override
                public int compare(Accounts s1, Accounts s2) {
                    return Double.compare(s1.getBalance(), s2.getBalance());
                }
            });
        } else {
            Collections.sort(tempAccount, new Comparator<Accounts>() {
                @Override
                public int compare(Accounts s1, Accounts s2) {
                    return Double.compare(Double.parseDouble(s1.getAccID()),
                            Double.parseDouble(s2.getAccID()));
                }
            });
        }
        if (sort.equals("ASCENDING")) {
            for (int i = 0; i < tempAccount.size(); i++) {
                row = new String[5];
                row[0] = tempAccount.get(i).getAccID();
                row[1] = tempAccount.get(i).getUsername();
                row[2] = df.format(tempAccount.get(i).getBalance());
                if (tempAccount.get(i).getAccountType() == 1) {
                    row[3] = "Admin";
                } else {
                    row[3] = "User";
                }
                if (tempAccount.get(i).getBlockCount() == 3) {
                    row[4] = "Blocked";
                } else if (tempAccount.get(i).getLoginStatus() == 1) {
                    row[4] = "Signed In";
                } else {
                    row[4] = "Not Blocked";
                }
                tbl.addRow(row);

            }
        } else {
            for (int i = tempAccount.size() - 1; i > -1; i--) {
                row = new String[5];
                row[0] = tempAccount.get(i).getAccID();
                row[1] = tempAccount.get(i).getUsername();
                row[2] = df.format(tempAccount.get(i).getBalance());
                if (tempAccount.get(i).getAccountType() == 1) {
                    row[3] = "Admin";
                } else {
                    row[3] = "User";
                }
                if (tempAccount.get(i).getBlockCount() == 3) {
                    row[4] = "Blocked";
                } else if (tempAccount.get(i).getLoginStatus() == 1) {
                    row[4] = "Signed In";
                } else {
                    row[4] = "Not Blocked";
                }
                tbl.addRow(row);
            }
        }
    }

    public void getAuditTrails(String order, DefaultTableModel tbl) {
        String[] row;
        tbl.setRowCount(0);

        if (order.equals("ASCENDING")) {
            for (int i = 0; i < auditTrails.size(); i++) {
                row = new String[3];
                row[0] = auditTrails.get(i).getDateTime();
                row[1] = auditTrails.get(i).getTransaction();
                row[2] = auditTrails.get(i).getName();
                tbl.addRow(row);
            }

        } else if (order.equals("DESCENDING")) {
            for (int i = auditTrails.size() - 1; i > -1; i--) {
                row = new String[3];
                row[0] = auditTrails.get(i).getDateTime();
                row[1] = auditTrails.get(i).getTransaction();
                row[2] = auditTrails.get(i).getName();
                tbl.addRow(row);
            }
        }
    }

    public static void toLogout(String accNum) {

        if (!adminID.equals("S4M9L3 4DM1N")) {
            for (int i = 0; i < GeneralFunction.list.size(); i++) {
                if (GeneralFunction.list.get(i).getAccID().equals(accNum)) {
                    GeneralFunction.list.get(i).setLoginStatus(0);
                    GeneralFunction.list.get(i).setLoginDate("null");
                    GeneralFunction.rewrite();
                    break;
                }
            }
        }
    }
}
