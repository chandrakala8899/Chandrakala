package InterfaceDemoLatest;

public class InvalidOTPException extends Exception{
  private String Code;

    public String getCode() {
        return Code;
    }

    public InvalidOTPException(String code, String message) {
        super(message);
        this.Code = code;
    }

}
