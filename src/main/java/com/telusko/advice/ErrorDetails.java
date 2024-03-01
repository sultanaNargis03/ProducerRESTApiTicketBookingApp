package com.telusko.advice;

import java.time.LocalDateTime;

public class ErrorDetails 
{
	private String msg;
	private String statusCode;
	private LocalDateTime when;

	public ErrorDetails() 
	{
		
	}

	public ErrorDetails(String msg, String statusCode, LocalDateTime when) {
		super();
		this.msg = msg;
		this.statusCode = statusCode;
		this.when = when;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public LocalDateTime getWhen() {
		return when;
	}

	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

	@Override
	public String toString() {
		return "ErrorDetails [msg=" + msg + ", statusCode=" + statusCode + ", when=" + when + "]";
	}
	
	
}
