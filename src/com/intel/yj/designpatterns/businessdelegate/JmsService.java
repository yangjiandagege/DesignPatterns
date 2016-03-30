package com.intel.yj.designpatterns.businessdelegate;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * Service JMS implementation
 *
 */
public class JmsService implements BusinessService {

	@Override
	public void doProcessing() {
		Result.append("JmsService is now processing");
	}
}

