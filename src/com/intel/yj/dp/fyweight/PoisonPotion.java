package com.intel.yj.dp.fyweight;

import com.intel.yj.dp.Result;

/**
 * 
 * PoisonPotion
 *
 */
public class PoisonPotion implements Potion {

	@Override
	public void drink() {
		Result.append("Urgh! This is poisonous. (Potion="
				+ System.identityHashCode(this) + ")");
	}

}

