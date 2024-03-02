package Interface;

public class FreeFireGame implements Games {
    String userID = "1122";
    String passWord = "8688";

    @Override
    public boolean login(String userID, String passWord) {
        if (this.userID.equals(userID) && this.passWord.equals(passWord))
            // System.out.println("login Succesful");
            return true;
        return false;
}

    }


