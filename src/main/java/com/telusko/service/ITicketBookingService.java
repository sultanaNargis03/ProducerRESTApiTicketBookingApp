package com.telusko.service;

import com.telusko.pojo.Passenger;

public interface ITicketBookingService 
{
	public Passenger registerPassenger(Passenger passenger);
	public Passenger getPassengerInfo(Integer id);
}
