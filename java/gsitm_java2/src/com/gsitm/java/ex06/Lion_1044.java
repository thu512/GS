/**
 * 
 */
package com.gsitm.java.ex06;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Lion_1044.java
* @Project			: gsitm_java2
* @Date				: 2018. 3. 30. 
* @작성자				: 성동원
* @프로그램 설명		: 사자 클래스, 사자안에서 밥을 먹었는지를 체크하는 메서드가 존재합니다.
*/
public class Lion_1044{
	public static boolean flag = false;
	
	public void checkLion(Lion_1044 lion) {
		if(lion.flag==true) {
			flag = false;
			System.out.println("사자는 밥을 밥을 먹었단다, 주지말자, 사자 체크값 : "+lion.flag);
		}else {
			flag = true;
			System.out.println("사자는 밥을 먹지 않았단다, 주자, 사자 체크값 : "+lion.flag);
		}
	}
	
}
