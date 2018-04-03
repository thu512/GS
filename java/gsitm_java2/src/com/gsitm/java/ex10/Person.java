package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 조국
* @프로그램 설명           : 다중 인터페이스를 구현한 메인 클래스 Person
*/
public class Person implements Shoes_1067, Garments_1067{
	@Override
	public void ripGarments() {
		System.out.println("Abstract Method: 사이즈 " + Garments_1067.GARMENTS_SIZE + "인 옷을 찢다~");
	}

	@Override
	public void throwsShoes() {
		System.out.println("Abstract Method: 신발 사이즈 " + Shoes_1067.SHOES_SIZE +"인 신발을 던지다~");
	}

	public static void main(String[] args) {
		Person person = new Person();
		
		person.throwsShoes();
		person.ripGarments();
		person.wearShoes();
		Garments_1067.wearGarments();
	}
}
