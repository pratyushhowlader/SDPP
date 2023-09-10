package delegation;

public class TicketBookingAgent implements TravelBooking{
    TravelBooking travelBooking;
    public TicketBookingAgent(TravelBooking tv) {
        this.travelBooking = tv;
    }

    @Override
    public void bookTicket() {
      this.travelBooking.bookTicket();
    }
}
