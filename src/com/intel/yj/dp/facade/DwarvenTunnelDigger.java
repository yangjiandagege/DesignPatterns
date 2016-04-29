package com.intel.yj.dp.facade;

import com.intel.yj.dp.Result;


/**
 * 
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

	@Override
	public void work() {
		Result.append(name() + " creates another promising tunnel.");
	}

	@Override
	public String name() {
		return "Dwarven tunnel digger";
	}

}

