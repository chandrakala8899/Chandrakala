package InterfaceDemoLatest;

public class InvalidRunTimeException extends Exception{
    private String code;

    public String getCode() {
        return code;
    }


    public InvalidRunTimeException(String code, String message) {
        super(message);
        this.code = code;
    }
}
