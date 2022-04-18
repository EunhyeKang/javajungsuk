package com.java.ch077;

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		//유효성검사
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		// 1)현재 채널을 이전 채널에 저장한다.
		prevChannel = this.channel;
		// 2)setChannel 
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}	
	
	public void gotoPrevChannel() {
		
		setChannel(prevChannel);
		
	}
}