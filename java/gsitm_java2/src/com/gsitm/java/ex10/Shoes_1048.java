package com.gsitm.java.ex10;
/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Clothes_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 4. 3. 
* @작성자			    : 신종욱
* @프로그램 설명       : 디폴트 메소드, 추상메소드를 포함한 인터페이스
*/
public interface Shoes_1048 {
	public int SHOES_SIZE = 260;
	
	default void wearShoes() {
		System.out.println("신발을 신다.");
	}
	public abstract void throwShoes();

}
