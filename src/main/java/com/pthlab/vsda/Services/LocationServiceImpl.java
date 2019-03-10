package com.pthlab.vsda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pthlab.vsda.DAO.LocationDAO;
@Service("LocationService")
@Transactional
public class LocationServiceImpl implements LocationService{

	//DENENDENCY INJECTION
	@Autowired
	LocationDAO locationDao;
	//END DEPENDENCY INJECTION
	
	@Override
	public boolean checkLocation(String longitude, String lattitude) {
		
		return locationDao.checkLocation(longitude,lattitude);
	}

}
