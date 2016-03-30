package com.intel.yj.designpatterns.observer;

public class ObserverApp {

	public static void test(){
		Weather weather = new Weather();
		weather.addObserver(new Orcs());
		weather.addObserver(new Hobbits());

		weather.timePasses();
		weather.timePasses();
		weather.timePasses();
		weather.timePasses();
	}
}
