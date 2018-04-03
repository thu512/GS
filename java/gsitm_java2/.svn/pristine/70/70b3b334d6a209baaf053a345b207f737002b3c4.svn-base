package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 이경화
* @프로그램 설명           : 사람클래스
*/
public class Person_1055 implements Shoes_1055, Clothes_1055 {

	public static void main(String[] args) {
		Person_1055 person = new Person_1055();
		person.wearshoes();
		Clothes_1055.wearClothes();
		System.out.println(person.shoesize);
		System.out.println(person.clothsize);	
		person.tearClothes();
		person.throwShoes();
	}

	@Override
	public void tearClothes() {
		System.out.println("옷을 찢다");
		
	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던지다");
		
	}

}
