package com.aurionpro.servlets;

import java.sql.Connection;

import com.aurionpro.util.DBConnection;

public class TestDB {
	public static void main(String[] args) {
		try (Connection con = DBConnection.getConnection()) {
			if (con != null) {
				System.out.println("Connection Successful!");
			} else {
				System.out.println("Connection Failed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
