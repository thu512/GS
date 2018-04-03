package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Lion.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 조국
* @프로그램 설명           : Lion 클래스
*/
public class Lion_1067 {
	private static boolean isFeed;
	
	public Lion_1067() {
		Lion_1067.isFeed = false;		
	}

	public static boolean isFeed() {
		return Lion_1067.isFeed;
	}

	public static void setFeed(boolean isFeed) {
		Lion_1067.isFeed = isFeed;
	}
}
