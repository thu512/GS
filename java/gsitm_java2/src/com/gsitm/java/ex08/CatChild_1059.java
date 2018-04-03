package com.gsitm.java.ex08;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : CatChild_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자              : 이종건
* @프로그램 설명       : 상속 예제, 새끼고양이
*/
public class CatChild_1059 extends CatParent_1059{
	
	public CatChild_1059() {}
	
	@Override
	public void cry() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		CatParent_1059 catParent = new CatParent_1059();
		catParent.cry();
		
		CatChild_1059 catChild = new CatChild_1059();
		catChild.cry();
	}
}
