package com.gsitm.java.ex05;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : Human_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 장동주
 * @프로그램 설명      :  실행 클래스입니다.
 */
public class Human_1062 {
	public static void main(String[] args) {
		RemoteCon_1062 remoteCon_1062= new RemoteCon_1062();
		Tv_1062 tv_1062= new Tv_1062();
		boolean power=remoteCon_1062.On(tv_1062.power);
		if(power==true) {
			System.out.println("현재 Tv의 전원상태는 on 입니다.");
		}else {
			System.out.println("현재 Tv의 전원상태는 off 입니다.");
		}
	}

}
