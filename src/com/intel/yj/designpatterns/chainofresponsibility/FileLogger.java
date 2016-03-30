package com.intel.yj.designpatterns.chainofresponsibility;

import com.intel.yj.designpatterns.Result;

public class FileLogger extends AbstractLogger {
	 
	   public FileLogger(int level){
	      this.level = level;
	   }
	 
	   @Override
	   protected void write(String message) {      
	      Result.append("File::Logger: " + message);
	   }
	}
