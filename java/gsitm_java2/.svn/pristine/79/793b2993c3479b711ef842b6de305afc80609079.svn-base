/**
 * 
 */
package com.gsitm.java.ex06;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Animals.java
* @Project			: gsitm_java2
* @Date				: 2018. 3. 30. 
* @작성자				: 성동원
* @프로그램 설명		: 사자와 호랑이를 상속시킨 후에 그들을 체크하는 메서드를 각각 만들었습니다.
*/
public class Animals {
	//동물들이 밥을 먹었는지 못먹었는지 체크한다. static는 값을 공유한다.
	static boolean flag = false;
	

	public void checkLion(Lion lion) {
		if(lion.flag==false) {
			System.out.println("사자는 밥을 안줬으니까 밥을 주자 체크값은"+flag);
			lion.flag = true; // 밥을 먹은애로 바꿈
		}else {
			System.out.println("사자는 밥을 먹었으니까 밥을 주지말자 체크값은 "+flag);
			lion.flag = false; //밥을 먹지 않은 애로 바꿈
		}
	}
	
	
	public void checkTiger(Tiger tiger) {
		if(tiger.flag==false) {
			System.out.println("호랑이는 밥을 안줬으니까 밥을 주자 체크값은"+flag);
			tiger.flag = true; // 밥을 먹은애로 바꿈
		}else {
			System.out.println("호랑이는 밥을 먹었으니까 밥을 주지말자 체크값은 "+flag);
			tiger.flag = false; //밥을 먹지 않은 애로 바꿈
		}
	}
	
}
