package com.intel.yj.designpatterns.factory;

import com.intel.yj.designpatterns.Result;

public class Rectangle implements Shape {
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Rectangle::draw() method.");
	   }
}
