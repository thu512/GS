package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 고하윤
* @프로그램 설명           : 리모콘 전원을 키는 메소드 호출 (메인)
*/
public class Human_1029 {

	public static void main(String[] args) {
		RemoteCon_1029 remote = new RemoteCon_1029();
		
		System.out.println("TV의 전원이 켜져있나요? : " + remote.turnOn());	
	}
}
