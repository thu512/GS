package com.gsitm.java.ex08;

public class ParentsCat_1040 {

	public String body = "어미고양이몸";
	public String arms = "어미고양이팔";
	public String legs = "어미고양이다리";
	
	private String color= "Gray";
	
	
	public ParentsCat_1040() {
		
	}
	
	public void cry() {
		System.out.println("냐옹");
	}
	
	private void steal() {
		System.out.println("마음을 훔쳤습니다.");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
