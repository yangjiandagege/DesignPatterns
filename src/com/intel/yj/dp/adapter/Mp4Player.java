package com.intel.yj.dp.adapter;

import com.intel.yj.dp.Result;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		Result.append("Playing mp4 file. Name: "+ fileName);
	}

}
