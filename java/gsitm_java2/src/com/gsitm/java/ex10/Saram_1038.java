package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Saram_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex10
* @Date                : 2018. 4. 3. 오후 3:39:53
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*인터페이스 신발, 옷을 선언하고 사람은 신발과 옷 인터페이스를 구현한다.(다중상속)

- 신발 인터페이스는 상수 사이즈=260을 갖고,
디폴트 메소드인 신다를 구현한다.
추상메소드인 신발은 던진다를 구현한다.

- 옷 인터페이스는 상수 사이즈 XL을 갖고,
스태틱 메소드인 옷입다를 구현한다.
추상메소드인 옷을 찢다를 구현한다.

- 사람클래스는 메인메소드를 갖고, 구현한 인터페이스의 모든 메소드를 구현하고, 
신발과 옷의 사이즈를 출력하며, 모든 메소드를 실행한다.
*/
public class Saram_1038 implements Shoes_1038, Cloth_1038 {
	public static void main(String[] args) {
		System.out.println("신발 사이즈" + shoesSize);
		System.out.println("옷 사이즈" + clothSize);
		Saram_1038 saram = new Saram_1038();

		saram.takeShoesOn(true);
		saram.takeShoesOn(false);
		saram.throwShoes();
		
		Cloth_1038.takeClothOn(true);
		Cloth_1038.takeClothOn(false);
		Cloth_1038.takeClothOn(true);
		saram.tearCloth();
	}

	@Override
	public void tearCloth() {
		System.out.println("옷을 찢습니다.");
	}

	@Override
	public void throwShoes() {
		System.out.println("신발을 던집니다.");
	}
}
