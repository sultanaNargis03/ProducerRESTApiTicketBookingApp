package com.telusko.exception;

public class TicketNotFoundException extends RuntimeException{

	public TicketNotFoundException(String msg)
	{
		super(msg);
	}

}
