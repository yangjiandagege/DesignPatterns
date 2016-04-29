package com.intel.yj.dp.adapter;

import com.intel.yj.dp.Result;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		Result.append("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
	}

}
