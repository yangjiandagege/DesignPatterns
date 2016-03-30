package com.intel.yj.designpatterns.abstractfactory;

import com.intel.yj.designpatterns.Result;

public class Blue implements Color {

	@Override
	public void fill() {
		Result.append("Inside Blue::fill() method.");
	}

}
