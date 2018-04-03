package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Zookeeper_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 유희수
* @프로그램 설명           : 사육사가 사자와 호랑이가 밥을 먹었는지 체크하는지 체크하는 프로그램
*/
public class Zookeeper_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion_1063 lion = new Lion_1063();
		Tiger_1063 tiger = new Tiger_1063();
		
		//사자상태확인하고 밥주기
		lion.nowlion();
		lion.givelion();
		
		//호랑이 상태체크하고 밥주기
		tiger.nowtiger();
		tiger.givetiger();
	}

}
