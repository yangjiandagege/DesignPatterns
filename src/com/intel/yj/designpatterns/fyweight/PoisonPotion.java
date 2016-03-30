package com.intel.yj.designpatterns.fyweight;

import com.intel.yj.designpatterns.Result;

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

