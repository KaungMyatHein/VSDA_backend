package com.pthlab.vsda.API;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pthlab.vsda.API.requests.LocationRequest;
import com.pthlab.vsda.API.responses.APIUTIL;
import com.pthlab.vsda.API.responses.LocationResponse;
import com.pthlab.vsda.Services.LocationService;
import com.pthlab.vsda.Util.CommomConstants;
import com.pthlab.vsda.Util.ProcessException;

@RestController
public class LocationAPIController {

	@Autowired
	LocationService locationService;

	@PostMapping(name = "/API/checkLocation")
	public String checkAvailableLocation(@RequestBody LocationRequest request, HttpServletRequest req) {
		LocationResponse response = new LocationResponse();
		ProcessException pe = null;
		String result = null;
		Error error = isValidLocationRequest(request);
		if (error != null) 
		{
			pe = new ProcessException(ProcessException.ErrorType.INVALID_DATA);
			response.setResponseCode(CommomConstants.API_RESPONSE_ERROR_CODE);
			response.setResponseMessage(error.getMessage());
			
		} else {
			boolean isAvailable = locationService.checkLocation(request);
			response.setIsInRange(isAvailable);
			response.setResponseCode(CommomConstants.API_RESPONSE_SUCCESS_CODE);
			
		}
		result = APIUTIL.formatJsonResponse(response, pe);
		return result;
	}

	private Error isValidLocationRequest(LocationRequest request) {
		System.out.println(request);
		if (request.equals(null)) {
			return new Error("Request is Empty");
		}

		else {
			if( (request.getLongitude() == null || request.getLongitude().trim().isEmpty()) && (request.getLattitude() == null || request.getLattitude().trim().isEmpty())) 
			{
				return new Error("All datas are empty");
			}
			else 
			{
				if (request.getLongitude() == null || request.getLongitude().trim().isEmpty()) {
					return new Error("Invalid Longitude Value");
				}
				if (request.getLattitude() == null || request.getLattitude().trim().isEmpty()) {
					return new Error("Invalid Lattitude Value");
				}
			}
		}
		return null;
	}

}

