package InterfaceDemo;

public class SBIBankingService implements RBIBankingService{
    @Override
    public String transfer(String fromAccount, String toAccount, int amount) {
        return "SBI Bank";
    }
}
