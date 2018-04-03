package com.gsitm.java.ex08;

public class OverrideExample_1075 {
	public static void main(String[] args) {
		Cat_1075 cat = new Cat_1075();
		cat.cry();
		cat.setColor("Yellow");
		System.out.println("설정한 값 받기 ; Cat.getColor() : " + cat.getColor());
		
		
		Kitten_1075 kitten = new Kitten_1075();
		kitten.cry();
		System.out.println("초기값 받기 : kitten.getColor() : " + kitten.getColor());
		kitten.setColor("Orange");
		System.out.println("변경하고 받기 : kitten.getColor() : " + kitten.getColor());
	}
}
