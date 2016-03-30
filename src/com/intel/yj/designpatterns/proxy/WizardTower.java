package com.intel.yj.designpatterns.proxy;

import com.intel.yj.designpatterns.Result;

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

