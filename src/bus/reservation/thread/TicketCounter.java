package bus.reservation.thread;

public class TicketCounter {
	private int availableSeats = 3;

	public void bookTicket(String name, int numberOfSeats) {
		if ((availableSeats > numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println(name + " : booking successful");
			availableSeats = availableSeats - numberOfSeats;
		} else {
			System.out.println(name + " : seats not available");
		}
	}
}
