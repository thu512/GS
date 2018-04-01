package com.gsitm.java.ex05;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Human_1050.java 
* @Project				: gsitm_java 
* @Date					: 2018. 3. 30. 
* @작성자					: 우연찬
* @프로그램 설명			: 리모콘을 이용한 TV 켜기
*/
public class Human_1050 {
	void remoteOn() {
		System.out.println("리모콘 전원을 키다.");
		Tv_1050 t = new Tv_1050();
		t.power=false;
	}
	void remoteOff() {
		System.out.println("리모콘 전원을 껐다.");
		Tv_1050 t = new Tv_1050();
		t.power=true;
	}

	public static void main(String[] args) {
		Human_1050 h = new Human_1050();
		Tv_1050 t = new Tv_1050();
		remoteCon_1050 r = new remoteCon_1050();
		
		h.remoteOn();// TV 키기
		r.OnOff(t.power); // 리모콘 동작
		
		h.remoteOff(); //TV끄기
		r.OnOff(t.power); // 리모콘 동작
	}
}

class Tv_1050 {
	static boolean power;
}

class remoteCon_1050 {
	boolean OnOff(boolean power) {
		if (power == false) {
			power = true;
			System.out.println("전원을 켰다.");
		}else {
			power = false;
			System.out.println("전원을 껐다.");
		}
		return power;
	}
}
