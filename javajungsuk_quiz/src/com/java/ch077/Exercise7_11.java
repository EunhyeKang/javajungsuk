package com.java.ch077;


class MyTv2{
	private boolean isPowerOn;
	private int channerl;
	private int volume;
	
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
		return channerl;
	}
	public void setChannel(int channerl) {
		this.channerl = channerl;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
//		int prevCh = 
	}
	
}
public class Exercise7_11 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:+t.getChannel()");
		
		t.gotoPrevChannel();
		System.out.println("CH:+t.getChannel()");
		
	}
}
