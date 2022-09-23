package com.sopra.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbcconnection.JDBCConnection;
import com.sopra.beans.LoginForm;

public class LoginDao 
{
	public static boolean validate(LoginForm log)
	{
		boolean status = false;
		String sql = "select * from register where empid = ? and empname = ?";

		try
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, log.getEmpid());
			sts.setString(2, log.getEmpname());
			ResultSet rs = sts.executeQuery();
			status = rs.next();
			//return sts.executeUpdate()>0;
		
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return status;
	}
	
	public static boolean insert(LoginForm log)
	{
		String sql = "insert into login values(?,?,CURRENT_TIMESTAMP)";
		try 
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, log.getEmpid());
	        sts.setString(2, log.getEmpname());
	       
	        return sts.executeUpdate()>0;

		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return false;
		
	}
}
