package com.pthlab.vsda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plant")
public class Plant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "soil_salinity")
	private int soilSalinity;
	
	@Column(name = "soil_ph")
	private int soilPh;
	
	@Column(name = "water_temperature")
	private int waterTemperature;
	
	@Column(name = "soil_nutrient")
	private int soilNutrient;
	
	@Column(name = "salt_tolerant_rice")
	private int saltTolerantRice;
	
	@Column(name = "water_color_management")
	private int waterColorManagement;
	
	@Column(name = "shrimp_stocking_density")
	private int shrimpStockingDensity;
	
	@Column(name = "probability_of_rice_faliure")
	private int probabilityOfRiceFaliure;
	
	@Column(name = "probability_of_shrimp_faliure")
	private int probabilityOfShrimpFaliure;
}
