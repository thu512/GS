package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class Menu_1035 {
	public static void main(String[] args) {
		//생성자가 private 이므로 인스턴스 생성 불가
		//LoginUser_1035 singleton = new loginUser_1035();

		//getInstance() 를 이용하여 객체 호출
		LoginUser_1035 singleton1 = LoginUser_1035.getInstance();
		
		//getter,setter를 이용하여 멤버필드 설정 및 호출
		singleton1.setAuth("admin");
		singleton1.setIdNumber(1035);
		singleton1.setName("김주승");
		
		//인스턴스값 확인
		System.out.println("이름 : " +singleton1.getName()+"\n사번 : "+ singleton1.getIdNumber()+"\n권한 : " +singleton1.getAuth());
		
		//오직 하나의 인스턴스인지 확인
		System.out.println("============================================================================");
		LoginUser_1035 singleton2 = LoginUser_1035.getInstance();
		System.out.println("이름 : " +singleton2.getName()+"\n사번 : "+ singleton2.getIdNumber()+"\n권한 : " +singleton2.getAuth());
		
	}

}
