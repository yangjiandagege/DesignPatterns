package com.intel.yj.dp.businessdelegate;

import com.intel.yj.dp.Result;

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

