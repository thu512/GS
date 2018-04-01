package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 강혜정
* @프로그램 설명           : Tv_1028클래스와 RemoteCon_128클래스를 호출할 클래스, main()메소드 
*/
public class Human_1028 {
	public static void main(String[] args) {
		
		RemoteCon_1028 remote=new RemoteCon_1028();
		System.out.println("Human 클래스 : 전원누름");
		remote.powerOn();

		
	}

}
