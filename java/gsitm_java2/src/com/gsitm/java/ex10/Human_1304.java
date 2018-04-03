package com.gsitm.java.ex10;

/**
* <pre>
* 1. 패키지명 : com.gsitm.java.ex10
* 2. 타입명 : Human_1304.java
* 3. 작성일 : 2018. 4. 3. 오후 3:40:49
* 4. 작성자 : JongJoo
* 5. 설명 : 다중 인터페이스 황용하기.
* </pre>
*/
public class Human_1304 implements Clothes_1034,Shoes_1034{
	
	
	
	
	public static void main(String[] args) {
		Human_1304 h = new Human_1304();
		
		System.out.println("옷의 사이즈 : "+h.C_SIZE);
		System.out.println("신발 사이즈 : "+h.S_SIZE);
		h.throw2();
		h.tearClothes();
	}
	
	public void Human_1034() {
		
	}
	@Override
	public void throw2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		
	}
}
