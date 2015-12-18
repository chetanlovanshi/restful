package org.chetan.javabrain.RestfulApp.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	int id;
	String message;
	String author;
	Date date;

	
	
	public Message()
	{
	}



	public Message(int id, String message, Date date, String author)
	{
		this.id = id;
		this.message = message;
		this.author = author;
		this.date = date;
	}

	
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
	/**
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}
	/**
	 * @return the date
	 */
	public Date getDate()
	{
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

}
