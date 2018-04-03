package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자                : 김수진
* @프로그램 설명           : 사육사는 사자와 호랑이가 밥을 먹었나 확인하고 체크값을 출력, 밥을 먹지 않았다면 밥을 주는 프로그램
*/
public class Human_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//밥주기 전 출력
		System.out.println("호랑이 밥 먹었나요? "+Tiger_1032.isTigerEat);
		System.out.println("사자 밥 먹었나요? "+Lion_1032.isLionEat);
		//static은 객체 생성 안하고 사용가능
		if(Tiger_1032.isTigerEat == false) {  //호랑이가 밥을 먹지 않았다면 true로 바꿔줌, 밥을 준 상태
			Tiger_1032.isTigerEat = true;
		}
		if(Lion_1032.isLionEat == false) { //사자가 밥을 먹지 않았다면 true로 바꿔줌, 밥을 준 상태
			Lion_1032.isLionEat = true;
		}
		
		//밥을 준 상태 후 출력
		System.out.println("호랑이 밥 먹었나요? "+Tiger_1032.isTigerEat);
		System.out.println("사자 밥 먹었나요? "+Lion_1032.isLionEat);
		
	}

}
