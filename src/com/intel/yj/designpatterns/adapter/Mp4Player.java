package com.intel.yj.designpatterns.adapter;

import com.intel.yj.designpatterns.Result;

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
