package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박소현
* @프로그램 설명           : 
*/
public class Keeper_1042 {
	
	// 사육사 정보변수
	String name;
	int age;
	String gender;
	
	// 호랑이, 사자 객체변수 선언
	Tiger_1042 tiger = null;
	Lion_1042 lion = null;
	
	// 밥 먹었는지 여부 체크 변수 선언
	static boolean chkEat_lion;
	static boolean chkEat_tiger;
	
	// 사육사 정보 생성자 함수
	Keeper_1042(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 동물할당
	public void allocateTiger(Tiger_1042 tiger) {
		this.tiger = tiger;
	}
	
	public void allocateLion(Lion_1042 lion) {
		this.lion = lion;
	}
	
	// 먹이주는 함수
	public void eat_lion() {
		lion.setEat(true);
	}
	
	public void eat_tiger() {
		tiger.setEat(true);
	}
	
	// 밥 먹었는지 체크
	public void checkEat() {
		chkEat_lion = lion.isEat();
		chkEat_tiger = tiger.isEat();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사육사 동물 변수 생성
		Keeper_1042 keeper = new Keeper_1042("박소현", 24, "W");
		Tiger_1042 tiger = new Tiger_1042("호랭이", 1);
		Lion_1042 lion = new Lion_1042("사쟈", 2);
		
		// 동물 할당
		keeper.allocateTiger(tiger);
		keeper.allocateLion(lion);
		
		// 먹이를 줬는지 체크, 사자만 먹이 주기
		keeper.eat_lion();
		keeper.checkEat();
		
		// 밥 먹었는지 여부 출력
		if(chkEat_lion) {
			System.out.println(lion.getName()+" 밥 먹었쩌요.");
		}else {
			System.out.println(lion.getName()+" 밥 안먹었쩌요.");
			keeper.eat_lion();
		}
		
		if(chkEat_tiger) {
			System.out.println(tiger.getName()+" 밥 먹었쩌요.");
		}else {
			System.out.println(tiger.getName()+" 밥 안먹었쩌요.");
			keeper.eat_tiger();
		}
	}

}
