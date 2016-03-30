package com.intel.yj.designpatterns.template;

import com.intel.yj.designpatterns.Result;

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
