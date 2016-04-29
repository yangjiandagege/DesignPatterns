package com.intel.yj.dp.businessdelegate;

import com.intel.yj.dp.Result;

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

