package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCRUD {
	public static void main(String[] args) throws Exception {

		// register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// create connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo", "root", "root");
		System.out.println(connection + ":Connected to DB Successfully");

		// Insert Operation
		// create statement

//		String insertQuery = "insert into students(roll_no,name)values(?,?)";
//		PreparedStatement ps = connection.prepareStatement(insertQuery);
//		ps.setString(1, "45");
//		ps.setString(2, "Om");
//		int rows = ps.executeUpdate();
//
//		ps.setString(1, "54");
//		ps.setString(2, "Ram");
//		rows += ps.executeUpdate();
//		System.out.println(rows + ":Row Inserted Successfully");

		// Fetch(Display Records)

//		String selectQuery = "select * from students";
//
//		Statement st = connection.createStatement();
//		ResultSet rs = st.executeQuery(selectQuery);
//
//		while (rs.next()) {
//			System.out.println(rs.getInt("roll_no") + "-" + rs.getString("name"));
//		}

		// Update

//		String updateQuery = "update students set name = ? where roll_no = ?";
//		PreparedStatement ps2 = connection.prepareStatement(updateQuery);
//		ps2.setString(1, "Srushti");
//		ps2.setInt(2, 54);
//		int updatedrows = ps2.executeUpdate();
//		System.out.println(updatedrows + ":Updated Rows");

		// Delete

		String deleteQuery = "DELETE FROM students WHERE roll_no = ?";
		PreparedStatement ps3 = connection.prepareStatement(deleteQuery);
		ps3.setInt(1, 54);
		int deletedRows = ps3.executeUpdate();
		System.out.println(deletedRows + ": Deleted Rows");
		connection.close();

	}

}
