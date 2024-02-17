package Rapido;

public class BookingProcess {
    public BookingDetails Rapido(BookingDetails bookingDetails) {
       // CarDetails carDetails = new CarDetails();
        if (bookingDetails.getNoOfPersons() == 1) {
            System.out.println("Booked="+bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons() >1 && bookingDetails.getNoOfPersons()<4) {
           // bookingDetails.getAuto();
            System.out.println("Booking="+bookingDetails.getAuto());
        }
        if (bookingDetails.getNoOfPersons() >= 4) {
           //carDetails.Car(carDetails);
            System.out.println("Booking Car="+bookingDetails.Car(new CarDetails(bookingDetails.getCarType(), bookingDetails.getCharge(), bookingDetails.getOtp())));
        }
        return bookingDetails;
    }

}
