package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1040.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 노종범
* @프로그램 설명           : 싱글톤 클래스를 호출하는 메인 메소드
*/
public class Menu_1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginUser_1040 a1 =LoginUser_1040.getInstance(); //new를 막아버려서 겟인스턴스 활용
		
		a1.setName("노종범");
		a1.setNo(1040);
		a1.setPower("Intern");
		
		System.out.println("이름: " + a1.getName());
		System.out.println("사번: " + a1.getNo());
		System.out.println("권한: " + a1.getPower());

	}

}
