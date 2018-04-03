package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 김진우
* @프로그램 설명          : 메뉴
*/
public class Menu_1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1037 loginUser = LoginUser_1037.getInstance();
		
		loginUser.setName("김진우");
		loginUser.setEmpNum(1037);
		loginUser.setAuth(1);
		
		System.out.println("사원명 : " + loginUser.getName() + " , 사원번호 : " + loginUser.getEmpNum() + " , 권한 : " + loginUser.getAuth());

	}

}
