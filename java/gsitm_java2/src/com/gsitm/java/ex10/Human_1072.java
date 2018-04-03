package com.gsitm.java.ex10;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Human_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 4. 3.
 * @작성자			: 차주현
 * @프로그램 설명	: 인터페이스 Shoes_1072와 Cloth_1072를 구현하고, 메소드와 상수를 출력한다.
 */
public class Human_1072 implements Shoes_1072, Cloth_1072 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Human_1072 human = new Human_1072();
		System.out.println("========== 디폴트 메소드 ==========");
		human.buy();
		System.out.println("========== 스태틱 메소드 ==========");
		Cloth_1072.wear();
		System.out.println("========== 오버라이드 메소드 ==========");
		human.shoesThrow();
		human.tear();
		System.out.println("========== Human 클래스 메소드 ==========");
		human.printShoesSize();
		human.printClothSize();
	}
	public void printShoesSize() {
		System.out.println("신발의 사이즈는 " + SHOES_SIZE + "입니다.");
	}
	public void printClothSize() {
		System.out.println("옷의 사이즈는 " + CLOTH_SIZE + "입니다.");
	}
	/* (non-Javadoc)
	 * @see com.gsitm.java.ex09.Shoes_1072#shoesThrow()
	 */
	@Override
	public void shoesThrow() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던집니다.");
	}

	/* (non-Javadoc)
	 * @see com.gsitm.java.ex09.Cloth_1072#tear()
	 */
	@Override
	public void tear() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢습니다.");
	}
}
