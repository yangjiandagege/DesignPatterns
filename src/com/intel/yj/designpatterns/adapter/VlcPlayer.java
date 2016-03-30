package com.intel.yj.designpatterns.adapter;

import com.intel.yj.designpatterns.Result;

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
