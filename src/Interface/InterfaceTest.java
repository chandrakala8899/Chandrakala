package Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        Games games = new LoginProcess();
        boolean loginStatus = games.login("2244", "9908");
        Games games1 = new FreeFireGame();
        boolean loginStatusFire = games1.login("1122", "8688");
        if (loginStatusFire)
            System.out.println("FreeFire Login Successful");
        else {
            System.out.println("freefire login failed");
        }
        if (loginStatus) {
            System.out.println(" PUBG login Sucessful");
        } else {
            System.out.println("login failed");
        }
    }
}
