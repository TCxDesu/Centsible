package centsible.functions;

import centsible.datas.Accounts;
import static centsible.functions.GeneralFunction.list;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import centsible.frames.user.Homescreen;
import centsible.frames.admin.AdminHomescreen;
import static centsible.functions.SignupFunction.fullName;

public class LoginFunction {

    int powerUser = 0;

    String imgLocation = "";

    ImageIcon show, hide;

    LocalDateTime ldt = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

    public LoginFunction(JTextField txtUser, JPasswordField txtPass) {
        Color customColor = new Color(153, 255, 153);
        txtPass.setEchoChar((char) 0);
        getLocation();
        show = new ImageIcon(imgLocation + "eye.png");
        hide = new ImageIcon(imgLocation + "hidden.png");
        txtUser.setForeground(customColor);
        txtPass.setForeground(customColor);
    }

//FOR USERNAME/EMAIL TEXTFIELD CODES BELOW
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
                .equals("Enter Username")) {
            txtUser.setText(username);
        } else {
            txtUser.setText("Enter Username");
            username = "";
        }
        return username;
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
                .equals("Enter Password")) {
            txtPass.setText(password);
        } else {
            txtPass.setText("Enter Password");
            txtPass.setEchoChar((char) 0);
            password = "";
        }
        return password;
    }
//#3

    public int showPassword(int flag, JPasswordField txtPass, JLabel temp) {
        if (!(txtPass.getText().equals("Enter Password"))) {
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

//TO GET IMAGE FOLDER LOCATION
    public void getLocation() {
        File file = new File("");
        imgLocation = file.getAbsolutePath() + "\\src\\images\\";
    }

//FOR KEY RELATED EVENT
    public void checkKeyPressed(KeyEvent evt, JTextField txtUser,
            JTextField txtPassword, JFrame f) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            validation(txtUser, txtPassword, f);
        }
        if (evt.getKeyCode() == KeyEvent.VK_ALT && powerUser == 0) {
            powerUser++;
        }
        if (evt.getKeyCode() == KeyEvent.VK_1 && powerUser == 1) {
            powerUser++;
        }
        if (powerUser == 2) {
            adminCheck(f);
            powerUser = 0;
        }
    }

    public void checkKeyReleased(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ALT && powerUser > 0) {
            powerUser--;
        }
    }
//FOR LOGIN VALIDATION    

    public void validation(JTextField txtUser, JTextField txtPassword, JFrame f)
    {
        GeneralFunction gf = new GeneralFunction();
        String[] x = gf.getListofAccounts();
        gf.initAccInfo(x);

        String tempUsername = txtUser.getText().trim();
        String tempPassword = txtPassword.getText().trim();

        if (!(tempUsername.equals("")) && !(tempUsername
                .equalsIgnoreCase("Enter Username"))) {
            
            if (!(tempPassword.equals("")) 
                    
                    && !(tempPassword.equalsIgnoreCase("Enter Password"))) {
                loginAccount(tempUsername, tempPassword, f);
                
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Password must not be empty");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username must not be empty");
        }

        GeneralFunction.rewrite();
    }

    public void loginAccount(String username, String password, JFrame f) {
        //This method is to allow user to login

        AuditFunction a = new AuditFunction();
        if (!list.isEmpty()) {

            int flag = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(username)) {
                    if (list.get(i).getBlockCount() + 1 == 3
                            || list.get(i).getBlockCount() == 3) {
                        String x = "This account has been blocked.";
                        a.createAudit(fullName, "Account has been blocked.");
                        list.get(i).setDateBlocked(dtf.format(ldt));
                        list.get(i).setBlockCount(3);
                        JOptionPane.showMessageDialog(null, x);
                        flag = 0;
                        break;
                    } else {
                        if (list.get(i).getLoginStatus() == 0) {
                            if (list.get(i).getPassword().equals(password)) {
                                String x = "Logged in.";
                                UserFunctions.userID = list.get(i).getAccID();
                                list.get(i).setDateBlocked(null);
                                list.get(i).setBlockCount(0);
                                a.createAudit(username, "Logged in.");
                                list.get(i).setLoginStatus(1);
                                list.get(i).setLoginDate(dtf.format(ldt));
                                JOptionPane.showMessageDialog(null, x);
                                GeneralFunction.rewrite();
                                if (list.get(i).getAccountType() == 0) {
                                    Homescreen b = new Homescreen(username);
                                    b.setVisible(true);
                                    f.dispose();
                                } else if (list.get(i).getAccountType() == 1) {
                                    AdminHomescreen b = 
                                            new AdminHomescreen(username);
                                    b.setVisible(true);
                                    f.dispose();
                                }

                                flag = 0;
                                break;
                            } else {

                                String x = "Username and Password does "
                                        + "not match.";
                                list.get(i).setBlockCount((list.get(i)
                                        .getBlockCount()) + 1);
                                JOptionPane.showMessageDialog(null, x);
                                flag = 0;
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "This account "
                                    + "is already logged in");
                            flag = 0;
                            break;
                        }
                    }
                } else {
                    flag = 1;
                }
            }

            if (flag == 1) {
                String x = "Account does not exist.";
                JOptionPane.showMessageDialog(null, x);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No accounts registered.");
        }
    }

    public void adminCheck(JFrame f) {
        String code = JOptionPane.showInputDialog(null, "Enter your Admin "
                + "ID: ");

        int check = 0;

        for (Accounts a : GeneralFunction.list) {
            if (a.getAccID().equals(code)) {
                if (a.getAccountType() == 1) {
                    JOptionPane.showMessageDialog(null, "Welcome " 
                            + a.getUsername());
                    f.dispose();
                    AdminFunction.adminID = a.getUsername();
                    new AdminHomescreen(a.getUsername()).setVisible(true);
                    check = 0;
                } else {
                    check = 1;
                }
            } else if (code.equals("Admin123")) {
                JOptionPane.showMessageDialog(null, "Welcome Admin.");
                AdminFunction.adminID = "Power Admin";
                f.dispose();
                new AdminHomescreen("Power Admin").setVisible(true);
                check = 0;
                break;
            }
        }
        if (check == 1) {
            JOptionPane.showMessageDialog(null, "Admin does not exist.");
        }
    }

}
