package Inheritance;

public class Account {
    private String accountNumber;
    private String  balance;
    private boolean status;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance='" + balance + '\'' +
                ", status=" + status +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBalance() {
        return balance;
    }

    public boolean isStatus() {
        return status;
    }

    public Account(String accountNumber, String balance, boolean status) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
    }
}