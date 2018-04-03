package com.gsitm.java.ex10;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Cloth_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 4. 3.
 * @작성자			: 차주현
 * @프로그램 설명	: 상수 사이즈, 옷을 찢는 추상 메소드, 옷을 입는 스태틱 메소드가 구현되어있다.
 */
public interface Cloth_1072 {
	String CLOTH_SIZE = "XL";
	void tear();
	static void wear() {
		System.out.println("옷을 입었습니다.");
	}
}
