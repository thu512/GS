package com.gsitm.java.ex10;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Person_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자              : 이종건
* @프로그램 설명       : 다중 인터페이스 구현 클래스 실습
*/
public class Person_1059 implements Shoes_1059, Dress_1059 {

	@Override
	public void tearDress() {
		System.out.println("옷을 찢다");
	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던진다");
	}

	public static void main(String[] args) {
		
		System.out.println("신발사이즈 : " + Shoes_1059.SHOES_SIZE);
		System.out.println("옷사이즈 : " + Dress_1059.DRESS_SIZE);
		
		// person 객체 생성.
		Person_1059 person = new Person_1059();
		
		person.tearDress();
		
		// static 메소드 실행
		Dress_1059.takeDress();
		
		person.throwShoes();
		
		// default 메소드 실행
		person.takeShoes();
		
		
		
	}
}
