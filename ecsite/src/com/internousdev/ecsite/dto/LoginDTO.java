package com.internousdev.ecsite.dto;

public class LoginDTO {
	public String loginId;
	public int id;
	public String itemName;
	public String itemPrice;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}