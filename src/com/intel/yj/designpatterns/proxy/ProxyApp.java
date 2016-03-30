package com.intel.yj.designpatterns.proxy;

public class ProxyApp {
	public static void test(){
		WizardTowerProxy tower = new WizardTowerProxy();
		tower.enter(new Wizard("Red wizard"));
		tower.enter(new Wizard("White wizard"));
		tower.enter(new Wizard("Black wizard"));
		tower.enter(new Wizard("Green wizard"));
		tower.enter(new Wizard("Brown wizard"));
	}
}
