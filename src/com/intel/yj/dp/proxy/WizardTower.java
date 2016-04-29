package com.intel.yj.dp.proxy;

import com.intel.yj.dp.Result;

/**
 * 
 * The object to be proxyed.
 * 
 */
public class WizardTower {

	public void enter(Wizard wizard) {
		Result.append(wizard + " enters the tower.");
	}

}

