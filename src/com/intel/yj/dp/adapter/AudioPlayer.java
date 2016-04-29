package com.intel.yj.dp.adapter;

import com.intel.yj.dp.Result;

public class AudioPlayer implements MediaPlayer {
	   MediaAdapter mediaAdapter;

	   @Override
	   public void play(String audioType, String fileName) {       
	 
	      //播放 mp3 音乐文件的内置支持
	      if(audioType.equalsIgnoreCase("mp3")){
	         Result.append("Playing mp3 file. Name: "+ fileName);         
	      }
	      //mediaAdapter 提供了播放其他文件格式的支持
	      else if(audioType.equalsIgnoreCase("vlc")
	         || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else{
	         Result.append("Invalid media. "+
	            audioType + " format not supported");
	      }
	   }  
	}