package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Intern_1076.java 
* @Project             : TV켜기
* @Date                : 2018. 3. 30. 
* @작성자                : 최준우
* @프로그램 설명           : TV 만들기
*/
public class Intern_1076 { // 디폴트 생성자
	
	boolean flag = false;
	
	void Human_1076(){  //메서드 생성1
		RemoteCon_1076();
		Tv_1076();
	}
	
	boolean Tv_1076() {  //메서드 생성2
		flag = true;
		return flag;
	}
	
	boolean RemoteCon_1076() {  //메서드 생성3
		System.out.println("전원을 키다");
		flag = true;
		return flag;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern_1076 in = new Intern_1076(); // 객체 생성
		in.Human_1076(); //호출
		
	}

}