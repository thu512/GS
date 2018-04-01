package com.gsitm.java.ex05;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자              : 이종건
* @프로그램 설명       : turnOn 메소드 return boolean
*/
public class RemoteCon_1059 {
	Tv_1059 tv = new Tv_1059();
	boolean turnOn() {
		if(tv.isOn) {
			System.out.println("Tv가 이미 켜져있습니다.");
			return tv.isOn;
		} else {
			System.out.println("Tv를 켰습니다.");			
			tv.isOn = true; // flag
			return tv.isOn;
		}
		
	}
	
//	boolean turnOff() {
//		if(tv.isOn) {
//			System.out.println("Tv를 끄겠습니다.");
//			tv.isOn = false;
//			return tv.isOn;
//		} else {
//			System.out.println("이미 Tv가 꺼져있습니다.");
//			return tv.isOn;
//		}
//	}
}
