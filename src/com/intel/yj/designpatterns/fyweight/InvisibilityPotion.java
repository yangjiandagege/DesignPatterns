package com.intel.yj.designpatterns.fyweight;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * InvisibilityPotion
 *
 */
public class InvisibilityPotion implements Potion {

	@Override
	public void drink() {
		Result.append("You become invisible. (Potion="
				+ System.identityHashCode(this) + ")");
	}

}

