package com.intel.yj.dp.fyweight;

import com.intel.yj.dp.Result;

/**
 * 
 * HolyWaterPotion
 *
 */
public class HolyWaterPotion implements Potion {

	@Override
	public void drink() {
		Result.append("You feel blessed. (Potion="
				+ System.identityHashCode(this) + ")");
	}

}

