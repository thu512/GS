package com.gsitm.java.ex05;

public class Tv_1033 { //Tv라는 객체(사물)을 만든거야!
	
	boolean isOn = false; //꺼져있는 것으로 초기화
	
	public boolean getPower() {
		return isOn;
	}
	
	public void setPower(boolean isOn) {
		this.isOn = isOn;
		if(isOn == false) {
			isOn = true;
			System.out.println("켜짐");
		}
		else {
			isOn = false;
			System.out.println("꺼짐");
		}
	}
}
