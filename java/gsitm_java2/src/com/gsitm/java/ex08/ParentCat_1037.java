package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ParentCat_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김진우
* @프로그램 설명           : 어미고양이
*/
public class ParentCat_1037 {
	private String color;
	public String hand;
	public String leg;
	public String shoulder;
	
	public ParentCat_1037() {
		setColor("black");
		hand = "hand";
		leg = "leg";
		shoulder = "shoulder";
	}
	
	public void cry() {
		System.out.println("냐옹");
	}
	
	private void steal() {
		System.out.println("훔치다");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
