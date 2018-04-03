package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1041.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박민주
* @프로그램 설명           : 인간 클래스
*/
public class Human_1041 implements Clothes_1041, Shoes_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clothes_1041 clothes = new Human_1041();
		
		Clothes_1041.wearClothes();
		clothes.tearClothes();
		System.out.println("옷 사이즈:" + clothes.size);
		
		
		Shoes_1041 shoes = new Human_1041();
		
		shoes.wearShoes();
		shoes.throwShoes();
		System.out.println("신발 사이즈:" + shoes.size);
	}

	public void throwShoes() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던진다");
	}

	public  void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢다");
	}

}
