package com.gsitm.java.ex08;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : ChildCat_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 어미고양이 클래스에서 상속받은 새끼고양이 클래스.
*						 울다 메소드가 있다.
*/
public class ChildCat_1077 extends ParentCat_1077 {
	
	@Override
	public void howl() {
		System.out.println("음~메");
	}//howl
	
	public static void main(String[] args) {
		ChildCat_1077 child = new ChildCat_1077();
		child.howl();
	}//main
}//class
