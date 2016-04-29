package com.intel.yj.dp.factory;

import com.intel.yj.dp.Result;

public class Rectangle implements Shape {
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Rectangle::draw() method.");
	   }
}
