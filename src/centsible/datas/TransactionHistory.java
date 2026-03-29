package centsible.datas;

import java.util.ArrayList;

public class TransactionHistory {
    private String dateTime, transaction, amount;
    private String accID;

    public String getAccID() {
        return accID;
    }

    public void setAccID(String accID) {
        this.accID = accID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TransactionHistory(String dateTime, String transaction, String amount, String accID) {
        this.dateTime = dateTime;
        this.transaction = transaction;
        this.amount = amount;
        this.accID = accID;
    }
}
