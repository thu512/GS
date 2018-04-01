package com.gsitm.practice.ex01;
//public > protected < default(선언 안한것) < private

/**
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1075.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 최영롱
* @프로그램 설명                          : 
*/
public class ExClass_1075{
	//객체들을 이렇게 만들어낸다.+엑스박스(패키지 선언안되있다는..
	//-> Add package 또는 default Package)
	// Default Package -> src 바로 아래 생김
	// com.gsitm.practice.ex01; 로 Add package
	// 도메인 형태를 거꾸로 뒤집은것이 패키지 명이다!
	// Low 레벨로 갈 때는, 기능단위로 패키징하기도 한다.
	// public : 제한 없다.
	// private : 클래스에서는 선언이 안되고, 
	
	//기본
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//오양이를 출력하겠음
		/* 
		 * 오양이를
		 * 출력하겠
		 * 음*/
		System.out.println("오양이");
		
		
		int firstName; // camel 케이스
		int first_name;// snake 케이스
		int iFirstName; //헝가리안 케이스
		
		int i=0; //프리머티브(primitive) 타입
		
		double dd=1.1; //기본형
		Double doubl = new Double(1.1); //Wrapper 클래스 ---> (1)
		/*기본형타입으로 바꿀수 있는게 없었지만,
		 * 래퍼클래스로는 값을 변환시킬 수 있다. */
		
		String var = "10";
		int var2 = Integer.parseInt(var);
		System.out.println(var2);
		
		//Boxing || unBoxing ?
		//전자 = 기본형 타입을 래퍼클래스로 변환한 것! ==> (1) 이 Boxing이다 !
		//후자 = 래퍼클래스를 
		double doubl2 = doubl.doubleValue(); //unBoxing
		

		
		//auto Boxing || unBoxing ?
		double doubl3 = doubl;
//		Integer in=10; //Auto Boxing
//		int i1 = in; //Auto Unboxing
		Object o1 = 10; //Auto Boxing
		
		//charExample로 이동 ! Ctrl+shift+[r] - charExample.java 열어서 ㄱ ㄱ
		
		int n1 = 10;
		System.out.println(n1);
		
		float f1 = 10.5f;
		System.out.println(f1);
		
		long l1 = 100000000000L;
		
		byte b1 = 10;
		byte b2 = 20;
		//타입 확인법쓰 !!
		Object obj = b1 + b2;//숫자연산의 기본형이int다.
		System.out.println(obj.getClass());
	}
}
