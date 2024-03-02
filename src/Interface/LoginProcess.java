package Interface;

public class LoginProcess implements Games {
    PubgGame pubgGame;

    public LoginProcess() {
        this.pubgGame = new PubgGame();
    }

    @Override
    public boolean login(String userID, String passWord) {
        if (pubgGame.login(userID, passWord)) {
            String country = pubgGame.CountrySelect(pubgGame.area);
            boolean selectCountry = pubgGame.login(userID, passWord);
            if (selectCountry) {
               // System.out.println("Login Succesful");
            }
            return selectCountry;
        }else {
            System.out.println("login failed");
        }
        return  false;
    }
}
