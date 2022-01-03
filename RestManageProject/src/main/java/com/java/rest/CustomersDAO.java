package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomersDAO {
	Connection connection;
	PreparedStatement pst;
	
	public Customers searchcustomers(int customersId) throws ClassNotFoundException, SQLException {
		connection= ConnectionHelper.getConnection();
		String cmd = "select * from Customers where customersId=? ";
		pst= connection.prepareStatement(cmd);
		pst.setInt(1, customersId);
		ResultSet rs = pst.executeQuery();
		Customers customers= null;
		if(rs.next()) {
			
			customers = new Customers();
			customers.setCustomersId(rs.getInt("customersId"));
			//customers.setCustomersId(rs.getInt("customerstId"));
			customers.setCustomersName(rs.getString("customersName"));
			customers.setCustomersState(rs.getString("customersState"));
			customers.setCustomersCity(rs.getString("CustomersCity"));
			customers.setCustomersEmail(rs.getString("CustomersEmail"));
			customers.setCustomersMobile(rs.getString("CustomersMobile"));
		}
		return customers;
			
	}
	
	public List<Customers> showCustomers() throws ClassNotFoundException, SQLException {
		connection= ConnectionHelper.getConnection();
		String cmd = "select * from Customers ";
		pst= connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Customers> customersList= new ArrayList<Customers>();
		Customers customers= null;
		while(rs.next()) {
			customers = new Customers();
			customers.setCustomersId(rs.getInt("customersId"));
			//customers.setCustomersId(rs.getInt("CustomerstId"));
			customers.setCustomersName(rs.getString("customersName"));
			customers.setCustomersState(rs.getString("customersState"));
			customers.setCustomersCity(rs.getString("CustomersCity"));
			customers.setCustomersEmail(rs.getString("CustomersEmail"));
			customers.setCustomersMobile(rs.getString("CustomersMobile"));
			customersList.add(customers);
			
		}
		return customersList;
	}

}


