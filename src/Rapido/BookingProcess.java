package Rapido;

public class BookingProcess {
    public BookingDetails Rapido(BookingDetails bookingDetails) {
        if (bookingDetails.getNoOfPersons() <= 1) {
            bookingDetails.getBike();
            System.out.println("Booked="+bookingDetails.getBike());
        }
        if (bookingDetails.getNoOfPersons() <= 3) {
            bookingDetails.getAuto();
            System.out.println("Booking="+ bookingDetails.getAuto());
        }
        if (bookingDetails.getNoOfPersons() >= 3) {
            bookingDetails.getCar();
            System.out.println("Booking Car="+ bookingDetails.getCar());
        }
        return bookingDetails;
    }

}
