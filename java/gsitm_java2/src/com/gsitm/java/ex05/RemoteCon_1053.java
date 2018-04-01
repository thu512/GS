package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 은종현
* @프로그램 설명           : 리모컨 클래스
*/
public class RemoteCon_1053 {
	public boolean turnTv(Tv_1053 state) {
		boolean tvState = state.getIsOn();

		if (tvState) {
			System.out.println("켰습니다.");
		} else {
			System.out.println("껏습니다.");
		}
		return tvState;
	}
}

