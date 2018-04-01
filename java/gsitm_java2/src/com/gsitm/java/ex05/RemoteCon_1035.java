package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class RemoteCon_1035 {
	public boolean turnOn() {
		Tv_1035.power = true;
		System.out.println("전원이 켜졌습니다.");
		System.out.println("Tv 상태 : " + Tv_1035.power);
		return true;
	}
}
