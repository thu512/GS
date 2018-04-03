package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 임혜성
* @프로그램 설명           : 사람 클래스는 메인메소드를 갖고, 구현한 인터페이스의 모든 메소드를 구현한다.
						   신발과 옷의 사이즈를 출력하며, 모든 메소드를 실행한다.
*/
public class Human_1061 implements Clothes_1061, Shoes_1061{

	@Override
	public void throwShoes() {
		System.out.println("신발을 던진다");
	}
	@Override
	public void tearClothes() {
		System.out.println("옷을 찢는다");
	}

	public static void main(String[] args) {
		Human_1061 human = new Human_1061();
		System.out.println("신발 사이즈 : " + human.SHOES_SIZE);
		human.putOnShoes();
		human.throwShoes();
		System.out.println("옷 사이즈 : " + human.CLOTHES_SIZE);
		human.wearClothes();
		human.tearClothes();
	}
}
