package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 이경화
* @프로그램 설명           : 외부 클래스에서 Loginuser의 이름, 사번 권한을 얻어낼 수 있도록
*/
public class Menu_1055 {
	
public static void main(String[] args) {
		
	LoginUser_1055 user = LoginUser_1055.getInstance();
	LoginUser_1055 user2 = LoginUser_1055.getInstance();
	
	user.setName("이경화");
	user.setNumber(25);
	user.setAuth("ok");
	
	user2.setName("이경화화");
	user2.setNumber(23);
	user2.setAuth("no");
	
	System.out.println(user.getName());
	System.out.println(user2.getName());
	System.out.println(user.getNumber());
	System.out.println(user2.getNumber());
	System.out.println(user.getAuth());
	System.out.println(user2.getAuth());
		
	}
}
