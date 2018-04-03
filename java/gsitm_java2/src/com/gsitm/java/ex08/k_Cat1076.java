package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : k_Cat1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 최준우
* @프로그램 설명           : 새끼고양이 클래스
*/
public class k_Cat1076 extends m_Cat1076 {
	
	
	@Override
	public void Cry(){
		super.Cry();
		System.out.println("음메");  //울다 메서드를 재정의	
	}	
	
	public static void main(String[] args) {
		
		k_Cat1076 cat = new k_Cat1076(); //객체 생성후 Cry() 메서드 호출
		cat.Cry();
		
		
	}

	

}
