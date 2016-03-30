package com.intel.yj.designpatterns.businessdelegate;

/**
 * 
 * Class for performing service lookups
 *
 */
public class BusinessLookup {

	public BusinessService getBusinessService(ServiceType serviceType) {
		if (serviceType.equals(ServiceType.EJB)) {
			return new EjbService();
		} else {
			return new JmsService();
		}
	}
}

