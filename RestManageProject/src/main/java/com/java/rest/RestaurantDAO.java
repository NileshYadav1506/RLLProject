package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {
	
	Connection connection;
	PreparedStatement pst;
	
	public Restaurant searchrestaurant(int restaurantId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant where restaurantId=? ";
		pst= connection.prepareStatement(cmd);
		pst.setInt(1, restaurantId);
		ResultSet rs = pst.executeQuery();
		Restaurant restaurant= null;
		if(rs.next()) {
			restaurant = new Restaurant();
			restaurant.setRestaurantId(rs.getInt("restaurantId"));
			restaurant.setRestaurantName(rs.getString("restaurantName"));
			restaurant.setCity(rs.getString("city"));
			restaurant.setBranch(rs.getString("Branch"));
			restaurant.setEmail(rs.getString("Email"));
			restaurant.setContactNo(rs.getInt("ContactNo"));
			
		}
		return restaurant;
	}
	
	public List<Restaurant> showRestaurant() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurant";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurant> restaurantList= new ArrayList<Restaurant>();
		Restaurant restaurant= null;
		while(rs.next()) {
			restaurant = new Restaurant();
			restaurant.setRestaurantId(rs.getInt("restaurantId"));
			restaurant.setRestaurantName(rs.getString("restaurantName"));
			restaurant.setCity(rs.getString("city"));
			restaurant.setBranch(rs.getString("Branch"));
			restaurant.setEmail(rs.getString("Email"));
			restaurant.setContactNo(rs.getInt("ContactNo"));
			restaurantList.add(restaurant);
					
		}
		return restaurantList;
			
				
	}
}
