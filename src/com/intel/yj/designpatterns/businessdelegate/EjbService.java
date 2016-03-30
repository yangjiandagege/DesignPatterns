package com.intel.yj.designpatterns.businessdelegate;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * Service EJB implementation
 *
 */
public class EjbService implements BusinessService {

	@Override
	public void doProcessing() {
		Result.append("EjbService is now processing");
	}
}

