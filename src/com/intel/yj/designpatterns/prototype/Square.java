package com.intel.yj.designpatterns.prototype;

import com.intel.yj.designpatterns.Result;

public class Square extends Shape {
	 
	   public Square(){
	     type = "Square";
	   }
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Square::draw() method.");
	   }
	}
