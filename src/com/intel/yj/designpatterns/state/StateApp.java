package com.intel.yj.designpatterns.state;

public class StateApp {

	public static void test() {
		Mammoth mammoth = new Mammoth();
		mammoth.observe();
		mammoth.timePasses();
		mammoth.observe();
		mammoth.timePasses();
		mammoth.observe();
	}

}
