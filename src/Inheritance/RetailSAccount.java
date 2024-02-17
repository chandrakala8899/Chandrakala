package Inheritance;

public class RetailSAccount extends Account{
    public int minimumBalance = 1000;
    public int limit = 20;

    @Override
    public String toString() {
        return "RetailSAccount{" +
                "minimumBalance=" + minimumBalance +
                ", limit=" + limit +
                '}';
    }

    public RetailSAccount(String accountNumber, String balance, boolean status, int minimumBalance, int limit) {
        super(accountNumber, balance, status);
        this.minimumBalance = minimumBalance;
        this.limit = limit;
    }
    public String getAccount(Account account) {
        return "Sample Test";
    }
}
