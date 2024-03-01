package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.pojo.Passenger;

public interface ITicketRepo extends JpaRepository<Passenger, Integer> {

}
