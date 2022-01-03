package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDAO {
	PreparedStatement pst;
	Connection connection;
	
	public Wallet searchwallet(int walletId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from Wallet where walletId= ?";
		pst= connection.prepareStatement(cmd);
		pst.setInt(1, walletId);
		ResultSet rs = pst.executeQuery();
		Wallet wallet = null;
		if(rs.next()) {
			wallet = new Wallet();
			wallet.setWalletId(rs.getInt("walletId"));
			wallet.setCustomersId(rs.getInt("customersId"));
			//wallet.setCustomersId(rs.getInt("customerId"));
			wallet.setWalletType(rs.getString("walletType"));
			wallet.setAmount(rs.getString("Amount"));
			
		}
		return wallet;
		
	}
	
	
	public Wallet searchwallet1(int customersId) throws ClassNotFoundException, SQLException {
		connection= ConnectionHelper.getConnection();
		String cmd = "Select * from Wallet where customersId=?";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, customersId);
		ResultSet rs = pst.executeQuery();
		Wallet wallet = null;
		if(rs.next()) {
			wallet = new Wallet();
			wallet.setWalletId(rs.getInt("walletId"));
			wallet.setCustomersId(rs.getInt("customersId"));
			//wallet.setCustomersId(rs.getInt("customerId"));
			wallet.setWalletType(rs.getString("walletType"));
			wallet.setAmount(rs.getString("Amount"));
			
		}
		return wallet;
	}
}	
	
