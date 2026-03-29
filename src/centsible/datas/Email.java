package centsible.datas;

public class Email {
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Email(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Email() {
    }

    private boolean success;
    private String message;
}
