package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 장진영
* @프로그램 설명           : 사람클래스를 구현하여 인터페이스의 추상메소드 구현, 메인 구현
*/
public class Person_1064 implements Shoes_1064, Clothes_1064{
	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("사람이 옷을 찢다.");
		
	}

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("사람이 신발을 던지다.");
		
	}

	public static void main(String[] args) {
		Person_1064 person = new Person_1064();
		System.out.println("신발 사이즈 : " + person.SHOES_SIZE);
		System.out.println("옷 사이즈 : " + person.CLOTHES_SIZE);
		person.throwShoes();
		person.wearShoes();
		person.tearClothes();
		Clothes_1064.wearClothes();
	}
	
}
