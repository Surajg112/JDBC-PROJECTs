package com.csi.core;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImageSQL {
	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/imgdb", "root", "root");
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into profiletable(profilename, img) values(?, ?)");
			preparedStatement.setString(1, "Bhagat Singh ji");
			File file = new File("C:\\Users\\DELL\\Downloads\\bhagat singh ji.jpeg");
			FileInputStream fileInputStream = new FileInputStream(file);
			preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());
			preparedStatement.executeUpdate();
			System.out.println("image inserted sucessfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
