package com.intel.yj.designpatterns.abstractfactory;

import com.intel.yj.designpatterns.Result;

public class Green implements Color {

	@Override
	public void fill() {
		Result.append("Inside Green::fill() method.");
	}

}
