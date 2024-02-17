package Rapido;

public class RapidoTest {
    public static void main(String[] args) {
        CarDetails carDetails = new CarDetails("Shift","2000",1234);

        BookingDetails bookingDetails = new BookingDetails("shareAuto","activa",carDetails,1);
        BookingProcess bookingProcess = new BookingProcess();
        //System.out.println(carDetails);
        bookingProcess.Rapido(bookingDetails);
       // System.out.println(carDetails.getCar("car","2000",1234));


    }
}
