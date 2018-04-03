package com.gsitm.java.ex10;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Person.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 조은솔
 * @프로그램 설명            : 인터페이스 예제
 */
public class Person_1068 implements Shoe_1068, Cloth_1068 {

	@Override
	public void tearCloth() {
		System.out.println("옷을 찢다.");
	}

	@Override
	public void throwShoe() {
		System.out.println("신발을 던지다.");
	}
	
	
	public static void main(String[] args) {
		
		Cloth_1068 cloth = new Person_1068();
		
		cloth.tearCloth();
		Cloth_1068.putOnCloth();
		
		Shoe_1068 shoe = new Person_1068();
		shoe.throwShoe();		
		shoe.putOnShoe();
		
	}



}
