package InterfaceDemoLatest;

public class LoginTest {
    public static void main(String[] args) {
      BankLoginService loginService = new SBILoginProcess();
      try{
      boolean status = loginService.login("1111","2244");

      if(status){
          System.out.println("login successful");
      }else {
          System.out.println("login failed");
      }
      } catch (RunTimeOTPException  e) {
          System.out.println(e.getCode() +""+e.getMessage());
      } catch (InvalidRunTimeException e) {
          throw new RuntimeException(e);
      }
    }
}

