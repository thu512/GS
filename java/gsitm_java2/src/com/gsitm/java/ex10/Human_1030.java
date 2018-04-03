package com.gsitm.java.ex10;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: Human_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 3. 
* @작성자                	: 김동범
* @프로그램 설명			: human 클래스. 두 개의 인터페이스의 구현 클래스. main 메소드에서 모든 메소드 실행
*/
public class Human_1030 implements Shoes_1030, Clothes_1030 {
	@Override
	public void throwShoe() {
		System.out.println("신발 던저버려");
	}
	@Override
	public void tearCloth() {
		System.out.println("옷 찢는다.");
	}
	
	public static void main(String[] args) {
		Human_1030 h = new Human_1030();
		h.wearShoe();
		Clothes_1030.wearCloth();
		h.tearCloth();
		h.throwShoe();
		System.out.println("신발 사이즈 : "+SHOE_SIZE);
		System.out.println("옷 사이즈 : "+CLOTHES_SIZE);
	}
}
