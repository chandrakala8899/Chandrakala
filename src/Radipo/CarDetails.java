package Radipo;

public class CarDetails {
    private String carType;
    private String charge;

    @Override
    public String toString() {
        return "CarDetails{" +
                "carType='" + carType + '\'' +
                ", charge='" + charge + '\'' +
                '}';
    }

    public CarDetails(){
        carType = "Shift";
        charge = "1500";
    }

    public String getCarType() {
        return carType;
    }

    public String getCharge() {
        return charge;
    }

    public CarDetails(String carType, String charge) {
        this.carType = carType;
        this.charge = charge;

    }
}
