package com.intel.yj.dp.template;

import com.intel.yj.dp.Result;

public class Football extends Game {
	 
	   @Override
	   void endPlay() {
	      Result.append("Football Game Finished!");
	   }
	 
	   @Override
	   void initialize() {
		   Result.append("Football Game Initialized! Start playing.");
	   }
	 
	   @Override
	   void startPlay() {
		   Result.append("Football Game Started. Enjoy the game!");
	   }
	}
