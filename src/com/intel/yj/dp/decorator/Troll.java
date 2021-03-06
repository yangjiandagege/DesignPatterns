package com.intel.yj.dp.decorator;

import com.intel.yj.dp.Result;

/**
 * 
 * Troll implements {@link Hostile} interface directly.
 *
 */
public class Troll implements Hostile {

	public void attack() {
		Result.append("The troll swings at you with a club!");
	}

	@Override
	public int getAttackPower() {
		return 10;
	}

	public void fleeBattle() {
		Result.append("The troll shrieks in horror and runs away!");
	}

}

