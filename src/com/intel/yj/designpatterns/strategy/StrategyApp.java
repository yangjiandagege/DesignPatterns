package com.intel.yj.designpatterns.strategy;

import com.intel.yj.designpatterns.Result;

public class StrategyApp {

	public static void test() {
	      Context context = new Context(new OperationAdd());       
	      Result.append("10 + 5 = " + context.executeStrategy(10, 5));
	 
	      context = new Context(new OperationSubstract());     
	      Result.append("10 - 5 = " + context.executeStrategy(10, 5));
	 
	      context = new Context(new OperationMultiply());      
	      Result.append("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
