package com.pthlab.vsda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pthlab.vsda.API.requests.LocationRequest;
import com.pthlab.vsda.Services.LocationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Autowired
	LocationService locationService;
	
	@Test
	public void LocationAPICallTestSuccess() {
		LocationRequest request = new LocationRequest();
		request.setLongitude("");
		request.setLattitude("");
		assertEquals(true, locationService.checkLocation(request));
	}
	
	@Test
	public void LocationAPICallTestFail() {
		LocationRequest request = new LocationRequest();
		request.setLongitude("");
		request.setLattitude("");
		assertEquals(true, locationService.checkLocation(request));
	}

}
