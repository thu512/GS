package com.gsitm.java.ex06;

public class Animal_1070 {
	boolean m_feedCheck;
	String m_name;
	
	Animal_1070(String name, boolean feedCheck){
		m_name = name;
		m_feedCheck = feedCheck;
	}
	
	void feedCheckFunc() {
		if(m_feedCheck == false) {
			System.out.println(m_name + "가 아직 식사를 안했습니다.");
			feedGet();
		} else {
			System.out.println(m_name + "는 포만감에 취해있습니다. 먹이를 안줘도 될 것 같습니다.");
		}
	}
	
	void feedGet() {
		System.out.println(m_name + "는 포식중입니다...");
	}
	
	public static void main(String[] args) {

	}
}