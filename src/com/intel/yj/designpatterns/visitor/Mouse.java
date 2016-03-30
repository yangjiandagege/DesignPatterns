package com.intel.yj.designpatterns.visitor;

public class Mouse  implements ComputerPart {
	 
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
}
