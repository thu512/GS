package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 정진
* @프로그램 설명           : 인터페이스 구현 클래스
*/
public class Person_1066 implements Clothes_1066, Shoes_1066 {

	@Override
	public void cast() {
		System.out.println("신발을 던지다");
	}

	@Override
	public void tear() {
		System.out.println("옷을 찢다.");
	}

	public static void main(String[] args) {
		System.out.println("옷 사이즈 : " + Clothes_1066.sizeOfClothes);
		System.out.println("신발 사이즈 : " + Shoes_1066.sizeOfShoes);

		Person_1066 person_1066 = new Person_1066();
		person_1066.cast();
		person_1066.tear();
		person_1066.putOnShoes();
		Clothes_1066.putOnClothes();
	}

}
