package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손혜성
* @프로그램 설명           : 리모컨으로 티비켜기
*/
public class Human_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteCon_1046 remoteController = new RemoteCon_1046();
		Tv_1046 myTv = remoteController.getTv();
		
		System.out.println("tv 전원 상태 : " + remoteController.powerOn());
		System.out.println("tv 전원 상태 : " + myTv.isPower());
	}

}

class Tv_1046 {
	boolean power;
	
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public Tv_1046() {
		power = false;
	};
	
}

class RemoteCon_1046 {
	Tv_1046 tv;
	
	public Tv_1046 getTv() {
		return tv;
	}
	public void setTv(Tv_1046 tv) {
		this.tv = tv;
	}
	public RemoteCon_1046() {
		tv = new Tv_1046();
	}
	public boolean powerOn() {
		tv.setPower(true);
		return true;
	}
}
