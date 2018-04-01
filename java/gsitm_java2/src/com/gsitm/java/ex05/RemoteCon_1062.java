package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : RemoteCon_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 장동주
 * @프로그램 설명      : 리모콘으로 전원을 조절하는 클래스입니다.
 */
public class RemoteCon_1062 {
	public boolean On(boolean power) {
		if(power==false) {
			String result;
			if(power==false) {
				result="Off";
			}else {
				result="On";
			}
			System.out.println("현재 TV의 전원상태는 "+result+"입니다.");
			power=true;
		}
		System.out.println("on method를 사용하여 TV의 전원을 On으로 바꿨습니다.");
		return power; 
	}
}
