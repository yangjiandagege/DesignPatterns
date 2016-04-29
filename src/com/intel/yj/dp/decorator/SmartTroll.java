package com.intel.yj.dp.decorator;

import com.intel.yj.dp.Result;


/**
 * SmartTroll is a decorator for {@link Hostile} objects.
 * The calls to the {@link Hostile} interface are intercepted
 * and decorated. Finally the calls are delegated
 * to the decorated {@link Hostile} object.
 *
 */
public class SmartTroll implements Hostile {

	private Hostile decorated;

	public SmartTroll(Hostile decorated) {
		this.decorated = decorated;
	}

	@Override
	public void attack() {
		Result.append("The troll throws a rock at you!");
		decorated.attack();
	}

	@Override
	public int getAttackPower() {
		// decorated troll power + 20 because it is smart
		return decorated.getAttackPower() + 20;
	}

	@Override
	public void fleeBattle() {
		Result.append("The troll calls for help!");
		decorated.fleeBattle();
	}

}

