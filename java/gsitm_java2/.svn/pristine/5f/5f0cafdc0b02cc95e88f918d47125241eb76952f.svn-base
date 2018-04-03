package com.gsitm.java.ex06;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: Lion_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 3. 30. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 사자에 대한 클래스
*/
public class Lion_1054 {

	private static boolean lionHungryStatus;
	
	
	private String name ="사돌이";


	/**
	 * 생성자(Constructor)
	 */
	public Lion_1054() {
		super();
		lionHungryStatus = false;
	}


	/**
	 * 생성자(Constructor)
	 * @param name
	 */
	public Lion_1054(String name) {
		super();
		this.name = name;
		lionHungryStatus = false;
	}
	
	/*
	 * 이 동물이 밥을 먹었는지 아닌지의 여부
	 * @return boolean
	 * */
	public boolean checkHungryStatus() {
		
		if(lionHungryStatus) {
			System.out.println(this.name + "은(는) 배가 부릅니다.");
		}
		else {
			System.out.println(this.name + "은(는) 배가 고픕니다.");
		}
		return lionHungryStatus;
	}


	/**
	 * lionHungryStatus Getter
	 * @return the lionHungryStatus
	 */
	public static boolean isLionHungryStatus() {
		return lionHungryStatus;
	}


	/**
	 * lionHungryStatus Setter
	 * @param lionHungryStatus the lionHungryStatus to set
	 */
	public static void setLionHungryStatus(boolean lionHungryStatus) {
		Lion_1054.lionHungryStatus = lionHungryStatus;
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
