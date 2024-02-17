package Rapido;

public class BookingDetails extends CarDetails {
    public CarDetails car;
    public String auto;
    public String bike;
    private int noOfPersons;


    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", noOfPersons=" + noOfPersons +
                '}';
    }

    public BookingDetails(String auto, String bike, CarDetails carDetails,int noOfPersons){
        super(carDetails.getCarType(), carDetails.getCharge(), carDetails.getOtp());
        this.auto= auto;
        this.bike = bike;
        //this.car = car;
        this.noOfPersons = noOfPersons;
    }
}
