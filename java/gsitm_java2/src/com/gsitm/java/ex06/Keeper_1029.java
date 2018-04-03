package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 고하윤
* @프로그램 설명           : 사육사 - 사자와 호랑이가 밥을 먹었는지 체크하고 출력
*/
public class Keeper_1029 {
	
	//사자와 호랑이가 밥을 먹었는지 체크하고 출력하는 메소드
	public void checkMeal() {
		if(Lion_1029.eatMeal == false) {
			System.out.println("사자가 밥을 먹지 않았습니다.");
			//사자가 밥을 먹지 않았다면 밥을 주는 메소드 호출
			giveMealToLion();
		} else {
			System.out.println("사자가 밥을 먹었습니다.");
		}
		if(Tiger_1029.eatMeal == false) {
			System.out.println("호랑이가 밥을 먹지 않았습니다.");
			//호랑이가 밥을 먹지 않았다면 밥을 주는 메소드 호출
			giveMealToTiger();
		} else {
			System.out.println("호랑이가 밥을 먹었습니다.");
		}
	}

	//사자에게 밥을 주는 메소드
	public void giveMealToLion() {
		Lion_1029.eatMeal = true;
		System.out.println("사자에게 밥을 주었습니다.");
	}
	//호랑이에게 밥을 주는 메소드
	public void giveMealToTiger() {
		Tiger_1029.eatMeal = true;
		System.out.println("호랑이에게 밥을 주었습니다.");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keeper_1029 keeper = new Keeper_1029();
		
		keeper.checkMeal();
		
	}

}
