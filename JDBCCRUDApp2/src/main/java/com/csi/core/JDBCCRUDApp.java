package com.csi.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCRUDApp {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emphrmadvapp?useSSL = false",
						"root", "root");
				/******* DATABASE CREATION ********/
				/*
				 * String createDatabaseSQL = "create database emphrmadvapp"; PreparedStatement
				 * preparedStatement = connection.prepareStatement(createDatabaseSQL);
				 * preparedStatement.executeUpdate();
				 * System.out.println("Database created sucessfully");
				 */

				/******* Table creation *******/
				/*
				 * String createTableSQL =
				 * "create table  employee(empid int, empname varchar(255), empsalary double, primary key(empid))"
				 * ; PreparedStatement preparedStatement =
				 * connection.prepareStatement(createTableSQL);
				 * preparedStatement.executeUpdate();
				 * System.out.println("Table created sucessfully");
				 */

				/* Insert data in TABLE */
				/*
				 * String insertDataSQL =
				 * "insert into employee(empid, empname, empsalary) values (127, 'ROHIT', 34100)"
				 * ; PreparedStatement preparedStatement =
				 * connection.prepareStatement(insertDataSQL);
				 * preparedStatement.executeUpdate();
				 * System.out.println("Data inserted sucessfully");
				 */

				/******* Update Data *******/
				/*
				 * String updateDataSQL =
				 * "update employee set empname = 'HEMANT' where empid = 125"; PreparedStatement
				 * preparedStatement = connection.prepareStatement(updateDataSQL);
				 * preparedStatement.executeUpdate();
				 * System.out.println("Data updated sucessfully");
				 */

				/******* Delete Data *******/
				/*
				 * String deleteDataSQL = "delete from employee where empid = 127";
				 * PreparedStatement preparedStatement =
				 * connection.prepareStatement(deleteDataSQL);
				 * preparedStatement.executeUpdate();
				 * System.out.println("Data deleted sucessfully");
				 */

				/******* Read data *******/
				String readDataSQL = "select * from employee";
				PreparedStatement preparedStatement = connection.prepareStatement(readDataSQL);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3)+" "+resultSet.getDate(4));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			connection.close();
		}

	}
}
