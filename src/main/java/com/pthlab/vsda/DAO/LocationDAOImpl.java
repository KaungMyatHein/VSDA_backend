package com.pthlab.vsda.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pthlab.vsda.API.requests.LocationRequest;
import com.pthlab.vsda.Entity.Location;

@Repository("LocationDao")
@Transactional
public class LocationDAOImpl implements LocationDAO{

	//DEPENDENCY INJETION
	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	//END OF DEPENDENCY INJECTION
	
	@Override
	public boolean checkLocation(LocationRequest request) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<Location> query = builder.createQuery(Location.class);
		Root<Location> root = query.from(Location.class);
		query.select(root);
		Query<Location> q = getSession().createQuery(query);
		List<Location> locationList = q.getResultList();
		
		return checkLocationIsAvailable(request,locationList);
	}

	private boolean checkLocationIsAvailable(LocationRequest request, List<Location> locationList) {
		
		for (Location location : locationList) {
			if(getDistance(request,location) < 20) 
			{
				 return true;
			}
		}
		return false;
	}

	private double getDistance(LocationRequest request, Location location) {
		 double theta = Double.parseDouble(request.getLongitude()) - location.getLongitude();
         double dist = Math.sin(deg2rad(Double.parseDouble(request.getLattitude())))
        		 * Math.sin(deg2rad(location.getLattitude())) 
        		 + Math.cos(deg2rad(Double.parseDouble(request.getLattitude()))) 
        		 * Math.cos(deg2rad(location.getLattitude())) 
        		 * Math.cos(deg2rad(theta));
         dist = Math.acos(dist);
         dist = rad2deg(dist);
         dist = dist * 60 * 1.1515;
          
           dist = dist * 0.8684;
           
         return (dist);
       }
   public double deg2rad(double deg) {
         return (deg * Math.PI / 180.0);
       }
   public double rad2deg(double rad) {
         return (rad * 180.0 / Math.PI);
       }


}
