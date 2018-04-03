package com.gsitm.java.ex10;

public class Person_1057 implements Shoes_1057,Clothes_1057 {
	
	public static void main(String[] args) {
		Person_1057 person = new Person_1057();
		person.throwShoes();
		person.tearClothes();
		System.out.println(person.CLOTHES_SIZE);
		System.out.println(person.SHOES_SIZE);
	}
	
	public void throwShoes() {
		System.out.println("Throw the Shoes");
	}
	public void tearClothes() {
		System.out.println("Tear the Clothes");
	}
}
