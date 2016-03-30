package com.intel.yj.designpatterns.template;

public class TemplateApp {

	public static void test() {
	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play(); 
	}

}
