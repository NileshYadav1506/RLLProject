package com.java.rest;

public class Customers {
	
	private int CustomersId;
	private String CustomersName;
	private String CustomersState;
	private String CustomersCity;
	private String CustomersEmail;
	private String CustomersMobile;
	public int getCustomersId() {
		return CustomersId;
	}
	public void setCustomersId(int customersId) {
		CustomersId = customersId;
	}
	public String getCustomersName() {
		return CustomersName;
	}
	public void setCustomersName(String customersName) {
		CustomersName = customersName;
	}
	public String getCustomersState() {
		return CustomersState;
	}
	public void setCustomersState(String customersState) {
		CustomersState = customersState;
	}
	public String getCustomersCity() {
		return CustomersCity;
	}
	public void setCustomersCity(String customersCity) {
		CustomersCity = customersCity;
	}
	public String getCustomersEmail() {
		return CustomersEmail;
	}
	public void setCustomersEmail(String customersEmail) {
		CustomersEmail = customersEmail;
	}
	public String getCustomersMobile() {
		return CustomersMobile;
	}
	public void setCustomersMobile(String i) {
		CustomersMobile = i;
	}
	@Override
	public String toString() {
		return "Customers [CustomersId=" + CustomersId + ", CustomersName=" + CustomersName + ", CustomersState="
				+ CustomersState + ", CustomersCity=" + CustomersCity + ", CustomersEmail=" + CustomersEmail
				+ ", CustomersMobile=" + CustomersMobile + "]";
	}
	
	
	
}

