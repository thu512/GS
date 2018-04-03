package com.gsitm.java.ex06;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: AnimalTrainer.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 이상훈
* @프로그램 설명			: 사육사가 호랑이랑 사자 밥 먹었는지 체크하고 안먹었으면 밥주는 프로그램. 별도의 인스턴스를 생성하지 않았음.
*/
public class AnimalTrainer_1056 {
	public static void main(String[] args) {
		
		/* 상황1. 호랑이랑 사자가 둘다 밥을 안먹은 상태
		 * 
		 * */
		
		// 호랑이부터 챙김
		if( Tiger_1056.mamma ) {
			System.out.println("호랑이 밥먹음! >>> " + Tiger_1056.mamma);
		}else {
			System.out.println("호랑이가 배고픔! >>> " + Tiger_1056.mamma);
			Tiger_1056.mamma = true;
			System.out.println("호랑이가 굶어서 밥줌!");
		}
		
		// 사자도 챙김
		if( Lion_1056.mamma ) {
			System.out.println("사자 밥먹음! >>> " + Lion_1056.mamma);
		}else {
			System.out.println("사자가 배고픔! >>> " + Lion_1056.mamma);
			Lion_1056.mamma = true;
			System.out.println("사자가 굶어서 밥줌!");
		}
		System.out.println();
		
		/* 상황2. 호랑이랑 사자가 둘다 밥을 먹은 상태
		 * 
		 * */
		
		// 호랑이부터 챙김
		if( Tiger_1056.mamma ) {
			System.out.println("호랑이 밥먹음! >>> " + Tiger_1056.mamma);
		}else {
			System.out.println("호랑이가 배고픔! >>> " + Tiger_1056.mamma);
			Tiger_1056.mamma = true;
			System.out.println("호랑이가 굶어서 밥줌!");
		}
		
		// 사자도 챙김
		if( Lion_1056.mamma ) {
			System.out.println("사자 밥먹음! >>> " + Lion_1056.mamma);
		}else {
			System.out.println("사자가 배고픔! >>> " + Lion_1056.mamma);
			Lion_1056.mamma = true;
			System.out.println("사자가 굶어서 밥줌!");
		}
	}
}
