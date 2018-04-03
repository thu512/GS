package com.gsitm.java.ex08;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName         : Test1065.java 
* @Project          : gsitm_java2 
* @Date           	: 2018. 4. 3. 
* @작성자           	: 정광수
* @프로그램 설명       :  메인메소드 실행
*/
public class Test1065 {

	public static void main(String[] args) {
		MomCat1065 momCat = new MomCat1065("갈색", "숏팔", "숏다리", "유연함");
		System.out.println(momCat);
		momCat.cry();

		BabyCat_1065 babyCat = new BabyCat_1065("갈색1", "숏팔1", "숏다리1", "유연함1");
		System.out.println(babyCat);
		babyCat.cry();
	}

}
