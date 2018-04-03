package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김준혁
* @프로그램 설명         : 신발과 옷의 인터페이스를 구현하는 사람 클래스
*/
public class Person_1036 implements Shoe_1036, Clothes_1036{

	@Override
	public void tear() {
		System.out.println("옷을 찢었습니다.");
	}
	@Override
	public void throwShoes() {
		System.out.println("신발을 던졌습니다.");
	}
	
	public static void main(String[] args) {
		Person_1036 person = new Person_1036();
		System.out.println("신발 사이즈 : " + shoeSize);
		System.out.println("옷 사이즈 : " + clothSize);
		person.putOnShoes();
		person.throwShoes();
		Clothes_1036.dress();
		person.tear();
	}
}
