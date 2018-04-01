package com.gsitm.java.ex05;

public class RemoteCon_1051 {
	Tv_1051 tv = new Tv_1051();

	public boolean remoteOnOff() {
		System.out.println("리모컨을 들었습니다.");
		
		return tv.onOff();
	}
}
