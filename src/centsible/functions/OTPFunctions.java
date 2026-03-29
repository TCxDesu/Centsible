package centsible.functions;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OTPFunctions {

    public static String codeRef = ""; //static to access from different class

    String code = ""; //to store user input globally

    JTextField otpCode = new JTextField();
    JFrame otp;

    int count = 0;

    static File file;

    public OTPFunctions() {
        /*
        empty constructor to initialize OTPFunctions to other class that needs
        the functions that is not OTPValidation frame
         */
    }

    public OTPFunctions(JTextField txtOTP, JFrame f) {
        //get the textfields and frame
        otpCode = txtOTP;
        otp = f;
    }

    public void verification(File file) {
        this.file = file;
    }

    public void verified(boolean status) {
        if (status == true) {
            SignupFunction sf = new SignupFunction();
            sf.accountCreation();
            otp.dispose();
        } else {
            if (count + 1 < 3) {
                JOptionPane.showMessageDialog(null, "Incorrect Code.");
                count++;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Code. "
                        + "Account Creation Failed.");
                otp.dispose();
            }
        }
    }

    public void checkOTP(String code) {
        //to verify if the otp is correct

        try {
            if (code.equals(codeRef)) {
                verified(true);
            } else {
                verified(false);
            }
        } catch (Exception e) {
            System.out.println("Error(checkOTP): " + e);
        }

    }

    public void checkKey(KeyEvent evt, Toolkit toolkit, JTextField txtOTP) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            toolkit.beep();
            evt.consume();
        }
    }
}
