package delegation;

public class TrainTicket implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Booking TrainTicket");
    }
}
