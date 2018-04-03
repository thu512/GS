package com.gsitm.java.ex10;

/** 
*    @과목명               : GS ITM 인턴사원 자바교육
*    @FileName            : People_1075.java 
*    @Project             : gsitm_java2 
*    @Date                : 2018. 4. 3. 
*    @작성자                : 최영롱
*    @프로그램 설명          : 사람 클래스 ( 신발, 옷 클래스의 모든 필드 출력, 메소드 호출)
*/
public class People_1075 implements Clothing_1075, Shoes_1075{
	
	public void throwShoes() {
		System.out.println("신발을 던지다.");
	}
	public void tearClothing() {
		System.out.println("옷을 찢다.");
	}	
	public static void main(String[] args) {
		People_1075 people = new People_1075();
		//인터페이스에 선언된 필드는 모두 public static final의 특성이므로, Static형식으로 호출
		System.out.println(Shoes_1075.SIZE);
		System.out.println(Clothing_1075.SIZE);
		
		people.wearShoes();//신발을 신다 메소드 호출
		people.throwShoes();//신발을 던지다 메소드 호출
		
		Clothing_1075.wearClothing();//static 메소드 호출
		people.tearClothing();// 옷을 찢다 메소드 호출


	}
}
