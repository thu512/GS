package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 강혜정
* @프로그램 설명           : 인터페이스 실습
*/
public class Person_1028 implements Shoes_1028, Clothes_1028 {
	
	//추상 클래스들 구현 
	public void tearClothes() {
		System.out.println("사람 클래스 : 옷을 찢다 구현");
	}
	public void throwShoes() {
		System.out.println("사람클래스 : 신발을 던지다 ");
	}

	
	public static void main(String[] args) {
		Shoes_1028 shoes = new Person_1028();
		Clothes_1028 clothes = new Person_1028();
		
		shoes.putOn();
		shoes.throwShoes();
		
		clothes.tearClothes();
		Clothes_1028.wearClothes();
	}
}

