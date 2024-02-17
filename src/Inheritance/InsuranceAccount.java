package Inheritance;

public class InsuranceAccount extends RetailSAccount {
    public String dOB;

    public InsuranceAccount(String accountNumber, String balance, boolean status, int minimumBalance, int limit) {
        super(accountNumber, balance, status, minimumBalance, limit);
        this.minimumBalance = minimumBalance;
        this.limit = limit;
    }
}
