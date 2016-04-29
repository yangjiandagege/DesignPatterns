package com.intel.yj.dp.facade;

import com.intel.yj.dp.Result;

/**
 * 
 * DwarvenCartOperator is one of the goldmine subsystems.
 *
 */
public class DwarvenCartOperator extends DwarvenMineWorker {

	@Override
	public void work() {
		Result.append(name() + " moves gold chunks out of the mine.");
	}

	@Override
	public String name() {
		return "Dwarf cart operator";
	}

}
