package centsible.functions;

import centsible.datas.Accounts;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SavingsFunction {

    public static String savingsType;
    public static ImageIcon savingsLogo;
    public static int choice;

    public void setBill(int choice) {
        SavingsFunction.choice = choice;
        switch (choice) {
            case 1:
                SavingsFunction.savingsType = "Family Funds";
                savingsLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\FamFunds.png");
                break;
            case 2:
                SavingsFunction.savingsType = "Own Funds";
                savingsLogo = new ImageIcon(System.getProperty("user.dir") 
                        + "\\src\\userImages\\OwnFunds.png");
                break;
        }
    }

    public double getFunds(String username) {
        double amount = 0;

        switch (choice) {
            case 1:
                for (Accounts a : GeneralFunction.list) {
                    if (a.getUsername().equals(username)) {
                        amount = a.getFamilySavings();
                        break;
                    }
                }
                break;
            case 2:
                for (Accounts a : GeneralFunction.list) {
                    if (a.getUsername().equals(username)) {
                        amount = a.getOwnSavings();
                        break;
                    }
                }
                break;
        }
        return amount;
    }

    public void setFunds(String username, JLabel txtFam, JLabel txtOwn, 
            JLabel txtTotal) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        for (Accounts a : GeneralFunction.list) {
            if (a.getUsername().equals(username)) {
                txtFam.setText(df.format(a.getFamilySavings()));
                txtOwn.setText(df.format(a.getOwnSavings()));
                txtTotal.setText(df.format((a.getFamilySavings() + 
                        a.getOwnSavings())));
                break;
            }
        }
    }

    public double getBalance(int choice, String username) {
        double balance = 0;

        switch (choice) {
            case 1://Add Funds
                for (Accounts a : GeneralFunction.list) {
                    if (a.getUsername().equals(username)) {
                        balance = a.getBalance();
                        break;
                    }
                }
                break;
            case 2://Move Family Funds
                for (Accounts a : GeneralFunction.list) {
                    if (a.getUsername().equals(username)) {
                        balance = a.getFamilySavings();
                        break;
                    }
                }
                break;
            case 3://Move Own Funds
                for (Accounts a : GeneralFunction.list) {
                    if (a.getUsername().equals(username)) {
                        balance = a.getOwnSavings();
                        break;
                    }
                }
                break;
            default:
                throw new AssertionError();
        }

        return balance;
    }
}
