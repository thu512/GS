package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Person_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 송현석
 * @프로그램 설명                : 인터페이스 구현 예제. 옷과 신발이라는 인터페이스를 Person클래스가 구현하여 여러 인터페이스 요소를 사용한다.
 */
public class Person_1047 implements Clothes_1047,Shoes_1047{

	@Override
	public void throwShoes(int power) {//신발 인터페이스의 추상 메소드 구현.
		// TODO Auto-generated method stub
		System.out.println("신발이 "+power+"미터 날아갔습니다!");
	}
	
	@Override
	public void tearing() {//옷 인터페이스의 추상 메소드 구현.
		// TODO Auto-generated method stub
		System.out.println("찌이익.. 옷이 찢어졌습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_1047 person = new Person_1047();//객체화
		System.out.println("옷 사이즈 : "+clotheSize);//요구사항 : 옷과 신발 사이즈 출력
		System.out.println("신발 사이즈 : "+shoesSize);
		Clothes_1047.wear();//요구사항 : 이하 모든 메소드 실행
		person.wear();
		person.throwShoes(100);
		person.tearing();

	}

}