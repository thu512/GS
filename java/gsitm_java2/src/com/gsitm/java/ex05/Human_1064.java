package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 장진영
* @프로그램 설명           : 리모컨 전원을 키고 끄는 메소드
*/
public class Human_1064 {
	RemoteCon_1064 remote = new RemoteCon_1064();
	Tv_1064 tv = new Tv_1064();
	public void turnOn() {
		remote.turnOn(tv);
		System.out.println(tv.power);
	}
	
	public static void main(String[] args) {
		Human_1064 human = new Human_1064();
		human.turnOn();
		human.turnOn();
		human.turnOn();
	}
}
