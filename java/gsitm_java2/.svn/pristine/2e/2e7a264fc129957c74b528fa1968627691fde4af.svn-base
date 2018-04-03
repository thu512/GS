/**
 * 
 */
package com.gsitm.java.ex10;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Human_1044.java
* @Project			: gsitm_java2
* @Date				: 2018. 4. 3. 
* @작성자				: 성동원
* @프로그램 설명		: 옷과 신발 클래스를 구현한 인간 클래스
*/
public class Human_1044 implements Clothes_1044,Shoes_1044{
	
	public static void main(String[] args) {
		Clothes_1044 clothes = new Human_1044();
		System.out.println("옷 사이즈는 : "+clothes.size+"입니다");
		Clothes_1044.tryClothes();
		clothes.tear();
		
		Shoes_1044 shoes = new Human_1044();
		System.out.println("신발 사이즈는 : "+shoes.size+"입니다");
		shoes.wear();
		shoes.throwShoes();
	}


	@Override
	public void throwShoes() {
		System.out.println("신발을 던지다");
		
	}

	@Override
	public void tear() {
		System.out.println("옷을 찢다.");
		
	}
}
