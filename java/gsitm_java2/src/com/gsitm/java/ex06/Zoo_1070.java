package com.gsitm.java.ex06;

public class Zoo_1070 {
	Zoo_1070(){
		System.out.print("사육사가 입장했습니다.");
		Animal_1070 m_lion = new Animal_1070("사자", true);
		Animal_1070 m_tiger = new Animal_1070("호랑이", false);
		System.out.println(" 사자와 호랑이가 보입니다.");
		m_lion.feedCheckFunc();
		m_tiger.feedCheckFunc();
	}
	public static void main(String[] args) {
	}
}