package com.intel.yj.designpatterns.visitor;

import com.intel.yj.designpatterns.Result;

public class VisitorApp {

	public static void test() {
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}
}
