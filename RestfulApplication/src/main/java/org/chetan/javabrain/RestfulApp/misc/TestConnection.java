package org.chetan.javabrain.RestfulApp.misc;

import java.sql.Connection;

public class TestConnection
{
	Connection con;
	public void checkCon()
	{
		try
		{
			System.out.println("initialising Conection");
			con= ConnectionDao.getConnection();
			System.out.println("Connection Established ");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String ad[])
	{
		TestConnection testConnection=new TestConnection();
		testConnection.checkCon();
		
	}

}
