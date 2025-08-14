package com.aurionpro.MiniProject;

public class Ticket {
	String customername;
	TicketType tickettype;
	BookingStatus status;
	int price;

	public Ticket(String name, TicketType type) {
		this.customername = name;
		this.tickettype = type;
		this.status = BookingStatus.PENDING;
		this.price = getpricebytype(type);
	}

	private int getpricebytype(TicketType type) {
		if (type == TicketType.REGULAR)
			return 300;
		else if (type == TicketType.VIP)
			return 600;
		else
			return 1000;

	}

	public void confirmbooking(boolean confirm) {
		if (confirm) {
			status = BookingStatus.CONFIRMED;
		} else {
			status = BookingStatus.CANCELLED;
		}
	}

	public void printTicket() {
		System.out.println("Customer: " + customername);
		System.out.println("Ticket Type: " + tickettype);
		System.out.println("Price: ₹" + price);
		System.out.println("Booking Status: " + status);
	}
}
