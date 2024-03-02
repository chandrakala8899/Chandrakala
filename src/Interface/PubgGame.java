package Interface;

public class PubgGame implements SelectCountry {
    String userID = "4455";
    String passWord = "9908";
    String area = "USA";

    @Override
    public boolean login(String userID, String passWord) {
        if (userID.equals(userID) && this.passWord.equals(passWord))
            return true;
        return false;
    }


    @Override
    public String CountrySelect(String area) {
        if (this.area.equals(area))
            System.out.println("Country");
            return "Country";
    }

}

