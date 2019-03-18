package com.pthlab.vsda.API.responses;

import java.io.Serializable;

import com.pthlab.vsda.DTO.LocationAPIDTO;

public class LocationResponse extends Response<LocationResponse> implements Serializable{

	private static final long serialVersionUID = 6702043306453002648L;
	
	private LocationAPIDTO locationAPI;
	
	private boolean isInRange;
	
	public LocationAPIDTO getLocationAPI() 
	{
		return locationAPI;
	}
	
	public void setLocationAPI(LocationAPIDTO locationAPI) 
	{
		this.locationAPI = locationAPI;
	}
	

	public boolean getIsInRange() {
		return isInRange;
	}

	public void setIsInRange(boolean isInRange) {
		this.isInRange = isInRange;
	}
}
