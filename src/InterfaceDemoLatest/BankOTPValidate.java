package InterfaceDemoLatest;

public interface BankOTPValidate extends BankLoginService {
    String generateOTP(String accountNumber);
    boolean validate(String otp);
}
