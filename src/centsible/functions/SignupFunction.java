package centsible.functions;

import centsible.datas.Email;
import centsible.frames.startup.OTPVerification;
import centsible.frames.startup.SignUpOkay;
import static centsible.functions.GeneralFunction.list;
import centsible.mail.EmailSender;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupFunction {

    GeneralFunction gf = new GeneralFunction();

    EncryptionDecryption ed = new EncryptionDecryption();

    AuditFunction a = new AuditFunction();

    String imgLocation = "";

    ImageIcon show, hide;

    LocalDateTime ldt = LocalDateTime.now();

    public static int day, month, year, emailFlag = 0;

    int currentYear = ldt.getYear();
    int currentDay = ldt.getDayOfMonth();
    int currentMonth = ldt.getMonthValue();

    public static String fullName, username, birthdate, email, password;

    public SignupFunction() {
    }

    public SignupFunction(JTextField txtFullName, JTextField txtUsername,
            JTextField txtBirthdate, JTextField txtEmail,
            JPasswordField txtPass, JPasswordField txtConPass) {
        Color customColor = new Color(153, 255, 153);
        txtPass.setEchoChar((char) 0);
        getLocation();
        show = new ImageIcon(imgLocation + "eye.png");
        hide = new ImageIcon(imgLocation + "hidden.png");
        txtFullName.setForeground(customColor);
        txtUsername.setForeground(customColor);
        txtBirthdate.setForeground(customColor);
        txtEmail.setForeground(customColor);
        txtPass.setForeground(customColor);
        txtConPass.setForeground(customColor);
    }

//FOR USERNAME TEXTFIELD CODES BELOW
//#1    
    public void fullNameFocusGained(JTextField txtFullName, String fullName) {
        txtFullName.setText("");
        txtFullName.setText(fullName);
        txtFullName.setForeground(Color.BLACK);
    }
//#2

    public String fullNameFocusLost(JTextField txtFullName, String fullName) {
        Color customColor = new Color(153, 255, 153);
        txtFullName.setForeground(customColor);
        if (fullName.trim().length() != 0 && !fullName.trim()
                .equals("Full Name")) {
            txtFullName.setText(fullName);
        } else {
            txtFullName.setText("Full Name");
            fullName = "";
        }
        return fullName;
    }

//FOR USERNAME TEXTFIELD CODES BELOW
//#1    
    public void usernameFocusGained(JTextField txtUser, String username) {
        txtUser.setText("");
        txtUser.setText(username);
        txtUser.setForeground(Color.BLACK);
    }
//#2

    public String usernameFocusLost(JTextField txtUser, String username) {
        Color customColor = new Color(153, 255, 153);
        txtUser.setForeground(customColor);
        if (username.trim().length() != 0 && !username.trim()
                .equals("Username")) {
            txtUser.setText(username);
        } else {
            txtUser.setText("Username");
            username = "";
        }
        return username;
    }

//FOR EMAIL TEXTFIELD CODES BELOW
//#1    
    public void emailFocusGained(JTextField txtEmail, String email) {
        txtEmail.setText("");
        txtEmail.setText(email);
        txtEmail.setForeground(Color.BLACK);
    }
//#2

    public String emailFocusLost(JTextField txtEmail, String email) {
        Color customColor = new Color(153, 255, 153);
        txtEmail.setForeground(customColor);
        if (email.trim().length() != 0 && !email.trim()
                .equals("Email")) {
            txtEmail.setText(email);
        } else {
            txtEmail.setText("Email");
            email = "";
        }
        return email;
    }

//FOR PASSWORDFIELD CODES BELOW 
//#1    
    public void passFocusGained(JPasswordField txtPass, String pass, int flag) {
        txtPass.setText("");
        txtPass.setText(pass);
        txtPass.setForeground(Color.BLACK);
        txtPass.setEchoChar(('\u2022'));

        if (flag == 1) {
            txtPass.setEchoChar(((char) 0));
        }
    }
//#2    

    public String passFocusLost(JPasswordField txtPass, String password) {
        Color customColor = new Color(153, 255, 153);
        txtPass.setForeground(customColor);
        if (password.trim().length() != 0 && !password.trim()
                .equals("Password")) {
            txtPass.setText(password);
        } else {
            txtPass.setText("Password");
            txtPass.setEchoChar((char) 0);
            password = "";
        }
        return password;
    }
//#3

    public int showPassword(int flag, JPasswordField txtPass, JLabel temp) {
        if (!(txtPass.getText().equals("Password"))) {
            if (flag == 0) {
                flag = 1;
                txtPass.setEchoChar(((char) 0));
                temp.setIcon(hide);
            } else {
                flag = 0;
                txtPass.setEchoChar(('\u2022'));
                temp.setIcon(show);
            }
        }

        return flag;
    }

//FOR CONFIRM PASSWORD CODES BELOW 
//#1    
    public void conPassFocusGained(JPasswordField txtConPass, String conPass,
            int flag) {
        txtConPass.setText("");
        txtConPass.setText(conPass);
        txtConPass.setForeground(Color.BLACK);
        txtConPass.setEchoChar(('\u2022'));

        if (flag == 1) {
            txtConPass.setEchoChar(((char) 0));
        }
    }
//#2    

    public String conPassFocusLost(JPasswordField txtConPass, String conPass) {
        Color customColor = new Color(153, 255, 153);
        txtConPass.setForeground(customColor);
        if (conPass.trim().length() != 0 && !conPass.trim()
                .equals("Confirm Password")) {
            txtConPass.setText(conPass);
        } else {
            txtConPass.setText("Confirm Password");
            txtConPass.setEchoChar((char) 0);
            conPass = "";
        }
        return conPass;
    }
//#3

    public int showConfirmPassword(int flag, JPasswordField txtConPass,
            JLabel temp) {
        if (!(txtConPass.getText().equals("Confirm Password"))) {
            if (flag == 0) {
                flag = 1;
                txtConPass.setEchoChar(((char) 0));
                temp.setIcon(hide);
            } else {
                flag = 0;
                txtConPass.setEchoChar(('\u2022'));
                temp.setIcon(show);
            }
        }

        return flag;
    }

//TO GET IMAGE FOLDER LOCATION
    public void getLocation() {
        File file = new File("");
        imgLocation = file.getAbsolutePath() + "\\src\\images\\";
    }

//FOR KEYPRESSED EVENT
    public void checkKeyPressed(KeyEvent evt, JTextField txtFullName,
            JTextField txtUsername, JTextField txtEmail, JTextField txtDate,
            JPasswordField txtPassword, JPasswordField txtConPass, JFrame f) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            verifyCreation(txtFullName, txtUsername, txtDate, txtEmail,
                    txtPassword, txtConPass, f);
            OTPVerification.ref = f;
        }
    }

    public void verifyCreation(JTextField txtFullName, JTextField txtUser,
            JTextField txtBirthdate, JTextField txtEmail,
            JPasswordField txtPass, JPasswordField txtConPass, JFrame f) {

        int userAge = 0;

        String tempFullName = txtFullName.getText().trim();
        String tempUsername = txtUser.getText().trim();
        String tempBirthdate = txtBirthdate.getText().trim();
        String tempEmail = txtEmail.getText().trim();
        String tempPassword = txtPass.getText().trim();
        String tempConPass = txtConPass.getText().trim();

        try {
            //GET USER'S AGE
            userAge = currentYear - year;
            if (currentMonth > month
                    || (month == currentMonth
                    && day > currentDay)) {
                userAge = userAge - 1;
            }
        } catch (Exception ex) {
            //ERROR TRACING
            String x = "Please enter a valid date of birth";
            JOptionPane.showMessageDialog(null, x);
        }

        //VERIFICATION
        if (userAge < 18) {
            String x = "Sorry, you must be at least 18 to create an account";
            JOptionPane.showMessageDialog(null, x);
        } else if (userAge > 120) {
            String x = "Invalid date of birth. Please try again.";
            JOptionPane.showMessageDialog(null, x);
        } else {
            if (!tempUsername.contains(" ")) {
                if (tempUsername.length() >= 6) {
                    if (tempPassword.length() >= 8) {
                        if (!(tempFullName.equals(""))
                                && !(tempFullName.equals("Full Name"))
                                && !(tempUsername.equals(""))
                                && !(tempUsername.equals("Username")
                                && !(tempUsername.equals("Enter Username")))
                                && !(tempEmail.equals("")) && !(tempEmail
                                .equals("Email"))
                                && !(tempPassword.equals(""))
                                && !(tempPassword.equals("Password"))
                                && !(tempPassword.equals("Enter Password"))
                                && !(tempPassword.equals("New Password"))
                                && !(tempConPass.equals(""))
                                && !(tempConPass.equals("Confirm Password"))
                                && !(tempConPass.equals("Password"))
                                && !(tempConPass.equals("Enter Password"))
                                && !(tempConPass.equals("New Password"))) {
                            if (tempPassword.equals(tempConPass)) {
                                createAccount(tempFullName, tempUsername,
                                        tempEmail, tempPassword, tempBirthdate,
                                        f);
                            } else {
                                String x = "Password and Confirm Password does "
                                        + "not match.";
                                JOptionPane.showMessageDialog(null, x);
                            }

                        } else {
                            String x = "Sign-up failed: Please complete all "
                                    + "required fields \n"
                                    + "and ensure the information provided "
                                    + "is valid.";
                            JOptionPane.showMessageDialog(null, x);
                        }
                    } else {

                        JOptionPane.showMessageDialog(null, "Password must be "
                                + "atleast 8 characters.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username must be "
                            + "atleast 6 characters.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username must not contain "
                        + "empty spaces.");
            }
        }
    }

    public void createAccount(String fullName, String username, String email,
            String pass, String birthdate, JFrame f) {
        //This method is to allow user to add or create account

        OTPGenerator gen = new OTPGenerator();

        EmailSender es = new EmailSender();

        String code = "";
        try {
            code = gen.generateVerifyCode();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String message = gf.getMessage(fullName, code);
        Email e = new Email();
        e = es.sendMain(email, message);

        int flag = 0;

        if (!list.isEmpty()) {

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(username)) {
                    String x = "Account Username already exists.";
                    JOptionPane.showMessageDialog(null, x);
                    flag = 0;
                    break;
                } else if (list.get(i).getEmail().equals(email)) {
                    String x = "Email is already registered.";
                    JOptionPane.showMessageDialog(null, x);
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }

        } else {
            flag = 1;
        }

        if (flag == 1 && emailFlag == 1) {
            this.fullName = fullName;
            this.username = username;
            this.email = email;
            this.birthdate = birthdate;
            this.password = pass;

            OTPCheck(code, f);
        }
    }

    public void OTPCheck(String code, JFrame f) {
        GeneralFunction gf = new GeneralFunction();
        OTPFunctions.codeRef = code;
        OTPVerification otpv = new OTPVerification();
        otpv.setVisible(true);
        f.setVisible(false);
    }

    public void accountCreation() {

        File file = createFile();

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(ed.encrypt("Name: " + fullName) + "\n");
            fw.append(ed.encrypt("Username: " + username) + "\n");
            fw.append(ed.encrypt("Email: " + email) + "\n");
            fw.append(ed.encrypt("Password: " + password) + "\n");
            fw.append(ed.encrypt("OTP: " + OTPFunctions.codeRef) + "\n");
            fw.append(ed.encrypt("Balance: 0.00") + "\n");
            fw.append(ed.encrypt("Family Savings: 0.00") + "\n");
            fw.append(ed.encrypt("Own Savings: 0.00") + "\n");
            fw.append(ed.encrypt("Birthdate: " + birthdate) + "\n");
            fw.append(ed.encrypt("isAdmin: 0") + "\n");
            fw.append(ed.encrypt("Login Status: 0") + "\n");
            fw.append(ed.encrypt("Login Date: " + null) + "\n");
            fw.append(ed.encrypt("BlockCount: 0") + "\n");
            fw.append(ed.encrypt("Date Blocked: " + null) + "\n");
            fw.append(ed.encrypt("Transaction History:") + "\n");
            fw.flush();
            fw.close();
            a.createAudit(fullName, "Created an account.");
            new SignUpOkay().setVisible(true);
        } catch (Exception e) {
            System.out.println("Error(createAccount): " + e);
        }
    }

    public File createFile() {
        //This method is to create an account file
        DecimalFormat df = new DecimalFormat("000000");
        double accountID = 000000;

        String[] accounts = gf.getListofAccounts();

        for (String check : accounts) {
            if (check.equals(df.format(accountID) + ".txt")) {
                accountID++;
            }
        }

        String location = gf.getLocation();
        String tranLoc = gf.getTransactionLocation();
        File acc = new File(location + df.format(accountID) + ".txt");
        File tran = new File(tranLoc + df.format(accountID) + ".txt");

        try {
            acc.createNewFile();
            tran.createNewFile();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return acc;
    }
}
