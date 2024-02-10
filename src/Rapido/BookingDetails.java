package Rapido;

public class BookingDetails {
    public CarDetails car;
    public String auto;
    public String bike;
    private int noOfPersons;

    public CarDetails getCar() {
        return car;
    }

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
                "car=" + car +
                ", auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", noOfPersons=" + noOfPersons +
                '}';
    }

    public BookingDetails(String auto, String bike, CarDetails car, int noOfPersons){
        this.auto= auto;
        this.bike = bike;
        this.car = car;
        this.noOfPersons = noOfPersons;
    }
}
