package com.sopra.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcconnection.JDBCConnection;
import com.sopra.beans.RegisterForm;

public class RegisterDao 
{
	public boolean insert(RegisterForm reg)
	{
		String sql = "insert into register values(?,?,?,?)";
		try 
		{
			PreparedStatement sts = JDBCConnection.getconnect().prepareStatement(sql);
			sts.setString(1, reg.getEmpid());
	        sts.setString(2, reg.getEmpname());
	        sts.setString(3, reg.getEmpcontact());
	        sts.setString(4, reg.getEmpemail());
	        
	        return sts.executeUpdate()>0;

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
