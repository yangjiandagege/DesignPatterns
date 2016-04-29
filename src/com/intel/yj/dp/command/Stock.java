package com.intel.yj.dp.command;

import com.intel.yj.dp.Result;

public class Stock {
    
	   private String name = "ABC";
	   private int quantity = 10;
	 
	   public void buy(){
	      Result.append("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
	   }
	   public void sell(){
		   Result.append("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	   }
}
