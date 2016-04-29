package com.intel.yj.dp.abstractfactory;

import com.intel.yj.dp.Result;

public class Green implements Color {

	@Override
	public void fill() {
		Result.append("Inside Green::fill() method.");
	}

}
