package com.intel.yj.dp.visitor;

import com.intel.yj.dp.Result;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
	 
	   @Override
	   public void visit(Computer computer) {
	      Result.append("Displaying Computer.");
	   }
	 
	   @Override
	   public void visit(Mouse mouse) {
		   Result.append("Displaying Mouse.");
	   }
	 
	   @Override
	   public void visit(Keyboard keyboard) {
		   Result.append("Displaying Keyboard.");
	   }
	 
	   @Override
	   public void visit(Monitor monitor) {
		   Result.append("Displaying Monitor.");
	   }
	}
