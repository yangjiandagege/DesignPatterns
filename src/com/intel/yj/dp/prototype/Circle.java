package com.intel.yj.dp.prototype;

import com.intel.yj.dp.Result;

public class Circle extends Shape {
	 
	   public Circle(){
	     type = "Circle";
	   }
	 
	   @Override
	   public void draw() {
		   Result.append("Inside Circle::draw() method.");
	   }
	}
