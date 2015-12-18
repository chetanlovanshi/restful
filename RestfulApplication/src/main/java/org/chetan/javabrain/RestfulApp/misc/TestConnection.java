package org.chetan.javabrain.RestfulApp.misc;

import java.sql.Connection;

public class TestConnection
{
	Connection con;
	public void checkCon()
	{
		try
		{
			System.out.println("Trying to init Con");
			con= ConnectionDao.getConnection();
			System.out.println("Got Con");
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
