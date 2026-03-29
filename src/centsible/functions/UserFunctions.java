package centsible.functions;

import centsible.datas.Accounts;
import centsible.datas.Email;
import centsible.frames.startup.Login;
import centsible.frames.user.BankInfo;
import centsible.frames.user.FillInfoPayBills;
import centsible.mail.EmailSender;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UserFunctions {

    public static String username;
    public static double balance;
    public static int billPick;
    public static String userID;
    public static String code;

    public static ImageIcon circularLogo;
    public static ImageIcon billType;
    public static ImageIcon bill1, bill2;

    GeneralFunction gf = new GeneralFunction();

    public void setUsername(String username) {
        this.username = username;
    }

    public void bankChoice(int choice) {
        switch (choice) {
            case 1://UnionBank
                BankInfo.bankName = "UnionBank";
                circularLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\UBilog.png");
                break;
            case 2://PNB
                BankInfo.bankName = "Philippine National Bank (PNB)";
                circularLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\PNB circle 95 95.png");
                break;
            case 3://BPI
                BankInfo.bankName = "Bank of the Philippine Islands (BPI)";
                circularLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\ipbilog.png");
                break;
            case 4://RCBC
                BankInfo.bankName = "Rizal Commercial Banking Corporation "
                        + "(RCBC)";
                circularLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\rcbc bilog.png");
                break;
            default:
                JOptionPane.showMessageDialog(null, "An Error Occured.");
        }
    }

    public void billChoice(int choice) {
        billPick = choice;
        switch (choice) {
            case 1://Electric
                FillInfoPayBills.billType = "Electricity";
                bill1 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\meralco.png");
                bill2 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\beneco.png");
                billType = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\elec.png");
                break;
            case 2://Water
                FillInfoPayBills.billType = "Water";
                bill1 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\Prime.png");
                bill2 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\ML.png");
                billType = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\tubeg.png");
                break;
            case 3://Internet
                FillInfoPayBills.billType = "Internet";
                bill1 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\pldc.png");
                bill2 = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\globo.png");
                billType = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\-wifii.png");
                break;
            default:
                JOptionPane.showMessageDialog(null, "An Error Occured.");
        }
    }

    public void setBill(int choice) {
        switch (billPick) {
            case 1://Electric
                switch (choice) {
                    case 1:
                        FillInfoPayBills.billProvider = "Meralco";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\kuryente bilog.png");
                        break;
                    case 2:
                        FillInfoPayBills.billProvider = "Beneco";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\bene bilog.png");
                        break;
                }
                break;
            case 2://Water
                switch (choice) {
                    case 1:
                        FillInfoPayBills.billProvider = "PrimeWater";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\PW logbi.png");
                        break;
                    case 2:
                        FillInfoPayBills.billProvider = "Maynilad";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\Maynilad bilog.png");
                        break;
                }
                break;
            case 3://Internet
                switch (choice) {
                    case 1:
                        FillInfoPayBills.billProvider = "PLDT";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\PLDT logbi.png");
                        break;
                    case 2:
                        FillInfoPayBills.billProvider = "Globe";
                        circularLogo = new ImageIcon(System
                                .getProperty("user.dir") 
                                + "\\src\\userImages\\globre bilog.png");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "An Error Occured.");
        }
    }

    public void setUserInfo(JLabel accNum, JLabel fullName, JLabel username,
            JLabel email, JLabel dateOfBirth) {

        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(UserFunctions.username)) {
                accNum.setText(a.getAccID());
                fullName.setText(a.getFullName());
                username.setText(a.getUsername());
                email.setText(a.getEmail());
                dateOfBirth.setText(a.getBirthdate());
                break;
            }
        }
    }

    public static void toLogout(String accNum) {
        AuditFunction a = new AuditFunction();

        for (int i = 0; i < GeneralFunction.list.size(); i++) {
            if (GeneralFunction.list.get(i).getAccID().equals(accNum)) {
                GeneralFunction.list.get(i).setLoginStatus(0);
                GeneralFunction.list.get(i).setLoginDate("null");
                a.createAudit(username, "Logged Out");
                GeneralFunction.rewrite();
                break;
            }
        }
    }

    public String getEmail(String username) {
        String email = "";

        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(username)) {
                email = a.getEmail();
                break;
            }
        }

        return email;
    }

    public static double getBalance(String username) {
        double balance = 0;

        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(username)) {
                balance = a.getBalance();
                break;
            }
        }

        return balance;
    }
    

    public String getFullName(String username) {
        String fullName = "";

        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(username)) {
                fullName = a.getFullName();
                break;
            }
        }

        return fullName;
    }

    public void sendOTP(JTextField txtEmail, JTextField txtAccNum) {
        OTPGenerator gen = new OTPGenerator();

        String code = "";

        EmailSender es = new EmailSender();

        String email = txtEmail.getText();

        try {
            code = gen.generateVerifyCode();
            UserFunctions.code = code;

            String fullName = "";
            String accNum = txtAccNum.getText().trim();
            accNum = accNum.substring(accNum.length() - 4);

            for (Accounts a : GeneralFunction.list) {
                if (a.getEmail().equals(email)) {

                    fullName = a.getFullName();
                    String message = gf.bankTransferConfirmationMessage(
                            fullName, code, accNum);
                    Email e = new Email();
                    e = es.forgotPasswordSend(email, message);
                    JOptionPane.showMessageDialog(null, "A code has been sent "
                            + "to your email.");

                    break;

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields "
                    + "first.");
        }
    }

    public void sendOTPSendMoney(JTextField txtEmail, JTextField txtAccNum) {
        OTPGenerator gen = new OTPGenerator();

        String code = "";

        EmailSender es = new EmailSender();

        String email = txtEmail.getText();

        try {
            code = gen.generateVerifyCode();

            String fullName = "";
            String accNum = txtAccNum.getText().trim();
            accNum = accNum.substring(accNum.length() - 4);

            for (Accounts a : GeneralFunction.list) {
                if (a.getEmail().equals(email)) {

                    fullName = a.getFullName();
                    String message = gf.sendMoneyConfirmationMessage(fullName, 
                            code, accNum);
                    Email e = new Email();
                    e = es.forgotPasswordSend(email, message);
                    JOptionPane.showMessageDialog(null, "A code has been sent "
                            + "to your email.");

                    break;

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please fill up the fields "
                    + "first.");
        }
    }

    public void bankTransferSendReceipt(String amount, String accNum,
            String accName, String bankName, String senderName, String email) {

        EmailSender es = new EmailSender();

        String message = gf.bankTransferReceipt(amount, accNum, accName,
                bankName, senderName);
        Email e = new Email();
        e = es.bankTransferReceipt(email, message);

    }

    public void sendMoneySendReceipt(String amount, String accNum,
            String accName, String senderName, String email) {

        EmailSender es = new EmailSender();

        String message = gf.sendMoneyReceipt(amount, accNum, accName,
                senderName);
        Email e = new Email();
        e = es.sendMoneyReceipt(email, message);

    }

    public void receiveMoneySendReceipt(String amount, String accNum,
            String accName, String senderName) {

        EmailSender es = new EmailSender();

        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(accName)) {
                String message = gf.receiveMoneyReceipt(amount, accNum);
                Email e = new Email();
                String email = a.getEmail();
                e = es.sendMoneyReceipt(email, message);
                break;

            }
        }
    }

    public void moneyReceiverSendReceipt(String amount, String accNum,
            String accName, String senderName, String email) {

        EmailSender es = new EmailSender();

        String message = gf.sendMoneyReceipt(amount, accNum, accName,
                senderName);
        Email e = new Email();
        e = es.bankTransferReceipt(email, message);

    }

    public void payBillsSendReceipt(String amount, String accNum,
            String billType, String billProvider, String senderName, 
            String email) {

        EmailSender es = new EmailSender();

        String message = gf.payBillsReceipt(amount, accNum, billType,
                billProvider, senderName);
        Email e = new Email();
        e = es.payBillsReceipt(email, message);

    }

    public void subtractToBalance(String username, double amount) {
        for (int i = 0; i < GeneralFunction.list.size(); i++) {
            if (GeneralFunction.list.get(i).getUsername().equals(username)) {
                GeneralFunction.list.get(i).setBalance(balance - amount);
                GeneralFunction.rewrite();
                break;
            }
        }
    }

    public void addToAccount(String accID, double amount) {
        for (int i = 0; i < GeneralFunction.list.size(); i++) {
            if (GeneralFunction.list.get(i).getAccID().equals(accID)) {
                GeneralFunction.list.get(i).setBalance(GeneralFunction.list
                        .get(i).getBalance() + amount);
                GeneralFunction.rewrite();
                break;
            }
        }
    }

    public static void logOut(JFrame f) {
        int x = JOptionPane.showConfirmDialog(null, "Would you "
                + "like to Log out?");

        if (x == JOptionPane.YES_OPTION) {
            toLogout(userID);
            System.exit(0);
        }
    }
}
