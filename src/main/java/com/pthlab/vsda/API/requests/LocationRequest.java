package com.pthlab.vsda.API.requests;

public class LocationRequest {
	
	//PRIVATE VARIABLE DECLARATION
	private String longitude;
	private String lattitude;
	//END PRIVATE VARIABLE DECLARATION
	
	//GLOBAL POJO
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	//END GLOBAL POJO
}
