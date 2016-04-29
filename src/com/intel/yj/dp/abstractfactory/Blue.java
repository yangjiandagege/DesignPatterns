package com.intel.yj.dp.abstractfactory;

import com.intel.yj.dp.Result;

public class Blue implements Color {

	@Override
	public void fill() {
		Result.append("Inside Blue::fill() method.");
	}

}
