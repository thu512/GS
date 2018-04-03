package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Human_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 신발과 옷 인터페이스를 구현하는 구현클래스.
 */
public class Human_1033 implements Shoes_1033, Clothes_1033 {
	
	public void throwTheShoes() {
		System.out.println("신발 던짐");
	}
	
	public void tearTheClothes() {
		System.out.println("옷 찢음");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_1033 me = new Human_1033();
		System.out.println("신발 사이즈는 " + me.SHOES_SIZE);
		System.out.println("옷 사이즈는 " + me.CLOTHES_SIZE);
		me.putOnTheShoes();
		me.throwTheShoes();
		Clothes_1033.putOnTheClothes();
		me.tearTheClothes();
	}

}
