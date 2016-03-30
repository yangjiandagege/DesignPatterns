package com.intel.yj.designpatterns.abstractfactory;

import com.intel.yj.designpatterns.Result;

public class Red implements Color {

	@Override
	public void fill() {
		Result.append("Inside Red::fill() method.");
	}

}
