package com.intel.yj.designpatterns.facade;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

	@Override
	public void work() {
		Result.append(name() + " digs for gold.");
	}

	@Override
	public String name() {
		return "Dwarf gold digger";
	}

}

