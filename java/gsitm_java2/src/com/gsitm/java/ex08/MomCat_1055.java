package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : MomCat_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 이경화
* @프로그램 설명           : 어미고양이는 
						private 멤버변수 털색깔을 갖는다.
						public 멤버변수 팔,다리, 어깨를 갖는다.
						public 메소드 울다를 갖는다 "냐응"하고 운다.
						private 메소드 훔치다를 갖는다.
*/
public class MomCat_1055 {

	private String color;
	public int arm;
	public int leg;
	public int sholder;
	
	public void cry () {
		System.out.println("냐응");
	}
	private void steal() {
		System.out.println("훔쳣");
	}
}
