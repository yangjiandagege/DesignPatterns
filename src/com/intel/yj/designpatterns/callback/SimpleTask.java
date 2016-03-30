package com.intel.yj.designpatterns.callback;

import com.intel.yj.designpatterns.Result;

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
