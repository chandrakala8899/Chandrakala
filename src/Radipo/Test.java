package Radipo;

public class Test {
    public static void main(String[] args) {

        BookingProcess bookingProcess = new BookingProcess();
        CarDetails carDetails = new CarDetails("BMW", "1000");
        BookingDetails bookingDetails = new BookingDetails(1234,"Rapido Auto",
                "Bike",4,carDetails);
        bookingProcess.rapidoBooking(bookingDetails);

            }
}
