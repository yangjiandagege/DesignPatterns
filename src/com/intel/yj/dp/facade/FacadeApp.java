package com.intel.yj.dp.facade;
import java.util.concurrent.Callable;

import com.intel.yj.dp.Result;

public class FacadeApp {

	public static void test() {
		DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
		facade.startNewDay();
		facade.digOutGold();
		facade.endDay();
	}

}
