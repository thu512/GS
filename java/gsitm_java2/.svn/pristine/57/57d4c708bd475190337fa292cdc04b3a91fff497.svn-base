/**
 * 
 */
package com.gsitm.java.ex07;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Menu_1044.java
* @Project			: gsitm_java2
* @Date				: 2018. 4. 2. 
* @작성자				: 성동원
* @프로그램 설명		: 외부(main)에서 user 객체를 싱글톤을 통해 생성. new를 통한 접근이 아닌, 메서드를 통한 접근.
*/
public class Menu_1044 {
	public static void main(String[] args) {
		//user라는 객체를 싱글톤으로 생성
		LoginUser_1044 user =  LoginUser_1044.getInstance();
		
		System.out.println(user.getName());
		System.out.println(user.getNumber());
		System.out.println(user.getAuthor());
		
		//user의 속성값을 setting하는 메서드 사용
		user.setAuthor("사장님");
		user.setName("정연귀");
		user.setNumber(1);
		
		System.out.println(user.getName());
		System.out.println(user.getNumber());
		System.out.println(user.getAuthor());
		
	}
}
