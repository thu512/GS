package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 주형진
* @프로그램 설명           : 다중 인터페이스 구현 Person_1070 클래스
*/

public class Person_1070 implements Clothes_1070, Shoes_1070{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes_1070 clothes = new Person_1070();
		Shoes_1070 shoes = new Person_1070();
		System.out.println("옷 사이즈 : " + clothes.SIZE);
		System.out.println("신발 사이즈 : " + shoes.SIZE);
		clothes.tearClothes();
		Clothes_1070.wearClothes();
		shoes.throwShoes();
		shoes.wearShoes();
	}

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던져요.");
	}

	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢어요.");
	}

}