package com.gsitm.java.ex07;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Menu_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 2. 
* @작성자					: 조현우
* @프로그램 설명			: 싱글톤 및 private 설정후 getter/setter를 이용한 사번, 이름, 권한 출력문제
*/
public class Menu_1069 {
	public static void main(String[] args) {
		LoginUser_1069 menu1 = LoginUser_1069.getSingleton();

		menu1.setAuth(true);
		menu1.setDeptNum("1069");
		menu1.setName("조현우");
		System.out.println(menu1.getName());
		System.out.println(menu1.getDeptNum());
		System.out.println(menu1.isAuth());
	}
}
