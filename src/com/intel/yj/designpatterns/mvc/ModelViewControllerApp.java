package com.intel.yj.designpatterns.mvc;

public class ModelViewControllerApp {

	public static void test() {
    	// create model, view and controller
    	GiantModel giant = new GiantModel(Health.HEALTHY, Fatigue.ALERT, Nourishment.SATURATED);
    	GiantView view = new GiantView();
    	GiantController controller = new GiantController(giant, view);
    	// initial display
    	controller.updateView();
    	// controller receives some interactions that affect the giant
    	controller.setHealth(Health.WOUNDED);
    	controller.setNourishment(Nourishment.HUNGRY);
    	controller.setFatigue(Fatigue.TIRED);
    	// redisplay
    	controller.updateView();
	}

}
