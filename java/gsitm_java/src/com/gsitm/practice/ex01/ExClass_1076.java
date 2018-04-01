package com.gsitm.practice.ex01;

/*
default 패키지: 다른 아이들이 import하거나 사용할 수 없는 패키지(다른 아이들이 쓸수가 없기 때문에 거의 사용x)
pms.gsitm.com
도메인을 거꾸로 뒤집은 것이 패키지 명이다.

public : 막 갖다 써도됌
private : 나 혼자 쓸거야
default : 
public > protected(다른 패키지에서 상속은 허용하겠다) > default(선언 안한 것)(같은 패키지에서만 상속을 허용하겠다) < private(나혼자 쓰겠다)
*/


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1076.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 최준우
* @프로그램 설명           :  
*/
class ExClass_1076 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//고양이라는 문자열을 출력하는 메서드입니다.
		
		/*
		System.out.println("고양이");
		System.out.println("강아지");
		*/
		
		//Wrapper타입   참조타입
		
		int i = 0;
		
		double dd = 1.1;  // 기본형
		
		//Double db = new Double(1.1); //Wrapper 클래스
		//db.isNaN();
		//db.intValue();
		
		String var = "10";
		int var2 = Integer.parseInt(var);
		
		//Boxing //unBoxing
		//1) Boxing : 기본형 타입을 Wrapper클래스로 담은 것
		Double db = new Double(1.1);
		//2) unBoxing : 기본형 타입을 Wrapper클래스로 담은 것
		double ddd = db.doubleValue();
		//auto unboxing
		double dddd = db;
		
		//AutoBoxing
		/*Integer in = 10;
		int li = in;
		Object o = 10;*/
		
	}	
}

class Integer {
	int i = 0;
	//원시타입을 감싸고 있는 클래스 -> Wrapper 클래스

	public static int parseInt(String var) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//i.  이렇게 하면 활용할 수 있는 방안이 없음
}