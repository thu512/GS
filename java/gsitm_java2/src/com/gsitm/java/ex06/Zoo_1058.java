package com.gsitm.java.ex06;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: Zoo_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 3. 30. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class Zoo_1058 {

	public static void main(String[] args) {
		Zoo_1058 z = new Zoo_1058();
		Tiger_1058.hungry = false;
		Lion_1058.hungry = true;
		System.out.println("호랑이  초기값 : " + Tiger_1058.hungry);
		System.out.println("사자 초기값 : " + Lion_1058.hungry);
		System.out.println("호랑이 나중값  : " + z.tigerCheck());
		System.out.println("사자  나중값 : " + z.lionCheck());
	}

	boolean tigerCheck() {
		if(Tiger_1058.hungry == false) {
			System.out.println("호랑이에게 밥을 주었습니다.");
			Tiger_1058.hungry=true;
		}
		return Tiger_1058.hungry;
	}
	boolean lionCheck() {
		if(Lion_1058.hungry == false) {
			System.out.println("사자에게 밥을 주었습니다.");
			Lion_1058.hungry=true;
		}
		return Lion_1058.hungry;
	}
}
