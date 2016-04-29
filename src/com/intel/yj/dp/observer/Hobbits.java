package com.intel.yj.dp.observer;

import com.intel.yj.dp.Result;

import android.util.Log;

public class Hobbits implements WeatherObserver {

	@Override
	public void update(WeatherType currentWeather) {
		switch (currentWeather) {
		case COLD:
			Result.append("The hobbits are shivering in the cold weather.");
			break;
		case RAINY:
			Result.append("The hobbits look for cover from the rain.");
			break;
		case SUNNY:
			Result.append("The happy hobbits bade in the warm sun.");
			break;
		case WINDY:
			Result.append("The hobbits hold their hats tightly in the windy weather.");
			break;
		default:
			break;
		}
	}

}
