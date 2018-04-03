package com.gsitm.java.ex10;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Human_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 4. 3. 
* @작성자				: 최규호
* @프로그램 설명		: 
*/
public class Human_1074 implements Shoes_1074, Dress_1074{
	@Override
	public void TearDress() {
		System.out.println("옷 찢음");
	}

	@Override
	public void ThrowShoes() {
		System.out.println("신발 던짐");
	}
	
	public static void main(String[] args) {
		Shoes_1074 shoes = new Human_1074();
		Human_1074 human = new Human_1074();
		shoes.PutOnShoes();
		Dress_1074.PutOnDress();
		System.out.println("신발 사이즈: " + Shoes_1074.SIZE);
		System.out.println("옷 사이즈: " + Dress_1074.SIZE);
		human.TearDress();
		human.ThrowShoes();
	}

}
