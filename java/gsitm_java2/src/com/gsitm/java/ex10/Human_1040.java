package com.gsitm.java.ex10;

public class Human_1040 implements Clothes_1040, Shoes_1040 {


	public void tearClothes() {
		System.out.println("���� �Ժη� �����ϴ�. ���� �����ϴ�.");
	}
	
	public void throwShoes() {
		System.out.println("�Ź��� �����ϴ�. �����ϼ���!");
	}
	
	
	public static void main(String[] args) {

		Human_1040 h1 = new Human_1040();	
		Clothes_1040.wearClothes();
		h1.wearShoes();

		System.out.println("�Ź߻�����: "+ Shoes_1040.SHOES_SIZE);
		System.out.println("�� ������: "+ Clothes_1040.SIZE);
		
		h1.tearClothes();
		h1.throwShoes();
		
		
	}

}
