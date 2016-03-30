package com.intel.yj.designpatterns.template;

import com.intel.yj.designpatterns.Result;

public class Cricket extends Game {
	 
	   @Override
	   void endPlay() {
	      Result.append("Cricket Game Finished!");
	   }
	 
	   @Override
	   void initialize() {
		   Result.append("Cricket Game Initialized! Start playing.");
	   }
	 
	   @Override
	   void startPlay() {
		   Result.append("Cricket Game Started. Enjoy the game!");
	   }
}