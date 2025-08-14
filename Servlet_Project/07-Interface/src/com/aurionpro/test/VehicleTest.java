package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Car;
import com.aurionpro.model.Truck;
import com.aurionpro.model.VehicleControl;

public class VehicleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VehicleControl[] vehicles = { new Car(), new Bike(), new Truck() };

		while (true) {
			System.out.println("\n==== Vehicle Control Panel ====");
			for (int i = 0; i < vehicles.length; i++) {
				System.out.println((i + 1) + ". " + vehicles[i].getVehicleType());
			}
			System.out.println("0. Exit");

			int choice = -1;
			try {
				System.out.print("Select a vehicle (0 to exit): ");
				choice = Integer.parseInt(sc.nextLine());

				if (choice == 0) {
					System.out.println("Exiting Vehicle Controller.");
					break;
				}
				if (choice < 1 || choice > vehicles.length) {
					throw new IllegalArgumentException("Invalid vehicle choice.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid number.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			VehicleControl selected = vehicles[choice - 1];
			selected.start();

			int gear = 0;
			try {
				System.out.print("Enter gear (1 to 6): ");
				gear = Integer.parseInt(sc.nextLine());

				if (gear < 1 || gear > 6) {
					throw new IllegalArgumentException("Gear must be between 1 and 6.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid number. Please enter a valid gear.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			selected.changeGear(gear);
			selected.stop();
		}

		sc.close();
	}
}
