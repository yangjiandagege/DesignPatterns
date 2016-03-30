package com.intel.yj.designpatterns.chainofresponsibility;

import com.intel.yj.designpatterns.Result;

public class ErrorLogger extends AbstractLogger {
	 
	   public ErrorLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("Error Console::Logger: " + message);
	   }
	}
