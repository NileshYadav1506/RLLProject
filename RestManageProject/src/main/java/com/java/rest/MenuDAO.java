package com.java.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MenuDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Menu searchmenu(int restaurantId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd= "select * from Menu where restaurantId = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurantId);
		ResultSet rs = pst.executeQuery();
		Menu menu = null;
		if(rs.next()) {
			menu = new Menu();
			menu.setMenuId(rs.getInt("menuId"));
			menu.setRestaurantId(rs.getInt("restaurantId"));
			menu.setItemName(rs.getString("itemName"));
			menu.setMenuType(rs.getString("menuType"));
			menu.setCalaroies(rs.getInt("calaroies"));
			menu.setPrice(rs.getInt("price"));
		}
		return menu;
	}
	
	public Menu searchmenu1(int menuId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd= "select * from Menu where menuId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, menuId);
		ResultSet rs = pst.executeQuery();
		Menu menu1 = null;
		if(rs.next()) {
			menu1 = new Menu();
			menu1.setMenuId(rs.getInt("menuId"));
			menu1.setRestaurantId(rs.getInt("restaurantId"));
			menu1.setItemName(rs.getString("itemName"));
			menu1.setMenuType(rs.getString("menuType"));
			menu1.setCalaroies(rs.getInt("calaroies"));
			menu1.setPrice(rs.getInt("price"));
		}
		return menu1;
	}
	

	
	public List<Menu> showMenu() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Menu";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Menu> menuList= new ArrayList<Menu>();
		Menu menu= null;
		while(rs.next()) {
			menu = new Menu();
			menu.setMenuId(rs.getInt("menuId"));
			menu.setRestaurantId(rs.getInt("restaurantId"));
			menu.setItemName(rs.getString("itemName"));
			menu.setMenuType(rs.getString("menuType"));
			menu.setCalaroies(rs.getInt("calaroies"));
			menu.setPrice(rs.getInt("price"));
			menuList.add(menu);
					
		}
		return menuList;
			
				
	}
	
}
