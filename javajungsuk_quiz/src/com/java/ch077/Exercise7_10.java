package com.java.ch077;


class MyTv2{
	private boolean isPowerOn;
	private int channerl;
	private int volume;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannerl() {
		return channerl;
	}
	public void setChannerl(int channerl) {
		this.channerl = channerl;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	
	
}
public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannerl(10);
		System.out.println("CH:"+t.getChannerl());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}
}
