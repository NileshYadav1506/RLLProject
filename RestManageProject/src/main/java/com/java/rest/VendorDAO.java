package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public Vendor searchvendor(int vendorId) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		
		String cmd = "select * from Vendor where vendorId=? ";
		pst= connection.prepareStatement(cmd);
		pst.setInt(1, vendorId);
		ResultSet rs = pst.executeQuery();
		Vendor  vendor= null;
		if(rs.next()) {
			vendor = new Vendor();
			vendor.setVendorId(rs.getInt("VendorId"));
			vendor.setVendorName(rs.getString("VendorName"));
			vendor.setVendorState(rs.getString("VendorState"));
			vendor.setVendorCity(rs.getString("VendorCity"));
			vendor.setVendorEmail(rs.getString("VendorEmail"));
			vendor.setVendorMobile(rs.getString("VendorMobile"));
		}
		return vendor;
	}
	
	public List<Vendor> showVendor() throws ClassNotFoundException, SQLException {
		connection= ConnectionHelper.getConnection();
		String cmd = "select * from Vendor";
		pst= connection.prepareStatement(cmd);
		List<Vendor> vendorList= new ArrayList<Vendor>();
		ResultSet rs = pst.executeQuery();
		Vendor  vendor= null;
		while(rs.next()) {
			vendor = new Vendor();
			vendor.setVendorId(rs.getInt("VendorId"));
			vendor.setVendorName(rs.getString("VendorName"));
			vendor.setVendorState(rs.getString("VendorState"));
			vendor.setVendorCity(rs.getString("VendorCity"));
			vendor.setVendorEmail(rs.getString("VendorEmail"));
			vendor.setVendorMobile(rs.getString("VendorMobile"));
			vendorList.add(vendor);
		}
		return vendorList;
	}

}
