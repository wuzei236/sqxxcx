package com.sqxxcx.customer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.mysql.jdbc.Statement;

public class ConnectFactory {

	@Value("${spring.datasource.url}")
	private static String url;
	
	@Value("${spring.datasource.driver-class-name}")
	private static String driver;
	
	@Value("${spring.datasource.username}")
	private static String username;
	
	@Value("${spring.datasource.password}")
	private static String password;
	
	public static Connection getConnection(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(Connection connection,Statement statement,ResultSet resultSet){
		try {
			if(resultSet != null){
				resultSet.close();
			}
			if(statement  != null){
				statement.close();
			}
			if(connection != null){
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
		
	}
}
