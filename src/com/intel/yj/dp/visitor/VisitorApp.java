package com.intel.yj.dp.visitor;

import com.intel.yj.dp.Result;

public class VisitorApp {

	public static void test() {
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}
}
