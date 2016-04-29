package com.intel.yj.dp.observer;

import com.intel.yj.dp.Result;

import android.util.Log;

public class Orcs implements WeatherObserver {

	@Override
	public void update(WeatherType currentWeather) {
		switch (currentWeather) {
		case COLD:
			Result.append("The orcs are freezing cold.");
			break;
		case RAINY:
			Result.append("The orcs are dripping wet.");
			break;
		case SUNNY:
			Result.append("The sun hurts the orcs' eyes.");
			break;
		case WINDY:
			Result.append("The orc smell almost vanishes in the wind.");
			break;
		default:
			break;
		}
	}

}
