package com.csi.corejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCCRUDApp {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emphrmapp", "root", "root");
			// Statement statement = connection.createStatement();
			
			/****** create database ******/
			/*
			 * String createDBSQL = "create database emphrmapp"; 
			 * PreparedStatement preparedStatement = connection.prepareStatement(createDBSQL);
			 * preparedStatement.executeUpdate();
			 * System.out.println("Database created sucessfully");
			 */

			/****** create table ******/
			/*
			 * String createTableSQL = "create table employee(empid int, empname varchar(255), empsalary double)";
			 * PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL);
			 * preparedStatement.executeUpdate();
			 * System.out.println("Table created sucessfully");
			 */
			
			/****** Insert record ******/
			/*
			 * String insertRecord =
			 * "insert into employee (empid, empname, empsalary) values (101, 'Sumit', 52000)";
			 * PreparedStatement preparedStatement = connection.prepareStatement(insertRecord); 
			 * preparedStatement.executeUpdate();
			 * System.out.println("Record inserted sucessfully");
			 */
			
			/****** Update data ******/
			/*
			 * String updateData =
			 * "update employee set empname = 'Suraj' where empid= 101 "; 
			 * PreparedStatement preparedStatement = connection.prepareStatement(updateData);
			 * preparedStatement.executeUpdate();
			 * System.out.println("Data updated sucessfully");
			 */
			
			/****** read data ******/
			/*
			 * String selectSQL = "select * from employee"; PreparedStatement
			 * preparedStatement = connection.prepareStatement(selectSQL); ResultSet
			 * resultSet = preparedStatement.executeQuery(); while (resultSet.next()) {
			 * System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "
			 * +resultSet.getInt(3)); }
			 */
			
			
			/****** Delete data ******/
			/*
			 * String deleteData = "delete from employee where empid = 107";
			 * PreparedStatement preparedStatement =
			 * connection.prepareStatement(deleteData); preparedStatement.executeUpdate();
			 * System.out.println("Data deleted sucessfully");
			 */
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
