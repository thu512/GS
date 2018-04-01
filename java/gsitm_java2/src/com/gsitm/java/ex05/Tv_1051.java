package com.gsitm.java.ex05;

public class Tv_1051 {
	boolean state = false;
	
	public boolean onOff() {
		state = !state;
		System.out.println("tv 전원을"+state+"했습니다.");
		
		return state;
	}
}
