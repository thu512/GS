package com.gsitm.java.ex07;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Menu_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 2. 
* @작성자					: 이상훈
* @프로그램 설명			: Singleton pattern 테스트 클래스
*/
public class Menu_1056 {
	public static void main(String[] args) {
		LogInUser_1056 logIn = LogInUser_1056.getInstanceType1();
		
		//	setData
		logIn.setName("이상훈");
		logIn.setEmpNo("IT1056");
		logIn.setAuthority("최고등급");
		
		// getData
		System.out.println(logIn.getName());
		System.out.println(logIn.getEmpNo());
		System.out.println(logIn.getAuthority());
		System.out.println();
		
		LogInUser_1056 logIn2 = LogInUser_1056.getInstanceType1();
		
		// 별도의 객체에 setData 없이 하나의 객체를 돌려쓰므로 데이터가 변할 일이 없다.
		System.out.println(logIn2.getName());
		System.out.println(logIn2.getEmpNo());
		System.out.println(logIn2.getAuthority());
		
	}
}
