package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 채유진
* @프로그램 설명           : tv전원 실습 remoteCon
*/
public class RemoteCon_1073 {
	
	public boolean powerOnOff(Tv_1073 tv) {
		if(tv.power) {
			tv.power = false;
		}else {
			tv.power = true;
		}
		return tv.power;
	}
}
