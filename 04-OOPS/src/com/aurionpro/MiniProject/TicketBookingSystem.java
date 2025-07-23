package com.aurionpro.MiniProject;
import com.aurionpro.MiniProject.TicketType;
import com.aurionpro.MiniProject.BookingStatus;

import java.util.Scanner;

public class TicketBookingSystem {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Choose Ticket Type:");
        System.out.println("1. REGULAR");
        System.out.println("2. VIP");
        System.out.println("3. PREMIUM");
        int choice = sc.nextInt();

        TicketType type = TicketType.REGULAR; // default

        if (choice == 2) {
            type = TicketType.VIP;
        } else if (choice == 3) {
            type = TicketType.PREMIUM;
        }

        Ticket ticket = new Ticket(name, type);

        System.out.print("Do you want to confirm the booking? (yes/no): ");
        String confirm = sc.next();

        ticket.confirmbooking(confirm.equalsIgnoreCase("yes"));

        System.out.println("\n--- Ticket Info ---");
        ticket.printTicket();

        sc.close();
    }
}


