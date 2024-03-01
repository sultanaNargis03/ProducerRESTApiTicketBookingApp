package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.pojo.Passenger;
import com.telusko.pojo.Ticket;
import com.telusko.service.ITicketBookingService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/ticket-booking")
@Tag(name="TicketBookingApp",description="This API URL will help to book ticket")

public class TicketBookingController 
{
	@Autowired
	private ITicketBookingService service;
	
	@Operation(summary="POST operation",description="API will accept json passenger obj and return ticket number")
	@PostMapping("/getTicketNumber")
	public ResponseEntity<Ticket> enrollPassenger(@RequestBody Passenger passenger)
	{
		Passenger pas = service.registerPassenger(passenger);
		Ticket ticket=new Ticket();
		ticket.setTicketNumber(pas.getPid());
		
		return  new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	@Operation(summary="GET operation",description="API will accept json passenger ticket number and get ticket info")
	
	@GetMapping("/getTicket/{ticketNumber}")
	public ResponseEntity<Ticket> getTicket(@PathVariable("ticketNumber")Integer ticketNumber)
	{
		Ticket ticket=new Ticket();
		Passenger pas=service.getPassengerInfo(ticketNumber);
		ticket.setTicketNumber(pas.getPid());
		ticket.setName(pas.getName());
		ticket.setDeparture(pas.getDeparture());
		ticket.setArrival(pas.getArrival());
		ticket.setStatus("Confirmed");
		ticket.setDateOfJourney(pas.getDateOfJurney());
		
		ticket.setTicketCost(1000.60);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}

}
