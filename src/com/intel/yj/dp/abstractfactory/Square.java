package com.intel.yj.dp.abstractfactory;

import com.intel.yj.dp.Result;

public class Square implements Shape {

	@Override
	public void draw() {
		Result.append("Inside Square::draw() method.");
	}

}
