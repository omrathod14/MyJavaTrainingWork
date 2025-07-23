package com.Controllable.model;

import com.Controllable.model.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeviceController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Controllable[] devices = { new Light(), new Fan(), new TV(), new Speaker() };
		String[] deviceNames = { "Light", "Fan", "TV", "Speaker" };
		String[] allowedModes = { "Dim", "High", "HD", "Bass" };

		while (true) {
			try {
				System.out.println("===== Device Controller =====");
				for (int i = 0; i < deviceNames.length; i++) {
					System.out.println((i + 1) + ". " + deviceNames[i]);
				}
				System.out.println("5. Exit");
				System.out.print("Select a device (1-5): ");
				int choice = sc.nextInt();
				sc.nextLine();

				if (choice == 5) {
					System.out.println("Exited from System");
					break;
				}

				if (choice < 1 || choice > 4) {
					System.out.println("Invalid device selection. Choose between 1 and 4.");
					continue;
				}

				String validMode = allowedModes[choice - 1];
				String mode = "";

				while (true) {
					System.out.print("Enter mode for " + deviceNames[choice - 1] + " (Allowed: " + validMode + "): ");
					mode = sc.nextLine();
					if (mode.equalsIgnoreCase(validMode)) {
						break;
					} else {
						System.out.println("Invalid mode! Try again.");
					}
				}

				devices[choice - 1].turnOn();
				devices[choice - 1].setMode(mode);
				devices[choice - 1].turnOff();
				System.out.println();

			} catch (InputMismatchException e) {
				System.out.println("Error: Please enter a valid number!");
				sc.nextLine(); 
			} catch (Exception e) {
				System.out.println("Unexpected Error: " + e.getMessage());
			}
		}

		sc.close();
	}
}
