package com.intel.yj.dp.state;

import com.intel.yj.dp.Result;

/**
 * 
 * Angry state.
 *
 */
public class AngryState implements State {

	private Mammoth mammoth;

	public AngryState(Mammoth mammoth) {
		this.mammoth = mammoth;
	}

	@Override
	public void observe() {
		Result.append(String.format("%s is furious!", mammoth));
	}

	@Override
	public void onEnterState() {
		Result.append(String.format("%s gets angry!", mammoth));
	}

}

