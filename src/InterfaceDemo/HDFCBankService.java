package InterfaceDemo;

public class HDFCBankService implements RBIBankingService{
    @Override
    public String transfer(String fromAccount, String toAccount, int amount) {
        return "HDFC Bank";
    }
}
