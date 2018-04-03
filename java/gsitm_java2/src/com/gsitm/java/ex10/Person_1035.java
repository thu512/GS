package com.gsitm.java.ex10;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김주승
* @프로그램 설명           : 사람 클래스 정의
*/
public class Person_1035 implements Cloth_1035, Shoes_1035 {

	//Shoes 인터페이스의  throwShoes 추상메서드를 구현한 실체메서드
	@Override
	public void throwShoes() {
		System.out.println("신발을 던집니다!!");
	}

	//Cloth 인터페이스에 breakCloth 추상메서드를 구현한 실체메서드
	@Override
	public void breakCloth() {
		System.out.println("옷을 찢습니다!!");
	}

	public static void main(String[] args) {
		//Shoes인터페이스에 구현객체 person을 대입하여 메소드실행 및 상수 출력
		Shoes_1035 shoes = new Person_1035();
		shoes.equipShoes();
		shoes.throwShoes();
		System.out.println(shoes.SIZE);
		
		//Cloth 인터페이스에 구현객체 person을 대입하여 메소드 실행 및 상수 출력
		Cloth_1035 cloth = new Person_1035();
		cloth.breakCloth();
		Cloth_1035.wearCloth();
		System.out.println(cloth.SIZE);
		
	}
}
