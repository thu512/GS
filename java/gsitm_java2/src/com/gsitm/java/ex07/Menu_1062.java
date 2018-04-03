package com.gsitm.java.ex07;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : Menu_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 4. 2. 
 * @작성자            : 장동주
 * @프로그램 설명      : Login user를 불러오는 클래스입니다.
 */
public class Menu_1062 {

	public static void main(String[] args) {
		LoginUser_1062 loginUser_1062= LoginUser_1062.getInstance();
		
		loginUser_1062.setName("장동주");
		loginUser_1062.setAuth(true);
		loginUser_1062.setId(1062);
		
		String name=loginUser_1062.getName();
		int id=loginUser_1062.getId();
		boolean auth=loginUser_1062.isAuth();
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(auth);

	}

}
