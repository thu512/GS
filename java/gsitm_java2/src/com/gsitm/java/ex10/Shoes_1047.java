package com.gsitm.java.ex10;

public interface Shoes_1047 {
	public int shoesSize = 260;//상수. 변경될 수 없으며 기본적으로 static final이 된다.
	void throwShoes(int power);//추상 메소드, 구현하는 클래스가 반드시 오버라이드 해야한다.
	default void wear() {//디폴트 메소드. 구현하는 클래스에서 상속받듯이 사용할 수 있다.
		System.out.println(shoesSize+"짜리 신발을 신었다.");
	}
}
