package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 이경화
* @프로그램 설명           : 새끼고양이는 어미고양이를 extends 하여 상속받는다.
						새끼고양이는 울다를 재정의하여 "음메" 하고 운다.
						메인함수에서 부모울다와 자기 울다 메소드 호출.
*/
public class BabyCat_1055 extends MomCat_1055{
	
	@Override
	public void cry() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		MomCat_1055 momcat = new MomCat_1055();
		BabyCat_1055 babycat = new BabyCat_1055();
		momcat.cry();
		babycat.cry();
	}

}
