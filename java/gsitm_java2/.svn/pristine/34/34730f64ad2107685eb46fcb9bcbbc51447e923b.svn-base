package com.gsitm.java.ex06;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Fed_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 30.
 * @작성자            : 조은솔
 * @프로그램 설명            : 
 * Animal_1068 클래스의 객체(any)를 생성해 내부 변수를 접근
 * getter를 이용 현재 상태를 출력한다.
 * 먹이를 먹지 않은 상태(empty)의 경우, 먹이를 주어 상태를 (full)로 바꾸어 준다.
 * 먹이를 먹지은 상태(full)의 경우, 현재 상태만 출력한다.
 */
public class Fed_1068 {

	Animal_1068 any = new Animal_1068();
	
	public void fed(Animal_1068 any) {
		
		
		System.out.println("사자의 현재 상태 : " + any.getLion());
		System.out.println("호랑이의 현재 상태 : " + any.getTiger());
		
		if(any.getLion() == "empty") {
			any.setLion("full");
			System.out.println("사자에게 먹이를 주었다.");
		}
		if(any.getTiger() == "empty") {
			any.setTiger("full");
			System.out.println("호랑이에게 먹이를 주었다.");
		}
		
	}
}
