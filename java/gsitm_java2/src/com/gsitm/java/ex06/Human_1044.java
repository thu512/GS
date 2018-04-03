/**
 * 
 */
package com.gsitm.java.ex06;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Human_1044.java
* @Project			: gsitm_java2
* @Date				: 2018. 3. 30. 
* @작성자				: 성동원
* @프로그램 설명		: 문제 이해를 잘 못해서, 다시 수정한 후 올립니다. 기존에는 하나의 static 변수를 공유해서 사자와 호랑이 둘다 컨트롤
*					    하는 지 알고 그렇게 코딩을 헀습니다. 이후 다시 수정하여 제출합니다.
*/
public class Human_1044 {
	
	
	public static void main(String[] args) {
		Lion_1044 lion_1044 = new Lion_1044();
		lion_1044.checkLion(new Lion_1044());
		lion_1044.checkLion(new Lion_1044());
		
		Tiger_1044 tiger_1044 = new Tiger_1044();
		tiger_1044.checkLion(new Tiger_1044());
		tiger_1044.checkLion(new Tiger_1044());
	}

}
