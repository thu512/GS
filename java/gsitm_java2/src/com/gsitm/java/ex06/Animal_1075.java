package com.gsitm.java.ex06;

/**
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Animal_1075.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 30.
 * @작성자			: 최영롱
 * @프로그램 설명	: 동물의 밥먹었는지 여부의 boolean 값과 이름을 멤버변수로 가진 클래스
 */
public class Animal_1075 {
	
	String name;
	private static boolean checkEat = ( (Math.floor(Math.random()*2)+1) == 1)? true : false;
	//랜덤으로 밥먹었었는지, 안먹었는지 초기값 설정

	public boolean isCheckEat() {
		return checkEat;
	}

	public void setCheckEat(boolean checkEat) {
		this.checkEat = checkEat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal_1075(String name){ // 생성자로 이름 설정하도록
		this.name = name;
	}

}
