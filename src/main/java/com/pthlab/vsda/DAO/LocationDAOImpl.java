package com.pthlab.vsda.DAO;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	public boolean checkLocation(String longitude, String lattitude) {
		CriteriaBuilder builder = this.getSession().getCriteriaBuilder();
		CriteriaQuery<Location> locationQuery = builder.createQuery(Location.class);
		Root<Location> root = locationQuery.from(Location.class);
		
		locationQuery.select(root);
		return locationQuery.select(root) == null ? false : true;
	}

}
