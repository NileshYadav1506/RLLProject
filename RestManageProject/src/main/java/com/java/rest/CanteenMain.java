package com.java.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.rest.Menu;
import com.java.rest.MenuDAO;
import com.java.rest.Restaurant;
import com.java.rest.RestaurantDAO;


public class CanteenMain {
	
static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Show Restaurant ");
			System.out.println("2. Search Restaurant Id");
			System.out.println("3. Show Menu ");
			System.out.println("4. Search Menu By Restaurant Id");
			System.out.println("5. Search Menu By Menu Id");
			System.out.println("6. Show Customers ");
			System.out.println("7. Search Customers Id");
			System.out.println("8. Show Vendor ");
			System.out.println("9. Search Vendor Id");
			System.out.println("10. Search Wallet By Wallet Id ");
			System.out.println("11. Search Wallet By Customers Id");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showRestaurant();
				break;
			case 2 : 
				try {
					searchRestaurant();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 :
				showMenu();
				break;
			case 4:
				try {
					searchMenu();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5 : 
				try {
					searchmenu1();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 6 :
				showCustomers();
				break;
				
			case 7 : 
				try {
					searchCustomers();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8 :
				showVendor();
				break;
			case 9 :
				try {
					searchVendor();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 10 :
				try {
					searchwallet();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 11 :
				try {
					searchwallet1();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 12 : 
				return;
			}
		} while(choice!=12);
	}
	public static void searchRestaurant() throws ClassNotFoundException, SQLException {
		int rid;
		System.out.println("Enter Restaurant id   ");
		rid = sc.nextInt();
		Restaurant restaurant = new RestaurantDAO().searchrestaurant(rid);
		System.out.println(restaurant);
	}
	
	public static void showRestaurant() {
		try {
			List<Restaurant> restaurantList = new RestaurantDAO().showRestaurant();
			for (Restaurant restaurant : restaurantList) {
				System.out.println(restaurant);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void searchMenu() throws ClassNotFoundException, SQLException {
		int restaurantId;
		System.out.println("Enter Restaurant Id  ");
		restaurantId= sc.nextInt();
		Menu menu= new MenuDAO().searchmenu(restaurantId);
		System.out.println(menu);
	}
	
	public static void searchmenu1() throws ClassNotFoundException, SQLException {
		int menuId;
		System.out.println("Entre Menu Id");
		menuId=sc.nextInt();
		Menu menu = new MenuDAO().searchmenu1(menuId);
		System.out.println(menu);
	}
	public static void showMenu() {
		try {
			List<Menu>  menuList = new MenuDAO().showMenu();
			for (Menu menu : menuList) {
				System.out.println(menu);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void searchCustomers() throws ClassNotFoundException, SQLException {
		int customersId;
		System.out.println("Enter Customers Id");
		customersId = sc.nextInt();
		Customers customers = new CustomersDAO().searchcustomers(customersId);
		System.out.println(customers);
	}
	
	public static void showCustomers() {
		try {
			List<Customers> customersList= new CustomersDAO().showCustomers();
			for (Customers customers : customersList) {
				System.out.println(customers);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void searchVendor() throws ClassNotFoundException, SQLException {
		int vendorId;
		System.out.println("Enter Vendor id ");
		vendorId= sc.nextInt();
		Vendor vendor = new VendorDAO().searchvendor(vendorId);
		System.out.println(vendor);
	}
	
	public static void showVendor() {
		
		try {
			List<Vendor> vendorList = new VendorDAO().showVendor();
			for (Vendor vendor : vendorList) {
				System.out.println(vendor);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void searchwallet() throws ClassNotFoundException, SQLException {
		int walletId;
		System.out.println("Enter Wallet Id");
		walletId =sc.nextInt();
		Wallet wallet= new WalletDAO().searchwallet(walletId);
		System.out.println(wallet);
		
	}
	
	public static void searchwallet1() throws ClassNotFoundException, SQLException {
		int customersId;
		System.out.println("Enter CustomerId  ");
		customersId= sc.nextInt();
		Wallet wallet = new WalletDAO().searchwallet1(customersId);
		System.out.println(wallet);
	}
	
}
	
