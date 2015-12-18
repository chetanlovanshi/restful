package org.chetan.javabrain.RestfulApp.sevice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.chetan.javabrain.RestfulApp.db.DBClass;
import org.chetan.javabrain.RestfulApp.model.Message;

public class MessageService
{
	private Map<Integer,Message> messages=DBClass.getMessages();
	public MessageService()
	{
		messages.put(1,new Message(1,"Hello World",new Date(),"Chetan lovanshi"));
		messages.put(2,new Message(2,"Response Message",new Date(),"Chetan "));
		messages.put(3,new Message(3,"Hello new Message",new Date(),"Arun Prajapati"));
		
	}
	
	
	
	public List<Message> getMessageByName()
	{
		List<Message> nameList=new ArrayList<>();
		for(Message message:messages.values())
		{
			String name=message.getAuthor();
			char f= name.charAt(0);
			if(f>'m')
			{
				nameList.add(message);
				
			}
			
		}
		return nameList;
		
		
	}
	
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<>(messages.values());
	}
	
	public Message getMessage(int id)
	{
		return messages.get(id);
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	public Message updateMessage(Message message)
	{
		if(messages.size()<=0)
			return null;
		messages.put(message.getId(), message);
		return message;
	}
	public Message deleteMessage(int id)
	{
		messages.remove(id);
		return messages.remove(id);
	}

}
