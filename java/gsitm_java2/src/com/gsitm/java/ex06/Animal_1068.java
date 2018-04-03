package com.gsitm.java.ex06;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Animal_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 30.
 * @작성자            : 조은솔
 * @프로그램 설명            :
 * 사자(lion), 호랑이(tiger) 변수를 private, static으로 선언
 * 기본값은 empty(먹이를 먹지 않은 상태)
 * 외부 접근을 위한 getter/setter 생성
 */
public class Animal_1068 {

	private static String lion = "empty";
	private static String tiger = "empty";
	
	public String getLion() {
		return lion;
	}
	public void setLion(String lion) {
		this.lion = lion;
	}
	public static String getTiger() {
		return tiger;
	}
	public static void setTiger(String tiger) {
		Animal_1068.tiger = tiger;
	}
	

	
	
	

}
