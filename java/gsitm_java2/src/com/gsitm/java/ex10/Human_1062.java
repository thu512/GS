package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : Human.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 장동주
 * @프로그램 설명      : 구현객체입니다.
 */
public class Human_1062 implements Shoes_1062, Clothes_1062 {
	
	public static void main(String[] args) {
		Human_1062 human_1062= new Human_1062();
		
		System.out.println(Shoes_1062.shoeSize);
		System.out.println(Clothes_1062.clothSize);
		human_1062.wearShoes();
		human_1062.throwShoes();
		Clothes_1062.wearClothes();
		
		human_1062.tearClothes();
		
	}
	

	@Override
	public void tearClothes() {
		System.out.println("옷을 찠었습니다");
	}


	@Override
	public void throwShoes() {
		System.out.println("신발을 던졌습니다.");
	}

}
