package Rapido;

public class CarDetails {
    private String carType;

    private String Charge;

    public String getCarType() {
        return carType;
    }

    public String getCharge() {
        return Charge;
    }
    public CarDetails(){
     carType = "Shift";
     Charge = "200";
    }


    @Override
    public String toString() {
        return "CarDetails{" +
               "carType='" + carType + '\'' +
                ", Charge='" + Charge + '\'' +
               '}';
   }

    public CarDetails(String carType, String charge){
        this.carType = carType;
        this.Charge = charge;
    }
}
