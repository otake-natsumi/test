package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserID;
	private String loginPassword;
	private String uesrName;
	public Map<String, Object> session;
	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException{
		userCreateCompleteDAO.cerateUser(session.get("loginUserID").toString(),
			session.get("loginPassword").toString(),
			session.get("uesrName").toString());

		String result = SUCCESS;
		return result;
	}
	public String getLoginUserID(){
		return loginUserID;
	}
	public void setLoginUserID(String loginUserID){
		this.loginUserID = loginUserID;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUesrName(){
		return uesrName;
	}
	public void setUesrName(String uesrName){
		this.uesrName = uesrName;
	}

	public Map<String, Object> getSession(){
			return session;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
