package com.gsitm.java.ex07;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : LoginUser의 이름, 사번, 권한을 얻어낼 수 있도록 하는 클래스.
*/
public class Menu_1077 {
	public static void main(String[] args) {
		LoginUser_1077 obj1 = LoginUser_1077.getInstance();
		LoginUser_1077 obj2 = LoginUser_1077.getInstance();
		
		System.out.println("사번 : " + obj1.get사번());
		System.out.println("이름 : " + obj1.get이름());
		System.out.println("권한 : " + obj1.get권한());
		
		//obj1 과 obj2 Singleton 객체 비교
		System.out.println(obj1 == obj2);
		
		obj2.set사번("IT 1078");
		obj2.set이름("홍길동");
		obj2.set권한("일반");
		System.out.println("사번 : " + obj2.get사번());
		System.out.println("이름 : " + obj2.get이름());
		System.out.println("권한 : " + obj2.get권한());
		
	}//main
}//class
