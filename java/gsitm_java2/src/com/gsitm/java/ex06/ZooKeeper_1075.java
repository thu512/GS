package com.gsitm.java.ex06;

/**
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ZooKeeper_1075.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 30.
 * @작성자			: 최영롱
 * @프로그램 설명	: 사육사가 사자와 호랑이에게 밥을 주었는지 안주었는지 체크하고 밥주는 메소드를 수행하는 클래스
 */
public class ZooKeeper_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}
	
	public static void check() {
		if(Lion_1075.checkEat) {
			System.out.println(Lion_1075.name + "가 이미 밥을 먹었습니다");
		}else {
			Lion_1075.checkEat = true;
			System.out.println(Lion_1075.name + "에게 밥을 주었습니다");
		}
		if(Tiger_1075.checkEat) {
			System.out.println(Tiger_1075.name + "가 이미 밥을 먹었습니다");
		}else {
			Tiger_1075.checkEat = true;
			System.out.println(Tiger_1075.name + "에게 밥을 주었습니다");
		}
	}
}
