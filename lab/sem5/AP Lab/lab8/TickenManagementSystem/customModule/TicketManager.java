package customModule;

import java.util.HashMap;

public class TicketManager implements Ticket {
    
    static HashMap<Integer, String> bookings = new HashMap<Integer, String>();
    static int id = 1;

    public void bookTicket (int numberOfTickets){
        String tickets = String.valueOf(numberOfTickets);
        tickets = "seats - " + tickets + " price - ₹1000" + " id - " + String.valueOf(id);
        bookings.put(id, tickets);
        System.out.println("your booking id is " + id);
        id++;
    }

    public void cancelTicket (int ticketNumber){
        try {
            if (bookings.containsKey(ticketNumber) == false) {
                throw new TicketNotFoundException();
            }
            bookings.remove(ticketNumber);
            System.out.println("ticket id " + ticketNumber + " is cancelled");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void displayTicket (int ticketNumber){
        try {
            if (bookings.containsKey(ticketNumber) == false) {
                throw new TicketNotFoundException();
            }
            System.out.println(bookings.get(ticketNumber));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
