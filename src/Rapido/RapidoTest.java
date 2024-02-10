package Rapido;

public class RapidoTest {
    public static void main(String[] args) {
        BookingDetails bookingDetails = new BookingDetails("shareAuto","activa",new CarDetails(),4);
        CarDetails carDetails = new CarDetails("Shift","2000");
        BookingProcess bookingProcess = new BookingProcess();
        System.out.println(carDetails);
        System.out.println(bookingProcess.Rapido(bookingDetails));


    }
}
