package customModule;

public class VipPass implements Ticket{
    
    public void bookTicket(int numberOfTickets) {
        String info = String.valueOf(numberOfTickets);
        info = " [VIP PASS]" + " seats - " + info + " price - ₹1000" + " id - " + String.valueOf(TicketManager.id);
        TicketManager.bookings.put(TicketManager.id, info);
        TicketManager.id++;
    }

    public void cancelTicket(int ticketNumber) {
        try {
            if (TicketManager.bookings.containsKey(ticketNumber) == false) {
                throw new TicketNotFoundException();
            }
            TicketManager.bookings.remove(ticketNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayTicket(int ticketNumber) {
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
