package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Human_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 송현석
 * @프로그램 설명                : 사람이 리모콘을 통해 전원을 키는 과정 중 사람에 해당하는 클래스.
 */
public class Human_1047 {
	public Human_1047() {
		
	}
	
	public void turnOnRemote(RemoteCon_1047 rmc) {
		rmc.turnOn();
	}
	public static void main(String args[]) {
		Human_1047 human = new Human_1047();
		Tv_1047 tv = new Tv_1047();
		RemoteCon_1047 remocon = new RemoteCon_1047(tv);
		human.turnOnRemote(remocon);
		human.turnOnRemote(remocon);
	}
}
