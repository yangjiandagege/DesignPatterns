package com.intel.yj.dp.abstractfactory;

import com.intel.yj.dp.Result;

public class Red implements Color {

	@Override
	public void fill() {
		Result.append("Inside Red::fill() method.");
	}

}
