package com.telusko.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.telusko.exception.PassengerNotFoundException;
import com.telusko.exception.TicketNotFoundException;

@RestControllerAdvice
public class ErrorController 
{
	@ExceptionHandler(TicketNotFoundException.class)
	public ResponseEntity<ErrorDetails> handelExceptionTicket(TicketNotFoundException e)
	{
		ErrorDetails errorDetails=new ErrorDetails("404 not found",e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(errorDetails,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PassengerNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleExceptionPassenger(PassengerNotFoundException e)
	{
		ErrorDetails error=new ErrorDetails("404 not found",e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleExceptionGlobally(Exception e)
	{
		ErrorDetails error=new ErrorDetails("404 not found",e.getMessage(),LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
