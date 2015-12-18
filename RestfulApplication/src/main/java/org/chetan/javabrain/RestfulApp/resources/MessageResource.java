package org.chetan.javabrain.RestfulApp.resources;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.chetan.javabrain.RestfulApp.model.Message;
import org.chetan.javabrain.RestfulApp.sevice.MessageService;

@Path("/messages")
public class MessageResource
{
	MessageService messageservice=new MessageService();
	
	@GET
	@Path("/textmessage")
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextMessage()
	{
		return "Helloworld -Text Response";
	}
	
	/*
	 * usage:
	 * http://localhost:8080/RestfulApp/webapi/messages/all?char=e
	 * Also pagination can be done
	 */
	@GET
	@Path("/all")
	@Produces(value={ MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
	public List<Message> getMessages(@QueryParam("char") char ch)
	{	
		if(ch>'a')
		{
			System.out.println("in here");
			return messageservice.getMessageByName();
		}
		System.out.println("after if");
		return messageservice.getAllMessages();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessages(Message message)
	{
		//
		return messageservice.addMessage(message);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{messageid}")
	public Message updateMessage(@PathParam("messageid")Integer messageid ,Message message)
	{
		message.setId(messageid);
		return messageservice.updateMessage(message);
	}
	
	@GET
	@Path("/{messageid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageid") Integer messageid)
	{
		return messageservice.getMessage(messageid);
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageid}")
	public Message deleteMessage(@PathParam("messageid") Integer messageid)
	{
		return messageservice.deleteMessage(messageid);
	}

}
