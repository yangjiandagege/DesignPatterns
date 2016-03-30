package com.intel.yj.designpatterns.fyweight;

import com.intel.yj.designpatterns.Result;

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

