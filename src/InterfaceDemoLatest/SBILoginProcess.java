package InterfaceDemoLatest;

import java.util.UUID;

public class SBILoginProcess implements BankLoginService{
 SBIBankService sbiBankService ;
 public SBILoginProcess(){
     this.sbiBankService = new SBIBankService();

 }
    public SBILoginProcess( SBIBankService sbiBankService){
        this.sbiBankService = new SBIBankService();

    }
    @Override
    public boolean login(String userName, String password) {
        if (sbiBankService.login(userName, password)) {
            String opt = sbiBankService.generateOTP(userName);
            boolean validateotp = false;
            try {
                validateotp = sbiBankService.validate(UUID.randomUUID().toString());
            } catch (InvalidOTPException exp) {
                System.out.println(" ERROR Occured" + exp);
                throw  new RunTimeOTPException(exp.getCode(),exp.getMessage());
            }catch (Exception e){
            }
            if (validateotp) {
                System.out.println("validate otp & login Succesful");
            } else {
                System.out.println("login failed");
            }
                return validateotp;
            }
            else {
                System.out.println("invalid");
                return false ;
            }
        }
    }

