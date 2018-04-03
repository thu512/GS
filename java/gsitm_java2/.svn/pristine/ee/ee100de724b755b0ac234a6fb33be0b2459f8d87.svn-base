package com.gsitm.java.ex06;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ZooKeeper_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class ZooKeeper_1035 {
	// 호랑이와 사자가 밥을 먹었는지 체크
	public void check() {
		// 사자가 밥을 먹었는지 체크 , 만약 먹었다면 먹이를 준다
		if (Lion_1035.isFull == true) {
			System.out.println("사자는 이미 밥을 먹었습니다. 체크값 : " + Lion_1035.isFull);
		} else {
			System.out.println("사자가 밥을 먹지않았습니다. 체크값 :" + Lion_1035.isFull);
			feedLion();

		}

		// 호랑이가 밥을 먹었는지 체크 , 만약 먹었다면 먹이를 준다
		if (Tiger_1035.isFull == true) {
			System.out.println("호랑이는 이미 밥을 먹었습니다. 체크값 : " + Tiger_1035.isFull);
		} else {
			System.out.println("호랑이가 밥을 먹지않았습니다. 체크값 : " + Tiger_1035.isFull);
			feedTiger();
		}
	}

	// 사자에게 먹이를 주는 메서드
	public void feedLion() {
		Lion_1035.isFull = true;
		System.out.println("사자에게 먹이를 먹입니다. 체크 값 : " + Lion_1035.isFull);
	}

	// 호랑이에게 먹이를 주는 메서드
	public void feedTiger() {
		Tiger_1035.isFull = true;
		System.out.println("호랑이에게 먹이를 먹입니다. 체크 값  :" + Tiger_1035.isFull);
	}

	public static void main(String[] args) {
		// 사육사 객체 생성후 체크 2번실행
		ZooKeeper_1035 zooKeeper = new ZooKeeper_1035();
		zooKeeper.check();
		zooKeeper.check();
	}

}
