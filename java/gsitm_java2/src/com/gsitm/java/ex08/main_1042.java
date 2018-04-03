package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : main_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박소현
* @프로그램 설명           : 메인 클래스 정의
*/
public class main_1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		momCat_1042 mom = new momCat_1042("white", "white", "white");
		kidCat_1042 kid = new kidCat_1042("white", "black", "white");
		
		System.out.println("엄마고양이의 머리색 = " + mom.getHairColor() + "엄마 고양이의 팔  = " + mom.hand 
				+ "엄마 고양이의 어깨  = " + mom.sholder + "엄마 고양이의 다리  = " + mom.leg);
		
		System.out.println("새끼고양이의 머리색 = " + kid.getHairColor() + "새끼고양이의 팔  = " + kid.hand 
				+ "새끼고양이의 어깨  = " + kid.sholder + "새끼고양이의 다리  = " + kid.leg);
		
		System.out.print("엄마 고양이가 웁니다 : ");
		mom.cry();
		
		System.out.print("새끼고양이가 웁니다 : ");
		kid.cry();
		
		
		
		/*System.out.print("엄마 고양이가 훔칩니다..");
		mom.stolen();
		
		System.out.print("새끼고양이가 훕칩니다..");
		kid.stolen();*/
		
		
	}

}
