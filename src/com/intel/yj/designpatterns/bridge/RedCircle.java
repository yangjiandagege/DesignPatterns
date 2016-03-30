package com.intel.yj.designpatterns.bridge;

import com.intel.yj.designpatterns.Result;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		Result.append("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");

	}

}
