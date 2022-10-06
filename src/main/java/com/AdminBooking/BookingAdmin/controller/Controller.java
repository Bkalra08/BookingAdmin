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

import com.AdminBooking.BookingAdmin.Entity.AdminDetails;
import com.AdminBooking.BookingAdmin.Services.ServiceClass;

@RestController
@RequestMapping("/AdminDetails")


public class Controller {
	@Autowired
	private ServiceClass services;
	
	@PostMapping("/AddAdminData")
	public AdminDetails AddAdminData(@RequestBody AdminDetails details) {
		return this.services.AddAdminData(details);
	}
	@GetMapping("/GetAdminDetails/{PlaceId}")
	public AdminDetails getAdminDetails(@PathVariable String PlaceId) {
		return this.services.getAdminDetails(Integer.parseInt(PlaceId));
	}
	@DeleteMapping("/DeleteAdminDetails/{PlaceId}")
	public ResponseEntity<?>DeleteData(@PathVariable int PlaceId){
		services.DeleteAdminDetails(services.findById(PlaceId).getPlaceId());
		return new ResponseEntity("DATA DELETED SUCCESSFULLY" , HttpStatus.OK);
	}
	@GetMapping("/GetAllAdminDetails")
	public List<AdminDetails>GetallDetails(){
		return this.services.getAllAdminDetails();
	}
	
//	@RequestMapping(value = "/UpdateBike/{PlaceId}/BPlacesLeft/{BikeSpace}" , method = RequestMethod.PUT , produces = {""})
	@PutMapping("/UpdateBike/{PlaceId}")
	public ResponseEntity<?>updateBike(@PathVariable int PlaceId, @RequestBody AdminDetails Adetails){
		
		services.updateBike(PlaceId , Adetails);
		return new ResponseEntity<>("Bike Space Updated " + PlaceId +" ",HttpStatus.OK);
	}
	@PutMapping("/UpdateCar/{PlaceId}")
	public ResponseEntity<?>updateCar(@PathVariable int PlaceId, @RequestBody AdminDetails Addetails){
		
		services.updateCar(PlaceId , Addetails);
		return new ResponseEntity<>("Car Space Updated " + PlaceId +" ",HttpStatus.OK);
	}
	
	
	
}
