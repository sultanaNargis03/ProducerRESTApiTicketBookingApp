package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(title="Ticket Booking API",
		version="1.0",
		description="This API is to book ticket"),
		servers=@Server(
				url="http://localhost:8088/TicketBookingApp",
				description="This API URL will help to book ticket"
				
				)
		)
public class SpringRestApiFirst1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiFirst1Application.class, args);
	}

}
