package com.intel.yj.designpatterns.facade;
import java.util.concurrent.Callable;

import com.intel.yj.designpatterns.Result;

public class FacadeApp {

	public static void test() {
		DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
		facade.startNewDay();
		facade.digOutGold();
		facade.endDay();
	}

}
