package com.intel.yj.dp.chainofresponsibility;

import com.intel.yj.dp.Result;

public class FileLogger extends AbstractLogger {
	 
	   public FileLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("File::Logger: " + message);
	   }
	}
