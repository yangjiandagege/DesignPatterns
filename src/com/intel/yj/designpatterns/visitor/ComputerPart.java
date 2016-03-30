package com.intel.yj.designpatterns.visitor;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
}
