package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1041.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박민주
* @프로그램 설명           : 사육사가 체크하는 프로그램
*/
public class Trainer_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_1041 tiger = new Animal_1041("호랑이");
		Animal_1041 lion = new Animal_1041("사자");
		
		
		System.out.println(tiger.animal + tiger.dinner);
		System.out.println(lion.animal + lion.dinner);
		
		if(tiger.dinner == false) {
			tiger.dinner = true;
		}
		if(lion.dinner == false) {
			lion.dinner = true;
		}
		System.out.println(tiger.animal + tiger.dinner);
		System.out.println(lion.animal + lion.dinner);
		
		
		
	}

}
