package com.pthlab.vsda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "longitude")
	private int longitude;

	@Column(name = "lattitude")
	private int lattitude;

	@Column(name = "name")
	private int name;
	
	@Column(name = "createdTime")
	private int createdTime;
	
	@Column(name = "updatedTime")
	private int updatedTime;
}
