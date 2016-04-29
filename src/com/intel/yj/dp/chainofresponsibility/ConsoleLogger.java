package com.intel.yj.dp.chainofresponsibility;

import com.intel.yj.dp.Result;

public class ConsoleLogger extends AbstractLogger {
	 
	   public ConsoleLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("Standard Console::Logger: " + message);
	   }
	}
