package com.intel.yj.dp.prototype;

import com.intel.yj.dp.Result;

public class Rectangle extends Shape {
	 
	   public Rectangle(){
	     type = "Rectangle";
	   }
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Rectangle::draw() method.");
	   }
	}
