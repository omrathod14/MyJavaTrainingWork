package com.aurionpro.test;

import java.sql.*;
import java.util.*;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===== Welcome to BankApp =====");
			System.out.println("1. Login as Customer");
			System.out.println("2. Login as Admin");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			String choice = sc.nextLine();

			switch (choice) {
			case "1":
				int customerId = customerLogin(sc);
				if (customerId != -1) {
					customerMenu(sc, customerId);
				}
				break;
			case "2":
				if (adminLogin(sc)) {
					adminMenu(sc);
				} else {
					System.out.println("Invalid admin credentials.");
				}
				break;
			case "3":
				System.out.println("Exiting... Goodbye!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static Connection connect() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
	}

	private static int customerLogin(Scanner sc) {
		System.out.print("Enter Customer Username: ");
		String username = sc.next();
		System.out.print("Enter Password: ");
		String password = sc.next();

		try (Connection conn = connect()) {
			String sql = "SELECT customer_id, is_frozen FROM customers WHERE username=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				if (rs.getBoolean("is_frozen")) {
					System.out.println("Account is frozen. Contact admin.");
					return -1;
				}
				return rs.getInt("customer_id");
			} else {
				System.out.println("Invalid username or password.");
				return -1;
			}
		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
			return -1;
		}
	}

	private static void customerMenu(Scanner sc, int customerId) {
		while (true) {
			System.out.println("\n--- Customer Menu ---");
			System.out.println("1. View Balance");
			System.out.println("2. Transfer Money");
			System.out.println("3. View Transactions");
			System.out.println("4. Logout");
			System.out.print("Choice: ");
			String choice = sc.next();

			switch (choice) {
			case "1":
				viewBalance(customerId);
				break;
			case "2":
				transferMoney(sc, customerId);
				break;
			case "3":
				viewTransactions(customerId);
				break;
			case "4":
				System.out.println("Logging out...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void viewBalance(int customerId) {
		try (Connection conn = connect()) {
			String sql = "SELECT balance FROM customers WHERE customer_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customerId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Current Balance: Rs." + rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			System.out.println("Error fetching balance: " + e.getMessage());
		}
	}

	private static void transferMoney(Scanner sc, int senderId) {
		try (Connection conn = connect()) {
			System.out.print("Enter Receiver Customer ID: ");
			int receiverId = sc.nextInt();

			if (receiverId == senderId) {
				System.out.println("Cannot transfer money to your own account.");
				return;
			}

			String checkSql = "SELECT is_frozen FROM customers WHERE customer_id=?";
			PreparedStatement checkPs = conn.prepareStatement(checkSql);
			checkPs.setInt(1, receiverId);
			ResultSet checkRs = checkPs.executeQuery();

			if (!checkRs.next()) {
				System.out.println("Receiver does not exist.");
				return;
			}

			if (checkRs.getBoolean("is_frozen")) {
				System.out.println("Receiver's account is frozen. Transfer not allowed.");
				return;
			}

			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();
			if (amount <= 0) {
				System.out.println("Amount must be positive.");
				return;
			}

			conn.setAutoCommit(false);

			PreparedStatement ps1 = conn.prepareStatement(
					"UPDATE customers SET balance = balance - ? WHERE customer_id = ? AND balance >= ?");
			ps1.setDouble(1, amount);
			ps1.setInt(2, senderId);
			ps1.setDouble(3, amount);
			int updated1 = ps1.executeUpdate();

			if (updated1 == 0) {
				System.out.println("Transfer failed: Insufficient funds.");
				conn.rollback();
				return;
			}

			PreparedStatement ps2 = conn
					.prepareStatement("UPDATE customers SET balance = balance + ? WHERE customer_id = ?");
			ps2.setDouble(1, amount);
			ps2.setInt(2, receiverId);
			ps2.executeUpdate();

			PreparedStatement ps3 = conn
					.prepareStatement("INSERT INTO transactions (customer_id, type, amount) VALUES (?, 'debit', ?)");
			ps3.setInt(1, senderId);
			ps3.setDouble(2, amount);
			ps3.executeUpdate();

			PreparedStatement ps4 = conn
					.prepareStatement("INSERT INTO transactions (customer_id, type, amount) VALUES (?, 'credit', ?)");
			ps4.setInt(1, receiverId);
			ps4.setDouble(2, amount);
			ps4.executeUpdate();

			conn.commit();
			System.out.println("Transfer successful.");

		} catch (SQLException e) {
			System.out.println("Error during transfer: " + e.getMessage());
		}
	}

	private static void viewTransactions(int customerId) {
		try (Connection conn = connect()) {
			String sql = "SELECT type, amount, date FROM transactions WHERE customer_id=? ORDER BY date DESC";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customerId);
			ResultSet rs = ps.executeQuery();
			System.out.println("\n--- Transaction History ---");
			while (rs.next()) {
				System.out.printf("%s of Rs.%.2f on %s\n", rs.getString("type"), rs.getDouble("amount"),
						rs.getTimestamp("date"));
			}
		} catch (SQLException e) {
			System.out.println("Error fetching transactions: " + e.getMessage());
		}
	}

	private static boolean adminLogin(Scanner sc) {
		System.out.print("Enter Admin Username: ");
		String username = sc.next();
		System.out.print("Enter Password: ");
		String password = sc.next();

		try (Connection conn = connect()) {
			String sql = "SELECT * FROM admins WHERE username=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
			return false;
		}
	}

	private static void adminMenu(Scanner sc) {
		while (true) {
			System.out.println("\n--- Admin Menu ---");
			System.out.println("1. Freeze Account");
			System.out.println("2. Unfreeze Account");
			System.out.println("3. View All Customers");
			System.out.println("4. Logout");
			System.out.print("Choice: ");
			String choice = sc.next();

			switch (choice) {
			case "1":
				toggleFreeze(sc, true);
				break;
			case "2":
				toggleFreeze(sc, false);
				break;
			case "3":
				viewAllCustomers();
				break;
			case "4":
				System.out.println("Logging out from admin...");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void toggleFreeze(Scanner sc, boolean freeze) {
		System.out.print("Enter Customer ID to " + (freeze ? "freeze" : "unfreeze") + ": ");
		int id = sc.nextInt();
		try (Connection conn = connect()) {
			String sql = "UPDATE customers SET is_frozen=? WHERE customer_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setBoolean(1, freeze);
			ps.setInt(2, id);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("Account " + (freeze ? "frozen." : "unfrozen."));
			} else {
				System.out.println("Customer ID not found.");
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static void viewAllCustomers() {
		try (Connection conn = connect()) {
			String sql = "SELECT customer_id, username, balance, is_frozen FROM customers";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("\nID | Username | Balance | Frozen");
			while (rs.next()) {
				System.out.printf("%d | %s | %.2f | %s\n", rs.getInt("customer_id"), rs.getString("username"),
						rs.getDouble("balance"), rs.getBoolean("is_frozen") ? "Yes" : "No");
			}
		} catch (SQLException e) {
			System.out.println("Error fetching customers: " + e.getMessage());
		}
	}
}
