package org.chetan.javabrain.RestfulApp.db;

import java.util.HashMap;
import java.util.Map;

import org.chetan.javabrain.RestfulApp.model.Message;

public class DBClass
{
	private static Map<Integer,Message> messages=new HashMap<>();
	
	public static Map<Integer,Message> getMessages()
	{
		return messages;
	}
	
	
	

}
