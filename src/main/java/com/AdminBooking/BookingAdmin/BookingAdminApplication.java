package com.AdminBooking.BookingAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Admin Data for BookMySlot",version = "1.0" , description= "API for BookMySlot"))

public class BookingAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAdminApplication.class, args);
	}

}
