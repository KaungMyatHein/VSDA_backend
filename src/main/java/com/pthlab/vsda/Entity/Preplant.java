package com.pthlab.vsda.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pre_plant")
public class Preplant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "rain")
	private int rain;
	
	@Column(name = "wet_season")
	private int wetSeason;
	
	@Column(name = "soil_nutrient")
	private int soilNutrient;
	
	@Column(name = "lime_soil")
	private int limeSoil;
	
	@Column(name = "soil_tiling")
	private int soilTiling;
	
	@Column(name = "salt_tolernat_rice")
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
