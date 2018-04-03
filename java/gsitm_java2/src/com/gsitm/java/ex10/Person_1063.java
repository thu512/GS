package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 유희수
* @프로그램 설명           : 신발과 옷을 입는 인터페이스를 구현하는 클래스를 만들었습니다.
*/
public class Person_1063 implements Shoes_1063, Clothes_1063{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shoeSize);
		System.out.println(clotheSize);
		
		Person_1063 person = new Person_1063();
		person.setShoes();
		person.throwShoes();
		
		Clothes_1063.setClothes();
		person.tearClothes();
		
	}

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던지다.");
	}

	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢다.");
	}

}
