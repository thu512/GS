package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손혜성
* @프로그램 설명           : 인터페이스의 다중상속(사람)
*/
public class Human_1046 implements Shoes_1046, Clothes_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_1046 person = new Human_1046();
		System.out.println("신발 사이즈 : " + Shoes_1046.size);
		System.out.println("옷 사이즈 : " + Clothes_1046.size);
		
		person.wearShoes();
		person.throwShoes();
		Clothes_1046.wearClothes();
		person.tear();
		
	}

	@Override
	public void tear() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢다.");
	}

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던지다.");
	}

}
