package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자                : 김수진
* @프로그램 설명           : 옷, 신발 인터페이스ㅡ를 구현하는 프로그램 (다중상속)
*/
public class Person_1032 implements Clothes_1032, Shoes_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_1032 p1=new Person_1032();
		p1.tearClothes();   
		Clothes_1032.wearClothes();  //스태틱메소드 부르기
		p1.throwShoes();
		p1.wearShoes();  //디폴트메소드 부르기    
		System.out.println("옷 사이즈 : "+CLOTHES_SIZE);
		System.out.println("신발 사이즈 : "+SHOES_SIZE); 
	}

	@Override
	public void throwShoes() {  //추상메소드 재정의
		// TODO Auto-generated method stub
		System.out.println("신발을 던졌습니다.");
	}

	@Override
	public void tearClothes() {  //추상메소드 재정의
		// TODO Auto-generated method stub
		System.out.println("옷을 찢었습니다.");
	}

}
