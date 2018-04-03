package com.gsitm.java.ex06;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: Tiger_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 3. 30. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 호랑이에 대한 클래스
*/
public class Tiger_1054 {
	private static boolean tigerHungryStatus;
	
	private String name = "호돌이";

	/**
	 * 생성자(Constructor)
	 */
	public Tiger_1054() {
		super();
		tigerHungryStatus = false;
	}

	/**
	 * 생성자(Constructor)
	 * @param name
	 */
	public Tiger_1054(String name) {
		super();
		this.name = name;
		tigerHungryStatus = false;
	}
	
	/*
	 * 이 동물이 밥을 먹었는지 아닌지에 대한 여부
	 * */
	public boolean checkHungryStatus() {
		
		if(tigerHungryStatus) {
			System.out.println(this.name + "은(는) 배가 부릅니다.");
		}
		else {
			System.out.println(this.name + "은(는) 배가 고픕니다.");
		}
		return tigerHungryStatus;
	}

	/**
	 * tigerHungryStatus Getter
	 * @return the tigerHungryStatus
	 */
	public static boolean isTigerHungryStatus() {
		return tigerHungryStatus;
	}

	/**
	 * tigerHungryStatus Setter
	 * @param tigerHungryStatus the tigerHungryStatus to set
	 */
	public static void setTigerHungryStatus(boolean tigerHungryStatus) {
		Tiger_1054.tigerHungryStatus = tigerHungryStatus;
	}

	/**
	 * name Getter
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name Setter
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
