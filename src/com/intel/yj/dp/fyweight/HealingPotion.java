package com.intel.yj.dp.fyweight;

import com.intel.yj.dp.Result;

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

