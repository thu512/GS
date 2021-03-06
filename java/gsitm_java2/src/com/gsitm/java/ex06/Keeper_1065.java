package com.gsitm.java.ex06;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1065.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정광수
* @프로그램 설명           :  사육사 클래스
*							클래스 파일 3개  사육사 사자 호랑이 만들어서 먹었는지 여부 체크
*							사자와 호랑이의 밥먹었는지 여부는 static
*							사육사는 체크하고 체크한 값을 출력하라
*/
public class Keeper_1065 {

	/**
	 * 
	 * @param args
	 * @see main method
	 */
	public static void main(String[] args) {
		Keeper_1065 kepper = new Keeper_1065();
		
		kepper.isEat();
		System.out.println("===========");
		//먹이를 주고 나서 체크 배부른상태로 나옴
		kepper.isEat();
	}

	/**
	 * @see 먹이 먹었는지 확인
	 * 		만약 먹이를 먹지 않았으면 Feeding()메서드 호출 해서 먹이를 줌
	 */
	public void isEat() {

		if (Tiger_1065.isEat) {
			System.out.println("호랑이는 배부르다");
		} else {
			System.out.println("호랑이는 배고프다");
			Feeding("tiger");
		}

		
		if (Lion_1065.isEat) {
			System.out.println("사자는 배부르다");
		} else {
			System.out.println("사자는 배고프다");
			Feeding("lion");
		}

	}

	/**
	 * @description 먹이를 먹지 않았으므로 먹이를 주는 메서드
	 * 		string 타입으로 구별해서 해당 객체 변수에 상태 변화 및 표시\
	 * @exception Exception
	 */
	public void Feeding(String type) {
		if ("tiger".equals(type)) {
			Tiger_1065.isEat = true;
			System.out.println("호랑이 먹이 먹었다");
		} else if ("lion".equals(type)) {
			Lion_1065.isEat = true;
			System.out.println("사자 먹이 먹었다");
		}

	}

}
