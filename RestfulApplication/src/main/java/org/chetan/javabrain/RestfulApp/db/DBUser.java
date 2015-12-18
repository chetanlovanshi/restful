package org.chetan.javabrain.RestfulApp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.chetan.javabrain.RestfulApp.misc.ConnectionDao;

// class responsible for all kinds of Database operations related to User Credentials and Role.

public class DBUser
{
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;

	public static void main(String asd[])
	{
		DBUser dbUser=new DBUser();
		ResultSet rs;
		rs= dbUser.fetchAllData();
		dbUser.showAllData(rs);		
	}
	
	
	public void showAllData(ResultSet rs)
	{
		try
		{

			while (rs.next())
			{
				System.out.println(rs.getString(1));

			}
		}
		catch (Exception e)
		{
			System.out.println("e at fetch all data");
			System.out.println(e.getMessage());
			
			// TODO: handle exception
		}

	}

	public ResultSet fetchAllData()
	{
		try
		{

			System.out.println("Fetch all data");
			connection=ConnectionDao.getConnection();
			ps = connection.prepareStatement("select * from usertable ");
			System.out.println("Got Connection : Fetching Query");
			
			rs = ps.executeQuery();
			if (rs!=null)
			{
				return rs;
			}
			else
			{
				return null;
			}
		}
		catch (Exception e)
		{
			System.out.println("e at fetch all data");
			System.out.println(e.getMessage());
			return null;
		}
	}
}
