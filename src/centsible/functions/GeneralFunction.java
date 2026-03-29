package centsible.functions;

import centsible.datas.Accounts;
import centsible.datas.TransactionHistory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GeneralFunction {

    public static LinkedList<Accounts> list;
    public static LinkedList<TransactionHistory> transaction;

    String location;//variable for the location of the accounts folder
    String transactionLocation;
//    static String fullName, username, pass, email, code;

    static boolean confirmed = false;

    static File file;

    public static int runCount = 0;

    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

    EncryptionDecryption bed;

    AuditFunction a;

    public GeneralFunction() {
        //Get the location of the project
        a = new AuditFunction();
        file = new File("");
        location = file.getAbsolutePath() + "\\Accounts\\";    //setting file loc.
        transactionLocation = file.getAbsolutePath() + "\\Transaction History\\";
        String[] x = getListofAccounts();
        bed = new EncryptionDecryption();
        initAccInfo(x);
        setTransaction(x);

    }

    public static String getLocation() {
        String location = file.getAbsolutePath() + "\\Accounts\\";    //setting file loc.
        return location;
    }

    public static String getTransactionLocation() {
        String location = file.getAbsolutePath() + "\\Transaction History\\";    //setting file loc.
        return location;
    }

    public String[] getListofAccounts() {
        //This method is to get all the account infos from a file

        try {//try catch to check if there are accounts available
            File folder = new File(location);

            File[] listOfFiles = folder.listFiles();
            String[] accounts = new String[listOfFiles.length];
            int ctr = 0;
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    accounts[ctr] = file.getName();
                    ctr++;
                }
            }
            return accounts;
        } catch (Exception e) {
            return null;
        }
    }

    public void initAccInfo(String[] accounts) {
        //This method initializes the accounts.

        runCount++;

        list = new LinkedList<>();
        String name = "", username = "", email = "", password = "", otp = "";
        String date = "";
        Accounts a;

        try {
            int checkDate = 0;
            for (String acc : accounts) {

                File file = new File(location + "" + acc);

                BufferedReader br = new BufferedReader(new FileReader(file));
                String tempName = bed.decrypt(br.readLine());
                String tempUsername = bed.decrypt(br.readLine());
                String tempEmail = bed.decrypt(br.readLine());
                String tempPass = bed.decrypt(br.readLine());
                String tempOTP = bed.decrypt(br.readLine());
                String tempBalance = bed.decrypt(br.readLine());
                String tempFamSavings = bed.decrypt(br.readLine());
                String tempSoloSavings = bed.decrypt(br.readLine());
                String tempBirthdate = bed.decrypt(br.readLine());
                String tempAccType = bed.decrypt(br.readLine());
                String tempLoginStatus = bed.decrypt(br.readLine());
                String tempLoginDate = bed.decrypt(br.readLine());
                String tempBlockCount = bed.decrypt(br.readLine());
                String tempDateBlocked = bed.decrypt(br.readLine());
                br.close();

                name = tempName.substring(6, tempName.length()).trim();
                username = tempUsername.substring(10, tempUsername.length())
                        .trim();
                email = tempEmail.substring(7, tempEmail.length()).trim();
                password = tempPass.substring(10, tempPass.length()).trim();
                otp = tempOTP.substring(5, tempOTP.length()).trim();
                
                double balance = Double.parseDouble(tempBalance
                        .substring(9, tempBalance.length()).trim());
                double famSavings = Double.parseDouble(tempFamSavings
                        .substring(15, tempFamSavings.length()).trim());
                double soloSavings = Double.parseDouble(tempSoloSavings
                        .substring(12, tempSoloSavings.length()).trim());
                String birthdate = tempBirthdate
                        .substring(10, tempBirthdate.length()).trim();
                int accType = Integer.parseInt(tempAccType
                        .substring(8, tempAccType.length()).trim());
                int loginStatus = Integer.parseInt(tempLoginStatus
                        .substring(13, tempLoginStatus.length()).trim());
                String loginDate = tempLoginDate
                        .substring(12, tempLoginDate.length()).trim();
                int blockCount = Integer.parseInt(tempBlockCount
                        .substring(11, tempBlockCount.length()).trim());
                String dateBlocked = tempDateBlocked
                        .substring(13, tempDateBlocked.length()).trim();

                if (!dateBlocked.equals("null")) {
                    date = dateBlocked;
                }

                if (!(loginDate.equals(ldt.format(dtf))) && loginStatus == 1) {
                    checkDate = 1;
                    loginDate = "null";
                    loginStatus = 0;
                }

                if ((!(dateBlocked.equals(ldt.format(dtf))) 
                        && !(dateBlocked.equals("null")))) {
                    checkDate = 1;
                    blockCount = 0;
                    dateBlocked = null;
                }

                String accID = acc.substring(0, acc.length() - 4);

                a = new Accounts(accID, name, username, email, password, otp,
                        birthdate, dateBlocked, accType, blockCount, balance,
                        loginStatus, famSavings, soloSavings, loginDate);

                list.add(a);
            }

            if (checkDate == 1 && runCount == 1) {
                String x = "All blocks from yesterday has been reset.";
                JOptionPane.showMessageDialog(null, x);
            }

        } catch (Exception e) {
            System.out.println("Error(initAccountInfo): " + e);
        }
    }

    public String getMessage(String fullName, String code) {
        String x = "Hi " + fullName + ",\n"
                + "\n"
                + "Thank you for signing up for Centsible! To verify your "
                + "account, please use the following code:\n"
                + "\n"
                + code + "\n"
                + "\n"
                + "Enter it in the "
                + "verification field to complete your registration.\n"
                + "\n"
                + "If you didn’t request this code, please ignore this email.\n"
                + "\n"
                + "Thank you for choosing Centsible!\n"
                + "\n"
                + "Best regards,\n"
                + "The Centsible Team";

        /*
        For assistance, contact us at [support email].
         */
        return x;
    }

    public String forgotPassMessage(String fullName, String code) {
        String x = "Hi " + fullName + ",\n"
                + "\n"
                + "We’ve received your password reset request. Please use the "
                + "temporary code below to set a new password:\n"
                + "\n" + code + "\n"
                + "\n"
                + "If you didn’t request this, please ignore this email or "
                + "go to the nearest Centsible kiosk.\n"
                + "\n"
                + "Best regards,\n"
                + "Centsible";

        return x;
    }

    public String bankTransferConfirmationMessage(String fullName,
            String code, String bankAcc) {
        String x = "Dear " + fullName + ",\n"
                + "\n"
                + "Thank you for initiating a transfer request to the bank "
                + "account ending in " + bankAcc + ". "
                + "To proceed with the transaction, please use the One-Time "
                + "Password (OTP) provided below:\n"
                + "\n"
                + "OTP Code: " + code + "\n"
                + "\n"
                + "Please ensure the confidentiality of this code and do not "
                + "share it with anyone."
                + "\n"
                + "Thank you for choosing our services.\n"
                + "\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n"
                + "Best regards,\n"
                + "Centsible";
        return x;
    }

    public String sendMoneyConfirmationMessage(String fullName,
            String code, String bankAcc) {

        String x = "Dear " + fullName + ",\n"
                + "\n"
                + "We have received your request to send money to the "
                + "account ending in " + bankAcc + ". "
                + " To confirm and complete this transaction, "
                + "please use the One-Time Password (OTP) provided below:\n"
                + "\n"
                + "OTP Code: " + code + "\n"
                + "\n"
                + "For your security, please keep this code "
                + "confidential and do not share it with anyone.\n"
                + "\n"
                + "Thank you for choosing our services.\n"
                + "\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n"
                + "\n"
                + "Best regards,\n"
                + "Centsible";

        return x;
    }

    public String sendMoneyInfoConfirm(String amount, String accNum,
            String accName, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getFullName().equals(senderName)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Send Money Receipt\n\n"
                + "Transaction Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Transferred: PHP " + amount + "\n\n"
                + "Sender Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n"
                + "Recipient Details:\n"
                + "Account Name: " + accName + "\n"
                + "Account Number: " + accNum + "\n";

        return x;
    }

    public String sendMoneyReceipt(String amount, String accNum,
            String accName, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getFullName().equals(senderName)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Money Transfer Receipt\n\n"
                + "Transaction Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Transferred: PHP " + amount + "\n\n"
                + "Sender Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n"
                + "Recipient Details:\n"
                + "Account Name: " + accName + "\n"
                + "Account Number: " + accNum + "\n"
                + "\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n\n"
                + "Thank you for using Centsible.";

        return x;
    }

    public String getEmail(String username) {
        String email = "";

        for (Accounts a : list) {
            if (a.getUsername().equals(username)) {
                email = a.getEmail();
                break;
            }
        }

        return email;
    }

    public String receiveMoneyReceipt(String amount, String accNum) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";
        String senderName = "";
        String receiverFullName = "";

        for (Accounts a : list) {
            if (a.getUsername().equals(UserFunctions.username)) {
                senderName = a.getFullName();
                tempSenderNum = a.getAccID();
                break;
            }
        }

        for (Accounts a : list) {
            if (a.getAccID().equals(accNum)) {
                receiverFullName = a.getFullName();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Dear " + receiverFullName + ",\n"
                + "\n"
                + "We are pleased to inform you that your account has "
                + "successfully received funds. Below are the "
                + "transaction details for your reference:\n"
                + "\n"
                + "Amount Received: " + amount + "\n"
                + "Sender Name: " + senderName + "\n"
                + "Date and Time: " + date + "\n"
                + "\n"
                + "\n"
                + "Thank you for using our services.\n"
                + "\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n"
                + "Best regards,\n"
                + "Centsible";

        return x;
    }

    public String bankTransferInfoConfirm(String amount, String accNum,
            String accName, String bankName, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getFullName().equals(senderName)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Bank Transfer Receipt\n\n"
                + "Transaction Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Transferred: PHP " + amount + "\n\n"
                + "Sender Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n"
                + "Recipient Details:\n"
                + "Account Name: " + accName + "\n"
                + "Account Number: " + accNum + "\n"
                + "Bank Name: " + bankName + "\n\n";

        return x;
    }

    public String bankTransferReceipt(String amount, String accNum,
            String accName, String bankName, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getUsername().equals(UserFunctions.username)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Bank Transfer Receipt\n\n"
                + "Transaction Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Transferred: PHP " + amount + "\n\n"
                + "Sender Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n"
                + "Recipient Details:\n"
                + "Account Name: " + accName + "\n"
                + "Account Number: " + accNum + "\n"
                + "Bank Name: " + bankName + "\n\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n\n"
                + "Thank you for using Centsible.";

        return x;
    }

    public String payBillsInfoConfirm(String amount, String accNum,
            String billType, String billProvider, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getFullName().equals(senderName)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Bill Payment Receipt\n\n"
                + "Payment Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Paid: PHP " + amount + "\n\n"
                + "Bill Details:\n"
                + "Bill Type: " + billType + "\n"
                + "Account/Reference Number: " + accNum + "\n"
                + "Service Provider: " + billProvider + "\n\n"
                + "User Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n";

        return x;
    }

    public String payBillsReceipt(String amount, String accNum,
            String billType, String billProvider, String senderName) {

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MM-dd-YYYY hh:MMa");
        String date = dtf.format(ldt);

        String tempSenderNum = "";

        for (Accounts a : list) {
            if (a.getUsername().equals(UserFunctions.username)) {
                tempSenderNum = a.getAccID();
                break;
            }
        }

        String senderNum = "";

        for (int i = 0; i < tempSenderNum.length(); i++) {
            if (i < (tempSenderNum.length() / 2)) {
                senderNum = senderNum + "*";
            } else {
                senderNum = senderNum + tempSenderNum.charAt(i);
            }
        }

        String x = "Bill Payment Receipt\n\n"
                + "Payment Details:\n"
                + "Date and Time: " + date + "\n"
                + "Amount Paid: PHP " + amount + "\n\n"
                + "Bill Details:\n"
                + "Bill Type: " + billType + "\n"
                + "Account/Reference Number: " + accNum + "\n"
                + "Service Provider: " + billProvider + "\n\n"
                + "User Details:\n"
                + "Account Name: " + senderName + "\n"
                + "Account Number: " + senderNum + "\n\n"
                + "If you encounter any problems, please go to the nearest"
                + "Centsible kiosk.\n"
                + "Thank you for paying your " + billType 
                + " through Centsible.";

        return x;
    }

    public static void rewrite() {
        EncryptionDecryption bed = new EncryptionDecryption();

        String name = "", username = "", email = "", password = "", otp = "";

        String location = getLocation();
        
        DecimalFormat df = new DecimalFormat("000000");
        
        try {

            for (int i = 0; i < list.size(); i++) {

                File file = new File(location + "" + df.format(i)
                        + ".txt");

                try {
                    FileWriter fw = new FileWriter(file);
                    fw.write(bed.encrypt("Name: " + list.get(i)
                            .getFullName()) + "\n");
                    fw.append(bed.encrypt("Username: " + list.get(i)
                            .getUsername()) + "\n");
                    fw.append(bed.encrypt("Email: " + list.get(i)
                            .getEmail()) + "\n");
                    fw.append(bed.encrypt("Password: " + list.get(i)
                            .getPassword()) + "\n");
                    fw.append(bed.encrypt("OTP: " + list.get(i)
                            .getOtp()) + "\n");
                    fw.append(bed.encrypt("Balance: " + list.get(i)
                            .getBalance()) + "\n");
                    fw.append(bed.encrypt("Family Savings: " + list.get(i)
                            .getFamilySavings()) + "\n");
                    fw.append(bed.encrypt("Own Savings: " + list.get(i)
                            .getOwnSavings()) + "\n");
                    fw.append(bed.encrypt("Birthdate: " + list.get(i)
                            .getBirthdate()) + "\n");
                    fw.append(bed.encrypt("isAdmin: " + list.get(i)
                            .getAccountType()) + "\n");
                    fw.append(bed.encrypt("Login Status: " + list.get(i)
                            .getLoginStatus()) + "\n");
                    fw.append(bed.encrypt("Login Date: " + list.get(i)
                            .getLoginDate()) + "\n");
                    fw.append(bed.encrypt("BlockCount:  " + list.get(i)
                            .getBlockCount()) + "\n");
                    fw.append(bed.encrypt("Date Blocked: " + list.get(i)
                            .getDateBlocked()) + "\n");
                    fw.append(bed.encrypt("Transaction History:") + "\n");
                    fw.flush();
                    fw.close();
                } catch (Exception e) {
                    System.out.println("Error(rewriteAccount): " + e);
                }
            }

        } catch (Exception e) {
            System.out.println("Error(initAccountInfo(rewrite)): " + e);
        }
    }

    public void writeTransaction(String index, String feature, String value) {
        EncryptionDecryption bed = new EncryptionDecryption();

        String location = getTransactionLocation();

        File file = new File(location + "\\" + index + ".txt");

        DateTimeFormatter dtf = DateTimeFormatter
                .ofPattern("MMM dd, YYYY hh:mma");
        LocalDateTime now = LocalDateTime.now();

        String transact = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.ready()) {
                transact = transact + br.readLine() + "\n";
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write(transact);
            bw.append(bed.encrypt(dtf.format(now)) + "\n");
            bw.append(bed.encrypt(feature) + "\n");
            bw.append(bed.encrypt(value) + "\n");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error (bufferedreader transaction): " + e);
        }
//        String[] x = getListofAccounts();
//        setTransaction(x);
    }

    public void getTransaction(String order, int index, DefaultTableModel tbl) {
        String[] row;
        tbl.setRowCount(0);
        if (order.equals("ASCENDING")) {
            for (int i = 0; i < transaction.size(); i++) {
                if (transaction.get(i).getAccID().equals(UserFunctions.userID)) 
                {
                    row = new String[3];
                    row[0] = transaction.get(i).getDateTime();
                    row[1] = transaction.get(i).getTransaction();
                    row[2] = transaction.get(i).getAmount();
                    tbl.addRow(row);
                }
            }
        } else if (order.equals("DESCENDING")) {
            for (int i = transaction.size() - 1; i > -1; i--) {
                if (transaction.get(i).getAccID().equals(UserFunctions.userID)) 
                {
                    row = new String[3];
                    row[0] = transaction.get(i).getDateTime();
                    row[1] = transaction.get(i).getTransaction();
                    row[2] = transaction.get(i).getAmount();
                    tbl.addRow(row);
                }
            }
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

    public void searchTransaction(String sort, String option, String searchBy,
            String search, DefaultTableModel tbl) {
        String[] row;

        tbl.setRowCount(0);

        LinkedList<TransactionHistory> tempTransaction = transaction;

        if (option.equals("Amount")) {
            Collections.sort(tempTransaction, 
                    new Comparator<TransactionHistory>() {
                @Override
                public int compare(TransactionHistory s1, 
                        TransactionHistory s2) {
                    return Double.compare(Double.parseDouble(s1.getAmount().
                            replaceAll(",", "")), Double.
                                    parseDouble(s2.getAmount()
                                            .replaceAll(",", "")));
                }
            });
        }

        if (sort.equals("ASCENDING")) {
            for (int i = 0; i < tempTransaction.size(); i++) {
                if (searchBy.equals("Amount")) {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getAmount()
                                    .replaceAll(",", "").contains(search)) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Transaction")) {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getTransaction()
                                    .toLowerCase()
                                    .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                } else {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getDateTime()
                                    .toLowerCase()
                                    .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                }
            }
        } else {
            for (int i = tempTransaction.size() - 1; i > -1; i--) {
                if (searchBy.equals("Amount")) {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getAmount()
                                    .replaceAll(",", "").contains(search)) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                } else if (searchBy.equals("Transaction")) {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getTransaction()
                                    .toLowerCase()
                                    .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                } else {
                    if (tempTransaction.get(i).getAccID()
                            .equals(UserFunctions.userID)
                            && tempTransaction.get(i).getDateTime()
                                    .toLowerCase()
                                    .contains(search.toLowerCase())) {
                        row = new String[3];
                        row[0] = tempTransaction.get(i).getDateTime();
                        row[1] = tempTransaction.get(i).getTransaction();
                        row[2] = tempTransaction.get(i).getAmount();
                        tbl.addRow(row);
                    }
                }
            }
        }
    }

    public void setTransaction(String[] accounts) {
        //This method initializes the accounts.

        EncryptionDecryption bed = new EncryptionDecryption();

        runCount++;

        transaction = new LinkedList<>();

        try {

            String dateTime = "", transaction = "", amount = "";

            for (String acc : accounts) {

                File file = new File(transactionLocation + "" + acc);

                BufferedReader br = new BufferedReader(new FileReader(file));
                while (br.ready()) {
                    dateTime = (bed.decrypt(br.readLine()));
                    transaction = (bed.decrypt(br.readLine()));
                    amount = (bed.decrypt(br.readLine()));
                    String accID = acc.replace(".txt", "");
                    TransactionHistory th = new TransactionHistory(dateTime, 
                            transaction, amount, accID);
                    this.transaction.add(th);
                }
                br.close();
            }
        } catch (Exception e) {
            System.out.println("Error(setTransaction): " + e);
        }
    }
}
