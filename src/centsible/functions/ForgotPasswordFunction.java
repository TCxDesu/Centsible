package centsible.functions;

import centsible.datas.Accounts;
import centsible.datas.Email;
import centsible.mail.EmailSender;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ForgotPasswordFunction {

    public static int emailCheck = 0;

    String code = "";

    String imgLocation = "";

    ImageIcon show, hide;

    GeneralFunction gf = new GeneralFunction();

    public ForgotPasswordFunction(JTextField txtEmail, JPasswordField txtPass,
            JPasswordField txtConPass, JTextField verCode) {
        Color customColor = new Color(153, 255, 153);
        txtPass.setEchoChar((char) 0);
        getLocation();
        show = new ImageIcon(imgLocation + "eye.png");
        hide = new ImageIcon(imgLocation + "hidden.png");
        verCode.setForeground(customColor);
        txtEmail.setForeground(customColor);
        txtPass.setForeground(customColor);
        txtConPass.setForeground(customColor);
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
                .equals("New Password")) {
            txtPass.setText(password);
        } else {
            txtPass.setText("New Password");
            txtPass.setEchoChar((char) 0);
            password = "";
        }
        return password;
    }
//#3

    public int showPassword(int flag, JPasswordField txtPass, JLabel temp) {
        if (!(txtPass.getText().equals("New Password"))) {
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
    public void checkKeyPressed(KeyEvent evt, JTextField txtEmail,
            JPasswordField txtPassword, JPasswordField txtConPass,
            JTextField txtVerCode) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
//            validation(txtUser, txtPassword);
        }
    }

    //FOR VERIFICATION CODE TEXTFIELD CODES BELOW
//#1    
    public void verifyFocusGained(JTextField txtEmail, String email) {
        txtEmail.setText("");
        txtEmail.setText(email);
        txtEmail.setForeground(Color.BLACK);
    }
//#2

    public String verifiyFocusLost(JTextField txtEmail, String email) {
        Color customColor = new Color(153, 255, 153);
        txtEmail.setForeground(customColor);
        if (email.trim().length() != 0 && !email.trim()
                .equals("Verification Code")) {
            txtEmail.setText(email);
        } else {
            txtEmail.setText("Verification Code");
            email = "";
        }
        return email;
    }

    public void confirmChange(JTextField txtEmail, JPasswordField txtPass,
            JPasswordField txtConPass, JTextField txtOTP) {

        AuditFunction au = new AuditFunction();
        
        String email = txtEmail.getText();
        String pass = txtPass.getText();
        String conPass = txtConPass.getText();
        String otp = txtOTP.getText();

        if (!(email.equals("Email")) && !(pass.equals("New Password"))
                && !(pass.equals("Enter Password"))
                && !(pass.equals("Password"))
                && !(conPass.equals("Confirm Password"))
                && !(conPass.equals("Enter Password"))
                && !(conPass.equals("New Password"))
                && !(otp.equals("Verification Code"))) {
            if (pass.equals(conPass)) {
                if (otp.equals(code)) {
                    for (Accounts a : GeneralFunction.list) {
                        if (email.equals(a.getEmail())) {
                            if (a.getLoginStatus() == 1) {
                                String x = "This account is logged in. "
                                        + "Password cannot be changed.";
                                JOptionPane.showMessageDialog(null, x);
                                break;
                            } else {
                                a.setPassword(pass);
                                au.createAudit(a.getUsername(), "Changed "
                                        + "Password.");
                                GeneralFunction.rewrite();
                                String x = "Password successfully changed.";
                                JOptionPane.showMessageDialog(null, x);
                                break;
                            }
                        }
                    }
                } else {
                    String x = "Verification Code does not match.";
                    JOptionPane.showMessageDialog(null, x);
                }
            } else {
                String x = "Password and Confirm Password does not match.";
                JOptionPane.showMessageDialog(null, x);
            }
        } else {
            String x = "Password change failed: Please complete all required "
                    + "fields \nand ensure the information provided is valid.";
            JOptionPane.showMessageDialog(null, x);
        }

    }

    public void sendOTP(JTextField txtEmail) {
        OTPGenerator gen = new OTPGenerator();

        EmailSender es = new EmailSender();

        String email = txtEmail.getText();

        try {
            code = gen.generateVerifyCode();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String fullName = "";

        for (Accounts a : GeneralFunction.list) {
            if (a.getEmail().equals(email)) {
                fullName = a.getFullName();
                String message = gf.forgotPassMessage(fullName, code);
                Email e = new Email();
                e = es.forgotPasswordSend(email, message);
                emailCheck = 1;
                break;
            } else {
                emailCheck = 0;
            }
        }

        if (fullName.equals("") && emailCheck == 0) {
            JOptionPane.showMessageDialog(null, "Email is not registered.");
        } else if (emailCheck == 1) {
            JOptionPane.showMessageDialog(null, "A code has been sent to your "
                    + "email.");
            txtEmail.setEditable(false);
        }
    }
}
