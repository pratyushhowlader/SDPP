package delegation;



public class DelegationDemo {
    public static void main(String[] args) {
        TicketBookingAgent ob = new TicketBookingAgent(new TrainTicket());
        ob.bookTicket();
        ob = new TicketBookingAgent(new FlightTicket());
        ob.bookTicket();
    }
}
