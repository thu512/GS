package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex08
* @Date                : 2018. 4. 3. 오전 11:04:59
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*어미고양이_사번은
- private 멤버변수 털색깔을 갖는다.
- public 멤버변수 팔, 다리, 어깨를 갖는다.
- public 메소드 울다를 갖는다. "냐옹"하고 운다.
- private 메소드 훔치다를 갖는다.

새끼고양이_사번은 어미고양이를 extends하며 상속받는다.
새끼고양이는 메인메소드를 갖고 울다를 재정의하며 "음메"하고 운다.
*/
public class BabyCat_1038 {
	public void cry() {
		System.out.println("음메");
	}
	public static void main(String[] args) {
		MotherCat_1038 mom = new MotherCat_1038();
		BabyCat_1038 baby = new BabyCat_1038();
		mom.cry();
		//mom.steal();접근불가
		baby.cry();
	}
}
