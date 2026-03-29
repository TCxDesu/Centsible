package centsible.datas;

import java.util.ArrayList;

public class Accounts {

    private double balance, ownSavings, familySavings;
    private int accountType; //0 if user, 1 if admin
    private int blockCount;//0 default, 3 blocked
    private int loginStatus;//0 default, 1 logged in
    private String fullName, username, email, password, otp, birthdate;
    private String accID, dateBlocked, loginDate;
    
    public int getLoginStatus() {
        return loginStatus;
    }

    public double getOwnSavings() {
        return ownSavings;
    }

    public void setOwnSavings(double ownSavings) {
        this.ownSavings = ownSavings;
    }

    public double getFamilySavings() {
        return familySavings;
    }

    public void setFamilySavings(double familySavings) {
        this.familySavings = familySavings;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
    
    

    public String getDateBlocked() {
        return dateBlocked;
    }

    public void setDateBlocked(String dateBlocked) {
        this.dateBlocked = dateBlocked;
    }

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public Accounts(String accID, String fullName, String username, String email,
            String password, String otp, String birthdate, String dateBlocked,
            int accountType, int blockCount, double balance, int loginStatus,
            double familySavings, double ownSavings, String loginDate) {

        this.accID = accID;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.otp = otp;
        this.balance = balance;
        this.birthdate = birthdate;
        this.accountType = accountType;
        this.loginStatus = loginStatus;
        this.loginDate = loginDate;
        this.blockCount = blockCount;
        this.dateBlocked = dateBlocked;
        this.familySavings = familySavings;
        this.ownSavings = ownSavings;
    }

    public Accounts(String accID, String fullName, String username, String email,
            String password, String otp, String birthdate, String dateBlocked,
            int accountType, int blockCount, int loginStatus, 
            double familySavings, double ownSavings, String loginDate) {
        
        this.accID = accID;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.otp = otp;
        this.balance = 0.00;
        this.birthdate = birthdate;
        this.accountType = accountType;
        this.loginStatus = loginStatus;
        this.loginDate = loginDate;
        this.blockCount = blockCount;
        this.dateBlocked = dateBlocked;
        this.familySavings = familySavings;
        this.ownSavings = ownSavings;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

}
