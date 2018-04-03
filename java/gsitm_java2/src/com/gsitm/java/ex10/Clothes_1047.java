package com.gsitm.java.ex10;

public interface Clothes_1047 {
	public String clotheSize = "XL";//상수. 변경될 수 없으며 기본적으로 static final이 된다.
	static void wear() {// 정적 메소드. 객체가 없어도 독단적으로 사용 가능하다.
		System.out.println(clotheSize+"사이즈의 옷을 입었다.");
	}
	void tearing();//추상 메소드, 구현하는 클래스가 반드시 오버라이드 해야한다.
}