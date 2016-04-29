package com.intel.yj.dp.bridge;

import com.intel.yj.dp.Result;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		Result.append("Drawing Circle[ color: red, radius: "
		         + radius +", x: " +x+", "+ y +"]");

	}

}
