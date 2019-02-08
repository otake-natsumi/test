package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO BuyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "SERECT id, item_name,item_price FROM item_info_transaction";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				BuyItemDTO.setId(resultSet.getInt("id"));
				BuyItemDTO.setItemName(resultSet.getString("item_name"));
				BuyItemDTO.setItemPrice(resultSet.getString("item_price"));

			}
	}catch(Exception e){
		e.printStackTrace();
	}
	return BuyItemDTO;
	}
	public BuyItemDTO getLoginDTO(){
		return BuyItemDTO;
	}
}
