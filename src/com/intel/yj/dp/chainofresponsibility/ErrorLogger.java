package com.intel.yj.dp.chainofresponsibility;

import com.intel.yj.dp.Result;

public class ErrorLogger extends AbstractLogger {
	 
	   public ErrorLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("Error Console::Logger: " + message);
	   }
	}
