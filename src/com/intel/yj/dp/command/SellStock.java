package com.intel.yj.dp.command;

public class SellStock implements Order {
	   private Stock abcStock;
	 
	   public SellStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }
	 
	   public void execute() {
	      abcStock.sell();
	   }
}
