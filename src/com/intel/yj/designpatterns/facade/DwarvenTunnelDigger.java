package com.intel.yj.designpatterns.facade;

import com.intel.yj.designpatterns.Result;


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

