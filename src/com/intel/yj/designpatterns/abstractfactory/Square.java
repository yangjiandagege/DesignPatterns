package com.intel.yj.designpatterns.abstractfactory;

import com.intel.yj.designpatterns.Result;

public class Square implements Shape {

	@Override
	public void draw() {
		Result.append("Inside Square::draw() method.");
	}

}
