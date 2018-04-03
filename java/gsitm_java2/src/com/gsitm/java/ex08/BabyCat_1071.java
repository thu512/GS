package com.gsitm.java.ex08;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : BabyCat_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 4. 3. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 새끼고양이 엄마고야잉 울다 오버라이드
*/
public class BabyCat_1071 extends MomCat_1071 {
	@Override
	public String cry() {
		return "음메";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyCat_1071 baby = new BabyCat_1071();
		MomCat_1071 mom = new MomCat_1071();
		
		System.out.println(baby.cry());
		System.out.println(mom.cry());
	}

}
