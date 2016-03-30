package com.intel.yj.designpatterns.prototype;

import com.intel.yj.designpatterns.Result;

public class Rectangle extends Shape {
	 
	   public Rectangle(){
	     type = "Rectangle";
	   }
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Rectangle::draw() method.");
	   }
	}
