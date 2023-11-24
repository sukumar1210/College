package customModule;

public class RegularTicket implements Ticket {
    
    public void bookTicket (int numberOfTickets){
        String tickets = String.valueOf(numberOfTickets);
        tickets = "seats - " + tickets + " price - ₹1000" + " id - " + String.valueOf(TicketManager.id);
        TicketManager.bookings.put(TicketManager.id, tickets);
        System.out.println("your booking id is " + TicketManager.id);
        TicketManager.id++;
    }

    public void cancelTicket (int ticketNumber){
        try {
            if (TicketManager.bookings.containsKey(ticketNumber) == false) {
                throw new TicketNotFoundException();
            }
            TicketManager.bookings.remove(ticketNumber);
            System.out.println("ticket id " + ticketNumber + " is cancelled");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void displayTicket (int ticketNumber){
        try {
            if (TicketManager.bookings.containsKey(ticketNumber) == false) {
                throw new TicketNotFoundException();
            }
            System.out.println(TicketManager.bookings.get(ticketNumber));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
