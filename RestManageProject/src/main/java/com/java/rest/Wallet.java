package com.java.rest;

public class Wallet {
	private int WalletId;
	private int CustomersId;
	private String WalletType;
	private String Amount;
	public int getWalletId() {
		return WalletId;
	}
	public void setWalletId(int walletId) {
		WalletId = walletId;
	}
	public int getCustomersId() {
		return CustomersId;
	}
	public void setCustomersId(int customersId) {
		CustomersId = customersId;
	}
	public String getWalletType() {
		return WalletType;
	}
	public void setWalletType(String walletType) {
		WalletType = walletType;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	@Override
	public String toString() {
		return "Wallet [WalletId=" + WalletId + ", CustomersId=" + CustomersId + ", WalletType=" + WalletType
				+ ", Amount=" + Amount + "]";
	}
	
	
	

}
