package InterfaceDemoLatest;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankService implements BankOTPValidate{
    String accountNumber = "1111";
    String passWord = "2244";
    String otp;
    Date otpExpireTime;
    public SBIBankService(){
    }
    @Override
    public boolean login(String userName, String password) {
      if(userName.equals(accountNumber) &&  this.passWord.equals(password)){
          return true ;
      }
      return false;
    }
    @Override
    public String generateOTP(String accountNumber) {
        if(this.accountNumber.equals(accountNumber)){
            otp = UUID.randomUUID().toString();
            Calendar otpExpiryCalender = Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND,60);
            System.out.println("otp expirecalender"+otpExpiryCalender.getTime());
            otpExpireTime = otpExpiryCalender.getTime();
            return otp;
        }
        return null;
    }
    @Override
    public boolean validate(String otp) throws InvalidOTPException {
        if (this.otp.equals(otp)){
            return true;
        } else {
            System.out.println("invalid otp");
            throw new InvalidOTPException(ErrorCode.NEOTERIC_ERROR_OTP_1000.getCode(),
                    ErrorCode.NEOTERIC_ERROR_OTP_1000.getMessage());
        }
    }
}
