package com.gsitm.java.ex05;

public class Tv_1051 {
	boolean state = false;
	
	public boolean onOff() {
		state = !state;
		System.out.println("tv ������"+state+"�߽��ϴ�.");
		
		return state;
	}
}
