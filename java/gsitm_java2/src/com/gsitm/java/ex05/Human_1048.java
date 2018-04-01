package com.gsitm.java.ex05;

/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Human_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 3. 30. 
* @작성자			    : 신종욱
* @프로그램 설명       : 리모컨으로 tv켜기
*/
public class Human_1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv_1048 tv = new Tv_1048();
		RemoteCon_1048 r = new RemoteCon_1048(tv.power);
	}
}

class Tv_1048 {
	boolean power;
	Tv_1048(){
		power = false;
	}
}

class RemoteCon_1048 {
	RemoteCon_1048(boolean tvPower) {
		tvPower = !tvPower;
		if(tvPower) {
			System.out.println("전원 켜짐");
		}else {
			System.out.println("전원 꺼짐");
		}
	}
}
