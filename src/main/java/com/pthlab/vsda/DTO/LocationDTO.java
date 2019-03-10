package com.pthlab.vsda.DTO;

import java.io.Serializable;

public class LocationDTO implements Serializable{

	//PRIVATE VARIABLE DECLARATION
	private static final long serialVersionUID = -2410126621595824669L;
	private Long id;
	private String name;
	private String longitude;
	private String lattitude;
	private String createdTime;
	private String updatedTime;
	//END PRIVATE VARIABLE DECLARATION
	
	//GLOBAL POJOS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	//END GLOBAL POJOS
	

}
