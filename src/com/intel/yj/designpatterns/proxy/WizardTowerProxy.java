package com.intel.yj.designpatterns.proxy;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * The proxy controlling access to the {@link WizardTower}.
 * 
 */
public class WizardTowerProxy extends WizardTower {

	private static final int NUM_WIZARDS_ALLOWED = 3;

	private int numWizards;

	@Override
	public void enter(Wizard wizard) {
		if (numWizards < NUM_WIZARDS_ALLOWED) {
			super.enter(wizard);
			numWizards++;
		} else {
			Result.append(wizard + " is not allowed to enter!");
		}
	}
}

