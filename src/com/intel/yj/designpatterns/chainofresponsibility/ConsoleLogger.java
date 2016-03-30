package com.intel.yj.designpatterns.chainofresponsibility;

import com.intel.yj.designpatterns.Result;

public class ConsoleLogger extends AbstractLogger {
	 
	   public ConsoleLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("Standard Console::Logger: " + message);
	   }
	}
