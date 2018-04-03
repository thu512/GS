package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손원락
* @프로그램 설명           : 신발, 옷 인터페이스를 구현 후 모든 메소드와 필드를 출력하는 클래스
*/
public class Human_1045 implements Shoes_1045, Clothes_1045 {

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던집니다.");
	}

	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢습니다.");
		
	}
	
	public static void main(String[] args) {
		
		Human_1045 person = new Human_1045();
		person.wearShoes();   //디폴트
		person.throwShoes(); //추상
		Clothes_1045.wearClothes(); //스태틱
		person.tearClothes();   //추상
		System.out.println(Shoes_1045.size);
		System.out.println(Clothes_1045.size);
	}

}
