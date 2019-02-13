package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateDAO;
import com.internousdev.ecsite.dto.UserCreateDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserCreateAction extends ActionSupport implements SessionAware{
	public String execute(){
			String result = "login";
			if(session.containsKey("id")){
				UserCreateDAO userCreateDAO = new UserCreateDAO();
				UserCreateDTO userCreateDTO = UserCreateDTO.getBuyItemInfo();
				session.put("id",buyItemDTO.getId());
				session.put("buyItem_naem", buyItemDTO.getItemName());
				session.put("buyItem_price", buyItemDTO.getItemPrice());
				result = SUCCESS;
			}
			return result;
		return SUCCESS;
	}
}
