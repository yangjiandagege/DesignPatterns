package com.intel.yj.designpatterns.fyweight;

import com.intel.yj.designpatterns.Result;

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

