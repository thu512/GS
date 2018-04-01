package com.gsitm.java.ex05;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1040.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 노종범
* @프로그램 설명           : 리모콘 클래스의 리모콘 메소드
*/
public class RemoteCon_1040 {
	
	Scanner scanner = new Scanner(System.in);	
	
	Tv_1040 control1 = new Tv_1040();
	
	int controller;
	
	public RemoteCon_1040() {
		System.out.println("TV의 상태를 입력하세요. [1: On / 2: Off]");
		controller= scanner.nextInt();	
		System.out.println("리모콘을 사용하여");
	}
	
	boolean tvControl() {
		if(controller==1) {
			System.out.println("TV를 끕니다.");
			control1.onOff=false;
		}else if(controller==2){
			System.out.println("TV를 킵니다.");
			control1.onOff=true;			
		}else {
			System.out.println("이상한 버튼 누르지 마세요.");
		}
		return control1.onOff;
		
	}

	
	
}
