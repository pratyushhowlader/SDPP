package delegation;

public class FlightTicket implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Flight Ticket Booking");
    }
}
