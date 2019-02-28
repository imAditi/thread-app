package bus.reservation.thread;

public class TicketTest {
	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
		TicketBookingThread ticketBookingThread1 = new TicketBookingThread(ticketCounter, "John", 2);
		TicketBookingThread ticketBookingThread2 = new TicketBookingThread(ticketCounter, "Martin", 2);
		ticketBookingThread1.start();
		ticketBookingThread2.start();
	}
}
