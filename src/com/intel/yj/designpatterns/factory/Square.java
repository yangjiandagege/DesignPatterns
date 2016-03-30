package com.intel.yj.designpatterns.factory;

import com.intel.yj.designpatterns.Result;

public class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Result.append("Inside Square::draw() method.");
	}

}
