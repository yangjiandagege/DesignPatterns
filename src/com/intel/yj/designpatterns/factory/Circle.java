package com.intel.yj.designpatterns.factory;

import com.intel.yj.designpatterns.Result;

public class Circle implements Shape {
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Circle::draw() method.");
	   }
}
