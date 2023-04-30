package com.csi.jdbccore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		// ******* steps for jdbc connectivity ********
		// 1.Load driver class => not mandatory
		// 2. connect with db | establish conection
		// 3. create statement
		// 4. execute query
		// 5. close the connection => no need it's optional

		// 1.Load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				// 2. connect with db | establish conection

				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pune", "root", "root");

				// 3. create statement
				Statement statement = connection.createStatement();

				// 4. execute query
				ResultSet resultSet = statement.executeQuery("select * from employee");

				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) +
							"\t" + resultSet.getDouble(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 5. close the connection
		finally {
			connection.close();
		}

	}
}
