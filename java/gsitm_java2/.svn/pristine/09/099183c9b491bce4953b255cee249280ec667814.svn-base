package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손원락
* @프로그램 설명           : 리모컨을 이용한 tv끄고 켜기
*/
public class Human_1045 {
	
	public static void main(String[] args) {
		RemoteCon_1045 remoteC = new RemoteCon_1045();
		remoteC.on();
		remoteC.tvOnOff();
		remoteC.off();
		remoteC.tvOnOff();
	}

}

class Tv_1045 {
	Tv_1045(){	}
	
	Tv_1045(boolean remote) {
		if (remote == true) {
			System.out.println("전원이 켜졌습니다.");
		} else if(remote == false){			
			System.out.println("전원이 꺼졌습니다.");
		}
	}
}


class RemoteCon_1045 {
	boolean power;

	void on() {
		
	this.power = true;
	}

	void off() {
		this.power = false;
	}

	void tvOnOff() {
		Tv_1045 tv = new Tv_1045(power);
	}
	

}
