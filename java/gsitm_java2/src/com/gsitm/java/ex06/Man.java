/**
 * 
 */
package com.gsitm.java.ex06;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Man.java
* @Project			: gsitm_java2
* @Date				: 2018. 3. 30. 
* @작성자				: 성동원
* @프로그램 설명		: 사육사를 Man이라고 했다. 사자와 호랑이가 밥을 먹었는지 체크해야한다.
*/
public class Man {

	public static void main(String[] args) {
		
		//동물원을 만들었다.
		Animals animals = new Animals();
		
		//동물원에서 사자와 호랑이의 밥을 먹은지 체크하는 함수를 만들었다.
		animals.checkLion(new Lion());
		animals.checkTiger(new Tiger());
		animals.checkTiger(new Tiger());
		
		

	}

}
