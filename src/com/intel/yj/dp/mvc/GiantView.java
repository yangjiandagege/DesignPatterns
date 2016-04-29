package com.intel.yj.dp.mvc;

import com.intel.yj.dp.Result;

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

