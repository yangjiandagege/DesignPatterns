package com.intel.yj.dp.callback;

import com.intel.yj.dp.Result;

/**
 * 
 * Implementation of task that need to be executed
 * 
 */
public class SimpleTask extends Task {
	@Override
	public void execute() {
		Result.append("Perform some important activity and after call the callback method.");
	}
}
