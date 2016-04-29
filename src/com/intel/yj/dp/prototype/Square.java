package com.intel.yj.dp.prototype;

import com.intel.yj.dp.Result;

public class Square extends Shape {
	 
	   public Square(){
	     type = "Square";
	   }
	 
	   @Override
	   public void draw() {
	      Result.append("Inside Square::draw() method.");
	   }
	}
