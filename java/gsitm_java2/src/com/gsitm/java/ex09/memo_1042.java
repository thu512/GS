package com.gsitm.java.ex09;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : memo_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박소현
* @프로그램 설명           : 부모 클래스(memo)
*/
public abstract class memo_1042 {
	
	String content = null;

	public void write() { 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("내용을 입력해주세요 : ");
		content = scanner.nextLine();
		
		scanner.close();
	}
	
	public void read() {
		System.out.print("입력한 내용 : ");
		System.out.println(content);
	}
	
	public abstract void addOns();
}
