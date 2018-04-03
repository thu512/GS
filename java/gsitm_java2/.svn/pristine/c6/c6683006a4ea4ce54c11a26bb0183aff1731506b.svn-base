package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김진우
* @프로그램 설명           : Person
*/
public class Person_1037 implements Cloth_1037, Shoes_1037 {

	public void tearCloth() {
		System.out.println("옷을 찢다!!");
	}

	public void throwShoes() {
		System.out.println("신발을 던지다!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person_1037 person = new Person_1037();
		
		System.out.println("옷 사이즈 : " + Cloth_1037.CLOTH_SIZE);
		System.out.println("신발 사이즈 : " + Shoes_1037.SHOES_SIZE);
		
		person.putOnShoes();
		Cloth_1037.putOnCloth();
		person.tearCloth();
		person.throwShoes();

	}

}
