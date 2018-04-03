package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박보미
* @프로그램 설명           : 인터페이스 구현 
*/
public class Human_1052 implements Shoes_1052, Clothes_1052 {

	@Override
	public void tearClothes() {
		System.out.println("옷을 찢습니다.");
	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던집니다.");
	}
	
	@Override
	public String toString() {
		return "신발 사이즈 : " + Shoes_1052.SIZE + ", 옷 사이즈 : " + Clothes_1052.SIZE;
	}

	
	public static void main(String[] args) {
		Human_1052 human = new Human_1052();

		System.out.println(human.toString()); // 신발과 옷의 사이즈 출력 

		Clothes_1052.wearClothes(); // 정적 메소드
		human.wearShoes();
		human.tearClothes();
		human.throwShoes();
	}


}