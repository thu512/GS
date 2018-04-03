package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 유희수
* @프로그램 설명           : 새끼고양이는 어미고양이를 extends로 상속받고, 울다함수를 "음메"로 재정의한다.
*/
public class BabyCat_1063 extends MomCat_1063 {
	
	@Override
	public void cry(){
		System.out.println("음메");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("어미고양이의 울음소리는 ? ");
		MomCat_1063 mc = new MomCat_1063();
		mc.cry();
		
		BabyCat_1063 bc = new BabyCat_1063();
		System.out.println("팔이 있나요? "+bc.arm);
		System.out.println("다리가 있나요? "+bc.leg);
		System.out.println("어깨가 있나요? "+bc.sholder);
		System.out.print("새끼고양이의 울음소리는 ? ");
		bc.cry();
	}

}
