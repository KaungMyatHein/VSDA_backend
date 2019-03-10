package com.pthlab.vsda.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pthlab.vsda.API.requests.LocationRequest;
import com.pthlab.vsda.Services.LocationService;

@RestController
public class LocationAPIController {

	//Dependency Injection
	@Autowired
	LocationService locationService;
	
	@PostMapping (name = "/API/checkLocation")
	public String checkAvailableLocation (LocationRequest request) 	
	{		
		System.out.println("Arrive");
		//Error error = isValidLocationRequest(request);
		//if(error == null) 
		//{
			boolean isAvailable = locationService.checkLocation(request.getLongitude(),request.getLattitude());
		//}
		return "Location";
	}

	private Error isValidLocationRequest(LocationRequest request) {
		if(request.getLongitude() != null && !request.getLongitude().trim().isEmpty()) 
		{
			return new Error("Invalid Longitude Value");
		}
		if(request.getLattitude() != null && !request.getLattitude().trim().isEmpty()) 
		{
			return new Error("Invalid Lattitude Value");
		}
		return null;
	}

	
}
