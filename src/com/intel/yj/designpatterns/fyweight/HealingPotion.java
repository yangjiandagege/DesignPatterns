package com.intel.yj.designpatterns.fyweight;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * HealingPotion
 *
 */
public class HealingPotion implements Potion {

	@Override
	public void drink() {
		Result.append("You feel healed. (Potion="
				+ System.identityHashCode(this) + ")");
	}

}

