package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ChildCat_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 강혜정
* @프로그램 설명           : 상속 실습 예제
*/ 
public class ChildCat_1028 extends Cat_1028{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
			super.cry();
			System.out.println("음메");
	}
	
	public ChildCat_1028() {
		
	}
	
	public static void main(String[] args) {
		ChildCat_1028 child = new ChildCat_1028();
		child.cry();
	}

}
