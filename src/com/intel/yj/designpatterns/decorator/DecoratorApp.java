package com.intel.yj.designpatterns.decorator;

import com.intel.yj.designpatterns.Result;

public class DecoratorApp {
	public static void test(){
		// simple troll
		Result.append("A simple looking troll approaches.");
		Hostile troll = new Troll();
		troll.attack();
		troll.fleeBattle();
		Result.append("Simple troll power"+troll.getAttackPower());

		// change the behavior of the simple troll by adding a decorator
		Result.append("\nA smart looking troll surprises you.");
		Hostile smart = new SmartTroll(troll);
		smart.attack();
		smart.fleeBattle();
		Result.append("Smart troll power "+ smart.getAttackPower());
	}
}
