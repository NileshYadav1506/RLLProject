package com.java.rest;

public class Vendor {
	
	private int VendorId;
	private String VendorName;
	private String VendorState;
	private String VendorCity;
	private String VendorEmail;
	private String VendorMobile;
	public int getVendorId() {
		return VendorId;
	}
	public void setVendorId(int vendorId) {
		VendorId = vendorId;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getVendorState() {
		return VendorState;
	}
	public void setVendorState(String vendorState) {
		VendorState = vendorState;
	}
	public String getVendorCity() {
		return VendorCity;
	}
	public void setVendorCity(String vendorCity) {
		VendorCity = vendorCity;
	}
	public String getVendorEmail() {
		return VendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		VendorEmail = vendorEmail;
	}
	public String getVendorMobile() {
		return VendorMobile;
	}
	public void setVendorMobile(String vendorMobile) {
		VendorMobile = vendorMobile;
	}
	@Override
	public String toString() {
		return "Vendor [VendorId=" + VendorId + ", VendorName=" + VendorName + ", VendorState=" + VendorState
				+ ", VendorCity=" + VendorCity + ", VendorEmail=" + VendorEmail + ", VendorMobile=" + VendorMobile
				+ "]";
	}
	
	

}
