package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 유희수
* @프로그램 설명           : 외부 클래스 menu에서 loginuser의 이름, 사번,권한을 얻어낼 수 있도록 합니다.
*/
public class Menu_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginUser_1063 obj1 = LoginUser_1063.getInstance();
		System.out.println(obj1.getName());
		System.out.println(obj1.getNum());
		System.out.println(obj1.isRight());
	}
 }
