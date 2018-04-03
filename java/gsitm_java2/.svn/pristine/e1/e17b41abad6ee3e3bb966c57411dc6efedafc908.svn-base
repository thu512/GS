package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Man_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 채유진
* @프로그램 설명           : 다중인터페이스 실습 
*/
public class Man_1073 implements Shoes_1073, Clothes_1073 {
	public void shoesThrow() {
		System.out.println("신발을 던지다");
	}
	public void clothesTear() {
		System.out.println("옷을 찢다");
	}
	
	public static void main(String[] args) {
		Man_1073 man = new Man_1073();
		
		System.out.println("신발사이즈 : " + Shoes_1073.size);
		System.out.println("옷사이즈 : " + Clothes_1073.size);
		
		Clothes_1073.clothesWear();
		man.shoesWear();
		
		man.clothesTear();
		man.shoesThrow();
	}
}
