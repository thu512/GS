package com.gsitm.java.ex10;

public class Human_1040 implements Clothes_1040, Shoes_1040 {


	public void tearClothes() {
		System.out.println("옷을 함부로 찢습니다. 돈이 많습니다.");
	}
	
	public void throwShoes() {
		System.out.println("신발을 던집니다. 조심하세요!");
	}
	
	
	public static void main(String[] args) {

		Human_1040 h1 = new Human_1040();	
		Clothes_1040.wearClothes();
		h1.wearShoes();

		System.out.println("신발사이즈: "+ Shoes_1040.SHOES_SIZE);
		System.out.println("옷 사이즈: "+ Clothes_1040.SIZE);
		
		h1.tearClothes();
		h1.throwShoes();
		
		
	}

}
