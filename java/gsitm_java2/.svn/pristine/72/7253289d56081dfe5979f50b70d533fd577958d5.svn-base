package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 은종현
* @프로그램 설명           : 인터페이스 실습 (Person 클래스)
*/
public class Person_1053 implements Clothes_1053, Shoes_1053 {

	@Override
	public void tear() {
		System.out.println("옷을 찢다");
	}

	@Override
	public void throwUp() {
		System.out.println("신발을 던지다");
	}

	@Override
	public void shoesPutOn() {
		Shoes_1053.super.shoesPutOn();
	}

	public static void main(String[] args) {
		Person_1053 person = new Person_1053();

		person.tear();
		Clothes_1053.clothesPutOn();
		person.shoesPutOn();
		person.throwUp();
		System.out.println(person.shoeSize);
		System.out.println(person.clothSize);
	}

}
