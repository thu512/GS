/**
 * 
 */
package com.gsitm.java.ex10;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Human_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 조현우
* @프로그램 설명			: 신발, 옷 인터페이스 다중상속 실습
*/
public class Human_1069 implements Clothes_1069, Shoes_1069{

	public static void main(String[] args) {
		Human_1069 hm = new Human_1069();
		
		hm.scatterCloth();
		hm.putShoes();
		hm.throwShoes();
		Clothes_1069.putClothes();
		System.out.println(hm.clothesSize);
		System.out.println(hm.shoesSize);

	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던진다.");
		
	}

	@Override
	public void scatterCloth() {
		System.out.println("옷을 찢다.");
		
	}
}
