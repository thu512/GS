package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex05
* @Date                : 2018. 3. 30. 오후 2:28:14
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*/
public class Human_1038 {
	public static void main(String[] args) {
		RemoteController_1038 remocon = new RemoteController_1038();
		System.out.println("tv킵니다 ㅎㅎㅎ" + remocon.turnOnTv());
		System.out.println("tv끕니다 ㅎㅎㅎ" + remocon.turnOnTv());
	}
}

class Tv_1038 {
	private boolean power;
	public Tv_1038() {
		this.power = false;//Tv는 최초 꺼진 상태로 생성
	}
	public Tv_1038(boolean power) {//Tv 전원 생성
		this.power = power;
	}
	public boolean OnOff() {//Tv 전원 반전
		this.power = !this.power;
		return this.power;
	}
}

class RemoteController_1038 {
	private Tv_1038 tv; //위의 클래스명 Tv_1038을 자료형으로 Tv_1038로 tv에 담아서 아래에서 사용하겠다.
	public RemoteController_1038() {
		this.tv = new Tv_1038();// tv를 인스턴스 Tv_1038로 인스턴스화 시킴
	}
//	public RemoteController_1038(Tv_1038 tv) {
//		this.tv = tv;
//	}
	public boolean turnOnTv() {//this.tv에서 OnOff호출
		return this.tv.OnOff();
	}
}