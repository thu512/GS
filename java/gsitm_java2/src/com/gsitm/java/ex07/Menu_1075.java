package com.gsitm.java.ex07;

/** 
*    @과목명               : GS ITM 인턴사원 자바교육
*    @FileName            : Menu_1075.java 
*    @Project             : gsitm_java2 
*    @Date                : 2018. 4. 2. 
*    @작성자                : 최영롱
*    @프로그램 설명          : singleton클래스를 호출하여, 멤버변수값이 유지되는 것을 확인한다
*/
public class Menu_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1075 logUser = LoginUser_1075.getInstance();
		// 생성자에서 초기화한 멤버변수 값
		System.out.println("logUser.getName() = " + logUser.getName());
		System.out.println("logUser.getCompanyNum() = " + logUser.getCompanyNum());
		System.out.println("logUser.isAuthority() = " + logUser.isAuthority());
		// setter로 바꿔보기
		logUser.setName("rong_choii");
		logUser.setCompanyNum(10751075);
		logUser.setAuthority(false);
		// 다시 출력해서 확인
		System.out.println("logUser.getName() = " + logUser.getName());
		System.out.println("logUser.getCompanyNum() = " + logUser.getCompanyNum());
		System.out.println("logUser.isAuthority() = " + logUser.isAuthority());
		System.out.println();
		// 다른 클래스 변수를 선언해도, 객체는 하나이기 때문에 loginUser_1075의 멤버변수 값이 유지된다
		LoginUser_1075 logUser2 = LoginUser_1075.getInstance();
		System.out.println("logUser2.getName() = " + logUser2.getName());
		System.out.println("logUser2.getCompanyNum() = " + logUser2.getCompanyNum());
		System.out.println("logUser2.isAuthority() = " + logUser2.isAuthority());
		
	}

}
