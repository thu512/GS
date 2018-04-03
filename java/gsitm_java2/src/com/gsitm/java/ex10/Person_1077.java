package com.gsitm.java.ex10;

public class Person_1077 implements Shoes_1077, Clothes_1077 {
	
	@Override
	public void tearClothes() {
		System.out.println("사람이 옷을 찢다.");
	}//옷을 찢다 오버라이드 추상 메소드

	@Override
	public void throwShoes() {
		System.out.println("사람이 신발을 던지다.");
	}//신발을 던지다 오버라이드 추상 메소드
	
	@Override
	public void wearShoes() {
		Shoes_1077.super.wearShoes();
	}//신발을 신다의 디폴트 메소드

	public void wearClothes() {
		System.out.println("사람이 옷을 입다.");
	}//정적메소드이기 때문에 구현 불가.
	
	public static void main(String[] args) {
		Person_1077 person = new Person_1077();
		person.tearClothes();		// 재정의한 추상 메소드 호출
		person.throwShoes();		// 재정의한 추상 메소드 호출
		person.wearShoes();			// 오버라이드 된 디폴트 메소드 호출
		person.wearClothes();		// 정적 메소드와 이름이 같게 임의로 정의한 메소드 호출
		Clothes_1077.wearClothes();	// 정적 메소드이기 때문에 바로 호출 가능.
	}//main

	

	
}//class
