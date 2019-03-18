package com.pthlab.vsda.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pthlab.vsda.API.requests.LocationRequest;
import com.pthlab.vsda.DAO.LocationDAO;
@Service("LocationService")
@Transactional
public class LocationServiceImpl implements LocationService{

	//DENENDENCY INJECTION
	@Autowired
	LocationDAO locationDao;
	//END DEPENDENCY INJECTION
	
	@Override
	public boolean checkLocation(LocationRequest request) {
		return locationDao.checkLocation(request);
	}

}
