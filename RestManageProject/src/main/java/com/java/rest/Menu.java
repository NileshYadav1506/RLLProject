package com.java.rest;

public class Menu {
	private int menuId;
	private int restaurantId;
	private String itemName;
	private String MenuType;
	private int Calaroies;
	private int price;
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getMenuType() {
		return MenuType;
	}
	public void setMenuType(String menuType) {
		MenuType = menuType;
	}
	public int getCalaroies() {
		return Calaroies;
	}
	public void setCalaroies(int calaroies) {
		Calaroies = calaroies;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantId=" + restaurantId + ", itemName=" + itemName + ", MenuType="
				+ MenuType + ", Calaroies=" + Calaroies + ", price=" + price + "]";
	}
	
	

}
