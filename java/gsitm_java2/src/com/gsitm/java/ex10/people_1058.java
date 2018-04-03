package com.gsitm.java.ex10;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: people_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 4. 3. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class people_1058 implements clothes_1058, shoes_1058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people_1058 people = new people_1058();
		System.out.println(shoes_1058.size);
		System.out.println(clothes_1058.size);
		people.draw();
		people.tear();
		clothes_1058.wear();
		people.put();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("신발을 던지다.");
		
	}

	@Override
	public void tear() {
		// TODO Auto-generated method stub
		System.out.println("옷을 찢다.");
		
	}

}
