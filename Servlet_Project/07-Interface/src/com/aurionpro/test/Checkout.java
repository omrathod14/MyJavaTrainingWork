package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CreditCard;
import com.aurionpro.model.NetBanking;
import com.aurionpro.model.PaymentGateway;
import com.aurionpro.model.UPI;

public class Checkout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway[] methods = { new CreditCard(), new UPI(), new NetBanking() };

        while (true) {
            System.out.println("\n==== E-Commerce Checkout ====");
            System.out.println("Choose payment method:");
            for (int i = 0; i < methods.length; i++) {
                System.out.println((i + 1) + ". " + methods[i].getMethodName());
            }

            int choice = -1;
            while (true) {
                try {
                    System.out.print("Enter your choice (1-3): ");
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice < 1 || choice > methods.length) {
                        throw new IllegalArgumentException("Invalid choice. Must be between 1 and 3.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            PaymentGateway selected = methods[choice - 1];

            double amount = 0;
            while (true) {
                try {
                    System.out.print("Enter amount: Rs");
                    amount = Double.parseDouble(sc.nextLine());
                    if (amount <= 0) {
                        throw new IllegalArgumentException("Amount must be greater than 0.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            int action = -1;
            while (true) {
                try {
                    System.out.println("1. Pay");
                    System.out.println("2. Refund");
                    System.out.print("Enter action: ");
                    action = Integer.parseInt(sc.nextLine());
                    if (action != 1 && action != 2) {
                        throw new IllegalArgumentException("Action must be 1 (Pay) or 2 (Refund).");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (action == 1) {
                selected.pay(amount);
            } else {
                selected.refund(amount);
            }

            
            String again = "";
            while (true) {
                System.out.print("\nDo you want to perform another transaction? (yes/no): ");
                again = sc.nextLine().trim().toLowerCase();

                if (again.equals("yes") || again.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter 'yes' or 'no'.");
                }
            }

            if (again.equals("no")) {
                System.out.println("Thank you for using the Checkout system!");
                break;
            }

            }
        sc.close();
        }

    }
