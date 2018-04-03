package com.gsitm.java.ex06;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerUpper_1033.java 
 * @Project         : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 사육사가 밥먹었는지 체크하는 내용
 */
public class Trainer_1033 {
	Lion_1033 a_l = new Lion_1033();
	Tiger_1033 a_t = new Tiger_1033();
	
	public void feedcheck() { //사자, 호랑이 객체 내의 메소드를 이용하여 먹이를 주었는지 체크하는 메소드
		a_l.check();
		a_t.check();
	}
	
	public void feed() { //먹이주기 메소드
		if(a_l.getStatus() == false) {
			a_l.setStatus(true);
		}
		
		if(a_t.getStatus() == false) {
			a_t.setStatus(true);
		}
	}
	
	public static void main(String[] args) {
		Trainer_1033 me = new Trainer_1033();
		me.feedcheck();
		me.feed();
		System.out.println("사육사는 사자와 호랑이에게 밥을 주었습니다.");
		me.feedcheck();
	}
}
