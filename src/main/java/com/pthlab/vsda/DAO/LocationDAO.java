package com.pthlab.vsda.DAO;

import com.pthlab.vsda.API.requests.LocationRequest;

public interface LocationDAO {

	boolean checkLocation(LocationRequest request);

}
