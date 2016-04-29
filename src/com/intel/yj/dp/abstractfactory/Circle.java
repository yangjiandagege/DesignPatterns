package com.intel.yj.dp.abstractfactory;

import com.intel.yj.dp.Result;

public class Circle implements Shape {
	@Override
	public void draw() {
		Result.append("Inside Circle::draw() method.");
	}

}
