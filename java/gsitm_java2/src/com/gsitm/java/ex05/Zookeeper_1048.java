package com.gsitm.java.ex05;

/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Zookeeper_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 3. 30. 
* @작성자			    : 신종욱
* @프로그램 설명       : 사육사가 사자와 호랑이의 밥먹었는지 여부를 파악하고, 밥을 안먹었으면 밥을 주는 프로그램
*/
public class Zookeeper_1048 {

		private static void feeding(boolean status2) {
			if(!status2) {
				System.out.println("밥준다");
			}
		}
		
		private static void eatChecking(boolean status1) {
			if(status1) {
				System.out.println("밥 먹음");
			}else {
				System.out.println("밥 안먹음");
			}
		}
	
	
	public static void main(String[] args) {
		Lion_1048 lion = new Lion_1048();
		Tiger_1048 tiger = new Tiger_1048();
		eatChecking(lion.status);
		eatChecking(tiger.status);
		feeding(tiger.status);
	}
}
