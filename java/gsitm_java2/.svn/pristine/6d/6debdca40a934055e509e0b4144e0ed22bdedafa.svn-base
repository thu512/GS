package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 고하윤
* @프로그램 설명           : 사람 클래스 - 옷, 신발 인터페이스를 구현
*/
public class Person_1029 implements Shoes_1029, Clothes_1029{

	//추상 메소드 구현
	@Override
	public void tearClothes() {
		System.out.println("옷을 찢습니다.");
	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던집니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_1029 person = new Person_1029();
		
		//신발과 옷 사이즈 출력
		System.out.println("신발 사이즈  : " + Shoes_1029.SIZE);
		System.out.println("옷 사이즈  : " + Clothes_1029.SIZE);
		
		//모든 메소드 실행
		person.putOnShoes();
		person.throwShoes();
		
		Clothes_1029.putOnClothes();
		person.tearClothes();
		
	}

}
