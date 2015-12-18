package org.chetan.javabrain.RestfulApp.misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDao
{
	public static Connection connection = null;
	public ConnectionDao()
	{
		try
		{
			connection = getConnection();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		if (connection == null)
			setConnection();
		return connection;
	}

	public static void setConnection() throws SQLException, ClassNotFoundException
	{
		System.out.println("initialising");
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/mydbchetan19", "chetan19", "chetan19");
		System.out.println("Got that");
		

	}
}