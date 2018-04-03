package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ZooKeeper_1050.java 
* @Project				: gsitm_java 
* @Date					: 2018. 3. 30. 
* @작성자					: 우연찬
* @프로그램 설명			: 사육사 클래스
*/
public class ZooKeeper_1050 {
	public static void main(String[] args) {
		Lion_1050 l = new Lion_1050();
		Tiger_1050 t = new Tiger_1050();
		
		System.out.println("사자는 밥을 먹었나요?"); // 입력으로 밥먹었는지 설정
		Scanner sc = new Scanner(System.in);
		l.bob=sc.nextBoolean();
		System.out.println("호랑이는 밥을 먹었나요?");  // 입력으로 밥먹었는지 설정
		t.bob=sc.nextBoolean();
		
		if(l.bob) {//밥먹은 상태가 true일 때 출력
			System.out.println("사자는 밥 먹었습니다.");
		}else {//밥먹은 상태가 false일 때 출력 후 상태변환
			System.out.println("사자는 밥 안먹었습니다. 지금 밥을 줍니다.");
			l.bob = true;
		}
		if(t.bob) {//밥먹은 상태가 true일 때 출력
			System.out.println("호랑이는 밥 먹었습니다.");
		}else {//밥먹은 상태가 false일 때 출력 후 상태변환
			System.out.println("호랑이는 밥 안먹었습니다. 지금 밥을 줍니다.");
			t.bob = true;
		}
		//사육사 class에서 밥을 먹었는지 출력
		System.out.println(l.bob+" "+t.bob);
	}
}
