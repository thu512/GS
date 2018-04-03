/**

* <pre>

* 1. 프로젝트명 : gsitm_java2

* 2. 패키지명(또는 디렉토리 경로) : com.gsitm.java.ex06

* 3. 파일명 : Keeper_1062.java

* 4. 작성일 : 2018. 3. 30. 오후 3:41:28

* 5. 작성자 : 장동주

* 6. 설명 :

* </pre>

*/

package com.gsitm.java.ex06;

/**
 * @과목명 : GS ITM 인턴사원 자바교육
 * @FileName : Keeper_1062.java
 * @Project : gsitm_java2
 * @Date : 2018. 3. 30.
 * @작성자 : 장동주
 * @프로그램 설명 : 사육사는 호랑이와 사자의 식사상태를 체크하여 프린트하고 밥을 안먹은 동물에게 먹이를 줍니다.
 */
public class Keeper_1062 {
	
	
	public void print(Tiger_1062 tiger_1062, Lion_1062 lion_1062) {
		if(tiger_1062.isFeeded==true) {
			System.out.println("호랑이가 밥을 먹었습니다.");
		}else {
			System.out.println("호랑이가 밥을 안먹었습니다.");
		}
		if(lion_1062.isFeeded==true) {
			System.out.println("사자가 밥을 먹었습니다.");
		}else {
			System.out.println("사자가 밥을 안먹었습니다.");
		}
	}
	
	public void feed(Tiger_1062 tiger_1062, Lion_1062 lion_1062) {
		if(tiger_1062.isFeeded==false) {
			tiger_1062.isFeeded=true;
			System.out.println("사육사가 밥을 안먹은 호랑이에게 밥을 먹였습니다.");
		}
		if(lion_1062.isFeeded==false) {
			lion_1062.isFeeded=true;
			System.out.println("사육사가 밥을 안먹은 사자에게 밥을 먹였습니다.");
			
		}
	}
	public static void main(String[] args) {
		
		Keeper_1062 keeper_1062= new Keeper_1062();
		Lion_1062 lion_1062= new Lion_1062();
		Tiger_1062 tiger_1062= new Tiger_1062();
		keeper_1062.print(tiger_1062,lion_1062);
		keeper_1062.feed(tiger_1062, lion_1062);
		System.out.println("밥을 먹인후의 상태 출력");
		keeper_1062.print(tiger_1062,lion_1062);
	}
	

}
