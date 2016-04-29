package com.intel.yj.dp.state;

import com.intel.yj.dp.Result;

/**
 * 
 * Peaceful state.
 *
 */
public class PeacefulState implements State {

	private Mammoth mammoth;

	public PeacefulState(Mammoth mammoth) {
		this.mammoth = mammoth;
	}

	@Override
	public void observe() {
		Result.append(String.format("%s is calm and peaceful.", mammoth));
	}

	@Override
	public void onEnterState() {
		Result.append(String.format("%s calms down.", mammoth));
	}

}

