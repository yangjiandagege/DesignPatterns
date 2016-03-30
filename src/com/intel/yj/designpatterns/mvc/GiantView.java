package com.intel.yj.designpatterns.mvc;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * GiantView displays the giant
 *
 */
public class GiantView {

	public void displayGiant(GiantModel giant) {
		Result.append(giant.toString());
	}
}

