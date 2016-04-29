package com.intel.yj.dp.fyweight;

import com.intel.yj.dp.Result;

/**
 * 
 * StrengthPotion
 *
 */
public class StrengthPotion implements Potion {

	@Override
	public void drink() {
		Result.append("You feel strong. (Potion="
				+ System.identityHashCode(this) + ")");
	}
}

