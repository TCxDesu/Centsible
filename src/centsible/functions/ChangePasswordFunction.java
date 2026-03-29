package centsible.functions;

import centsible.datas.Accounts;
import centsible.frames.admin.AdminInfo;
import centsible.frames.user.UserInfo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChangePasswordFunction {

    String imgLocation = "";

    ImageIcon show, hide;

    GeneralFunction gf = new GeneralFunction();

    public ChangePasswordFunction(JPasswordField txtOldPass,
            JPasswordField txtPass, JPasswordField txtConPass) {
        Color customColor = new Color(153, 255, 153);
        txtOldPass.setEchoChar((char) 0);
        txtPass.setEchoChar((char) 0);
        txtConPass.setEchoChar((char) 0);
        getLocation();
        show = new ImageIcon(imgLocation + "eye.png");
        hide = new ImageIcon(imgLocation + "hidden.png");
        txtOldPass.setForeground(customColor);
        txtPass.setForeground(customColor);
        txtConPass.setForeground(customColor);
    }

    //FOR PASSWORDFIELD CODES BELOW 
//#1    
    public void oldPassFocusGained(JPasswordField txtPass, String pass, 
            int flag) {
        txtPass.setText("");
        txtPass.setText(pass);
        txtPass.setForeground(Color.BLACK);
        txtPass.setEchoChar(('\u2022'));

        if (flag == 1) {
            txtPass.setEchoChar(((char) 0));
        }
    }
//#2    

    public String oldPassFocusLost(JPasswordField txtPass, String password) {
        Color customColor = new Color(153, 255, 153);
        txtPass.setForeground(customColor);
        if (password.trim().length() != 0 && !password.trim()
                .equals("Old Password")) {
            txtPass.setText(password);
        } else {
            txtPass.setText("Old Password");
            txtPass.setEchoChar((char) 0);
            password = "";
        }
        return password;
    }
//#3

    public int showOldPassword(int flag, JPasswordField txtPass, JLabel temp) {
        if (!(txtPass.getText().equals("Old Password"))) {
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
    public void checkKeyPressed(KeyEvent evt, JPasswordField txtOldPass,
            JPasswordField txtPassword, JPasswordField txtConPass) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
//            validation(txtUser, txtPassword);
        }
    }

    public void confirmChange(JPasswordField txtOldPass, JPasswordField txtPass,
            JPasswordField txtConPass, String username, JFrame f) {

        int oldPassFlag = 0;

        String oldPass = txtOldPass.getText();
        String pass = txtPass.getText();
        String conPass = txtConPass.getText();

        if (!(oldPass.equals("Old Password"))
                && !(oldPass.equals("Password"))
                && !(oldPass.equals("New Password"))
                && !(oldPass.equals("Confirm Password"))
                && !(pass.equals("Enter Password"))
                && !(pass.equals("Password"))
                && !(conPass.equals("Confirm Password"))
                && !(conPass.equals("Enter Password"))
                && !(conPass.equals("New Password"))) {
            if (pass.equals(conPass)) {
                for (Accounts a : GeneralFunction.list) {
                    if (oldPass.equals(a.getPassword())) {
                        if (username.equals(a.getUsername())) {
                            a.setPassword(pass);
                            GeneralFunction.rewrite();
                            String x = "Password successfully changed.";
                            JOptionPane.showMessageDialog(null, x);
                            f.dispose();
                            new UserInfo().setVisible(true);
                            oldPassFlag = 0;
                            break;
                        }
                    } else {
                        oldPassFlag = 1;
                    }
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

        if (oldPassFlag == 1) {
            String x = "Old Password is incorrect.";
            JOptionPane.showMessageDialog(null, x);
        }

    }
    public void confirmChangeAdmin(JPasswordField txtOldPass, JPasswordField 
            txtPass, JPasswordField txtConPass, String username, JFrame f) {

        int oldPassFlag = 0;

        String oldPass = txtOldPass.getText();
        String pass = txtPass.getText();
        String conPass = txtConPass.getText();

        if (!(oldPass.equals("Old Password"))
                && !(oldPass.equals("Password"))
                && !(oldPass.equals("New Password"))
                && !(oldPass.equals("Confirm Password"))
                && !(pass.equals("Enter Password"))
                && !(pass.equals("Password"))
                && !(conPass.equals("Confirm Password"))
                && !(conPass.equals("Enter Password"))
                && !(conPass.equals("New Password"))) {
            if (pass.equals(conPass)) {
                for (Accounts a : GeneralFunction.list) {
                    if (oldPass.equals(a.getPassword())) {
                        if (username.equals(a.getUsername())) {
                            a.setPassword(pass);
                            GeneralFunction.rewrite();
                            String x = "Password successfully changed.";
                            JOptionPane.showMessageDialog(null, x);
                            f.dispose();
                            new AdminInfo().setVisible(true);
                            oldPassFlag = 0;
                            break;
                        }
                    } else {
                        oldPassFlag = 1;
                    }
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

        if (oldPassFlag == 1) {
            String x = "Old Password is incorrect.";
            JOptionPane.showMessageDialog(null, x);
        }

    }
}
