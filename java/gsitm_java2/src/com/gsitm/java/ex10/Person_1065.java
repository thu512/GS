package com.gsitm.java.ex10;

/**
 *    @과목명 : GS ITM 인턴사원 자바교육  @FileName         : Person_1065.java 
 *  @Project          : gsitm_java2   @Date           : 2018. 4. 3. 
 *  @작성자            : 정광수  @프로그램 설명       : interFace 연습
 * 
 * @description 인터페이스 신발, 옷을 선언하고 사람은 신발과 옷 인터페이스를 구현한다 (다중상속) - 신발 인터페이스 1.상수
 *              사이즈 260 가짐 2.디폴트 메소드 신발 신다 구현 3.추상메소드인 신발을 던지다를 구현한다. - 옷 인터페이스
 *              1.Static 메소드인 옷입다를 구현한다. 2.추상메소드인 옷을 찢다를 구현한다.
 * 
 *              - 사람클래스 1. 메인메소드 가지고 있음 2. 구현한 인터페이스와 모든 메소드를 구현하고 신발과 옷의 사이즈를
 *              출력하며 모든 메소드를 실행한다.
 */
public class Person_1065 implements Cloth_1065, Shoes_1065 {

	// 신발 interFace 신발 던지기 재정의
	@Override
	public void shoesThrow() {
		System.out.println(this.SHOES_SIZE + "신발을 던졌습니다..");
	}

	// 드레스 interface 옷 찢기 구현
	@Override
	public void dressTear() {
		System.out.println(this.CLOTH_SIZE+"옷을 찢었습니다.");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// 1.객체생성
		Person_1065 person = Person_1065.class.newInstance();

		//신발 신기
		person.wearShoes();
		//신발 던지기
		person.shoesThrow();

		//옷입기
		Cloth_1065.dressUp();
		//옷찢기
		person.dressTear();

	}
}
