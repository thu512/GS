package com.gsitm.java.ex06;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Trainer_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 조현우
* @프로그램 설명			: 트레이너 클레스로 사자 호랑이 상태확인 및 밥주기
*/
public class Trainer_1069 {
	public static void main(String[] args) {
		//라이언이 false이면(배고프면) 밥주고 상태출력
		if(checkLion() == false) {
			Lion_1069.hungry = true;
			System.out.println("사자의 상태는 " + Lion_1069.hungry + "입니다");
		} else {
			System.out.println("사자는 배부릅니다.");
		}
		//호랑이가 false면(배고프면) 밥주고 상태출력
		if(checkTiger() == false) {
			Tiger_1069.hungry = true;
			System.out.println("호랑이의 상태는 " + Tiger_1069.hungry + "입니다");
		} else {
			System.out.println("호랑이는 배부릅니다.");
		}
	}
	//사자 배고픔 체크
	public static boolean checkLion() {
		if(Lion_1069.hungry == false) {
			System.out.println("사자가 배고픕니다.");
			return false;
		} else {
			System.out.println("이미 배부릅니다.");
			return true;
		}
		
	}
	//호랑이 배고픔 체크
	public static boolean checkTiger() {
		if(Tiger_1069.hungry == false) {
			System.out.println("호랑이가 배고픕니다.");
			return false;
		} else {
			System.out.println("호랑이가 배부릅니다.");
			return true;
		}	
	}
}
