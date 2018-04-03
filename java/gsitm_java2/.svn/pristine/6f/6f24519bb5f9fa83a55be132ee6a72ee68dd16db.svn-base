package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 최준우
* @프로그램 설명           : 구현하는 사람 클래스 
*/
public class Human_1076 implements Shoes_1076, Clothes_1076 {
	
	@Override
	public void Tearing() { // 추상메소드 구현
		// TODO Auto-generated method stub
		System.out.println("옷을 찢다");
		
	}

	@Override
	public void Throwing() { // 추상메소드 구현
		// TODO Auto-generated method stub
		System.out.println("신발을 던진다");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_1076 human = new Human_1076();
		
		System.out.println("신발 사이즈는(상수) :: "+Shoes_1076.SHOES_SIZE);
		System.out.println("옷 사이즈는(상수) :: "+Clothes_1076.CLOTHES_SIZE);
		Clothes_1076.wearClothes();
		human.wearShoes();
		human.Tearing();
		human.Throwing();
	}

}
