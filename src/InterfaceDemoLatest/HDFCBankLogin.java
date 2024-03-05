package InterfaceDemoLatest;

public class HDFCBankLogin implements BankLoginService{
    String accountNumber = "4444";
    String passWord = "1122";

    @Override
    public boolean login(String userName, String password) {
        if(userName.equals(userName) && this.passWord.equals(password)){
            System.out.println("login sucessful");

            return true;

        }
        return false;
    }
}
