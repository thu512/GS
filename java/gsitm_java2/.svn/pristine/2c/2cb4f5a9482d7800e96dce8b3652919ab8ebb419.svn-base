package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Kitten_1067.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 조국
* @프로그램 설명           : 새끼고양이 클래스
*/
public class Kitten_1067 extends Cat_1067{
	public Kitten_1067() {}
	
	@Override
	public void cry() {
		System.out.println("부모고양이의 cry() 호출");
		super.cry();
		System.out.println("새끼고양이의 cry() 호출");
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		Cat_1067 taekCat = new Kitten_1067();
		
		System.out.println("새끼고양이의 팔: " + taekCat.arm);
		System.out.println("새끼고양이의 다리: " + taekCat.leg);
		System.out.println("새끼고양이의 어깨: " + taekCat.shoulder + "\n");
		
		taekCat.cry();
	}
}
