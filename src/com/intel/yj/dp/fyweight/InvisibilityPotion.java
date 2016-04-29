package com.intel.yj.dp.fyweight;

import com.intel.yj.dp.Result;

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

