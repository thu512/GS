package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Zoo_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 백기반
* @프로그램 설명           : 사육사 클래스 
*/
public class Zoo_1043 {
	
	public static void main(String[] args) {
	
		System.out.println(Lion_1043.Eat);
		System.out.println(Tiger_1043.Eat);
		
		if(Lion_1043.Eat == false){ 
			Lion_1043.Eat = true;
			System.out.println(Lion_1043.Eat);
			System.out.println("밥을 주었습니다.");
		}
		
		if(Tiger_1043.Eat == false){
			Tiger_1043.Eat = true;
			System.out.println(Tiger_1043.Eat);
			System.out.println("밥을 주었습니다.");
		}
		
		
		
	}

}
