package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 남동길
* @프로그램 설명           : 인간클래스
*/
public class Human_1039 implements Dress_1039, Shoes_1039 {
	
	public static void main(String[] args) {
		Human_1039 human = new Human_1039();
		Dress_1039.wearDress();
		human.tearDress();
		human.wearShoes();
		human.throwShoes();
		
	}

	@Override
	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발 던지기");
	}

	@Override
	public void tearDress() {
		// TODO Auto-generated method stub
		System.out.println("옷 찢기");
	}

}
