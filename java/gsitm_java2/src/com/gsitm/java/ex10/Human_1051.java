package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Human_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 위재원
 * @프로그램 설명      		: 휴먼 클래스 메인 입니다.
 */
public class Human_1051 implements Shoes_1051, Clothes_1051{

	public static void main(String[] args) {
		Human_1051 human = new Human_1051();
		
		System.out.println(human.SIZE_CLOTHES);
		System.out.println(human.SIZE_SHOES);
		human.shoesThrow();
		human.shoesWear();
		human.clothesTear();
		Clothes_1051.clothesWear();
	}

	@Override
	public void clothesTear() {
		System.out.println("옷을 찢다!!!");
	}

	@Override
	public void shoesThrow() {
		System.out.println("신발을 던지다 !!!!");
	}

}
