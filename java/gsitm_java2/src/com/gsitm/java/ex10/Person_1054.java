package com.gsitm.java.ex10;

import java.lang.ref.WeakReference;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: Person_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 4. 3. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 
*/
public class Person_1054 implements Shoes_1054, Clothes_1054{

	public static void main(String[] args) {
	
		Person_1054 person = new Person_1054();
		
		System.out.println("신발 사이즈 : " + shoeSize);
		System.out.println("옷 사이즈 : " + clothSize);
		
		person.wearShoes();
		person.throwShoes();
		
		Clothes_1054.wearClothes();
		person.tearClothes();
	}

	@Override
	public void tearClothes() {
		System.out.println("아싸 옷을 찢는다.");
	}

	@Override
	public void throwShoes() {
		System.out.println("아싸 신발을 던진다.");
	}

}
