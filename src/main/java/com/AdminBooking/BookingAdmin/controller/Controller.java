package com.AdminBooking.BookingAdmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdminBooking.BookingAdmin.DAOlayer.DAOLayer;
import com.AdminBooking.BookingAdmin.Entity.AdminDetails;
import com.AdminBooking.BookingAdmin.Services.ServiceClass;

@RestController
@RequestMapping("/AdminDetails")


public class Controller {
	@Autowired
	private ServiceClass services;
//	@Autowired 
////	private DAOLayer dlayer;
	
	@PostMapping("/AddAdminData")
	public AdminDetails AddAdminData(@RequestBody AdminDetails details) {
		return this.services.AddAdminData(details);
	}
	@GetMapping("/GetAdminDetails/{ownerId}")
	public AdminDetails getAdminDetails(@PathVariable String ownerId) {
		return this.services.getAdminDetails(Long.parseLong(ownerId));
	}
	@DeleteMapping("/DeleteAdminDetails/{ownerId}")
	public ResponseEntity<?>DeleteData(@PathVariable long ownerId){
		services.DeleteAdminDetails(services.findById(ownerId).getOwnerId());
		return new ResponseEntity("DATA DELETED SUCCESSFULLY" , HttpStatus.OK);
	}
	@GetMapping("/GetAllAdminDetails")
	public List<AdminDetails>GetallDetails(){
		return this.services.getAllAdminDetails();
	}
	
	@PutMapping("/UpdateBike/{ownerId}")
	public ResponseEntity<?>updateBike(@PathVariable long ownerId, @RequestBody AdminDetails Adetails){
		
		services.updateBike(ownerId , Adetails);
		return new ResponseEntity<>("Bike Space Updated " + ownerId +" ",HttpStatus.OK);
	}
	@PutMapping("/UpdateCar/{ownerId}")
	public ResponseEntity<?>updateCar(@PathVariable long ownerId, @RequestBody AdminDetails Addetails){
		
		services.updateCar(ownerId , Addetails);
		return new ResponseEntity<>("Car Space Updated " + ownerId +" ",HttpStatus.OK);
	}
	
	
	
}
