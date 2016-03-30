package com.intel.yj.designpatterns.prototype;

import com.intel.yj.designpatterns.Result;

public class Circle extends Shape {
	 
	   public Circle(){
	     type = "Circle";
	   }
	 
	   @Override
	   public void draw() {
		   Result.append("Inside Circle::draw() method.");
	   }
	}
