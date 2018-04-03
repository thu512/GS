package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 임혜성
* @프로그램 설명           : 새끼고양이는 어미 고양이를 extends 하여 상속 받는다.
						   새끼고양이는 울다를 재정의하여 "음메"하고 운다.
*/
public class BabyCat_1061 extends MomCat_1061{
	public BabyCat_1061() {
		super();
	}
	
	@Override
	public void cry() {
		System.out.println("음메");
	}
	public void momCry() {
		super.cry();
	}
	public static void main(String [] args) {
		BabyCat_1061 babyCat = new BabyCat_1061();
		System.out.print("어미 고양이 울음 : ");
		babyCat.momCry();
		System.out.println("팔 : " + babyCat.arm + "개 다리 : " + babyCat.leg + "개 어깨 : " + babyCat.shoulder + "개");
		System.out.print("새끼 고양이 울음 : ");
		babyCat.cry();
	}
}
