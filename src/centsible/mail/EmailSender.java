package centsible.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;
import centsible.datas.Email;
import centsible.functions.ForgotPasswordFunction;
import centsible.functions.SignupFunction;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EmailSender {

    public Email sendMain(String toEmail, String code) {
        Email ms = new Email(false, "");
        String from = "email nyo dito";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "email nyo dito";
        String password = "password ng email nyo dito pero di advised"; //lagay nyo dito ung app password makikita un sa 2 way verification
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress(toEmail));
            message.setSubject("Your Verification Code");
            message.setText(code);
            Transport.send(message);
            ms.setSuccess(true);
            SignupFunction.emailFlag = 1;
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                ms.setMessage("Invalid email");
                JOptionPane.showMessageDialog(null, "Invalid Email");
                SignupFunction.emailFlag = 0;
            } else {
                ms.setMessage("Error");
                JOptionPane.showMessageDialog(null, "An Error Occured");
                SignupFunction.emailFlag = 0;
            }
        }
        return ms;
    }

    public Email forgotPasswordSend(String toEmail, String code) {
        Email ms = new Email(false, "");
        String from = "email nyo dito";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "email nyo dito";
        String password = "password ng email nyo dito pero di advised"; //lagay nyo dito ung app password makikita un sa 2 way verification
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress(toEmail));
            message.setSubject("Your Verification Code");
            message.setText(code);
            Transport.send(message);
            ms.setSuccess(true);
            ForgotPasswordFunction.emailCheck = 1;
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                ms.setMessage("Invalid email");
                JOptionPane.showMessageDialog(null, "Invalid Email");
                ForgotPasswordFunction.emailCheck = 2;
            } else {
                ms.setMessage("Error");
                JOptionPane.showMessageDialog(null, "An Error Occured");
                ForgotPasswordFunction.emailCheck = 2;
            }
        }
        return ms;
    }

    public Email bankTransferReceipt(String toEmail, String code) {
        Email ms = new Email(false, "");
        String from = "email nyo dito";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "email nyo dito";
        String password = "password ng email nyo dito pero di advised"; //lagay nyo dito ung app password makikita un sa 2 way verification
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress(toEmail));
            message.setSubject("Bank Transfer Receipt");
            message.setText(code);
            Transport.send(message);
            ms.setSuccess(true);
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                ms.setMessage("Invalid email");
                JOptionPane.showMessageDialog(null, "Invalid Email");
            } else {
                ms.setMessage("Error");
                JOptionPane.showMessageDialog(null, "An Error Occured");
            }
        }
        return ms;
    }
    
    public Email payBillsReceipt(String toEmail, String code) {
        Email ms = new Email(false, "");
        String from = "email nyo dito";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "email nyo dito";
        String password = "password ng email nyo dito pero di advised"; //lagay nyo dito ung app password makikita un sa 2 way verification
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress(toEmail));
            message.setSubject("Bill Payment Receipt");
            message.setText(code);
            Transport.send(message);
            ms.setSuccess(true);
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                ms.setMessage("Invalid email");
                JOptionPane.showMessageDialog(null, "Invalid Email");
            } else {
                ms.setMessage("Error");
                JOptionPane.showMessageDialog(null, "An Error Occured");
            }
        }
        return ms;
    }
    
    public Email sendMoneyReceipt(String toEmail, String code) {
        Email ms = new Email(false, "");
        String from = "email nyo dito"; //email nyo dito
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "email nyo dito"; //email nyo dito
        String password = "password ng email nyo dito pero di advised"; //lagay nyo dito ung app password makikita un sa 2 way verification
        Session session = Session.getInstance(prop, 
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);

            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress(toEmail));
            message.setSubject("Money Transfer Receipt");
            message.setText(code);
            Transport.send(message);
            ms.setSuccess(true);
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                ms.setMessage("Invalid email");
                JOptionPane.showMessageDialog(null, "Invalid Email");
            } else {
                ms.setMessage("Error");
                JOptionPane.showMessageDialog(null, "An Error Occured");
            }
        }
        return ms;
    }

}
