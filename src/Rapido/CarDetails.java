package Rapido;

public class CarDetails {
    private String carType;

    private String Charge;
    private int otp;



    @Override
    public String toString() {
        return "CarDetails{" +
                "carType='" + carType + '\'' +
                ", Charge='" + Charge + '\'' +
                ", otp=" + otp +
                '}';
    }

    public int getOtp()
    {
        return otp;
    }

    public String getCarType()
    {
        return carType;
    }

    public String getCharge() {
        return Charge;
    }
  public CarDetails(){
     carType ="BMW";
     Charge = "2000";
    otp = 123;


    }


    public CarDetails(String carType, String charge, int otp ){
        this.carType = carType;
        this.Charge = charge;
        this.otp = otp;
    }
//    public CarDetails getcar(String carType,String charge){
//        CarDetails sr = new CarDetails("car","1234",2244);
//        System.out.println(sr);
//        return getcar("car","1000");
//    }
   public CarDetails Car(CarDetails carDetails){
     getCarType();
     getCharge();
     getOtp();
     return carDetails;

    }

}

