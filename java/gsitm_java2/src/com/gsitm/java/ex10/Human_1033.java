package com.gsitm.java.ex10;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Human_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @�ۼ���            : ������
 * @���α׷� ����                : �Ź߰� �� �������̽��� �����ϴ� ����Ŭ����.
 */
public class Human_1033 implements Shoes_1033, Clothes_1033 {
	
	public void throwTheShoes() {
		System.out.println("�Ź� ����");
	}
	
	public void tearTheClothes() {
		System.out.println("�� ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_1033 me = new Human_1033();
		System.out.println("�Ź� ������� " + me.SHOES_SIZE);
		System.out.println("�� ������� " + me.CLOTHES_SIZE);
		me.putOnTheShoes();
		me.throwTheShoes();
		Clothes_1033.putOnTheClothes();
		me.tearTheClothes();
	}

}
