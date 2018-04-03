package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : person_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박소현
* @프로그램 설명           : 사람클래스 
*/
public class person_1042 implements shoes_1042, clothes_1042{

	@Override
	public void tearing() {
		// TODO Auto-generated method stub
		System.out.println("옷 찢어 뿌셔");
	}

	@Override
	public void throwing() {
		// TODO Auto-generated method stub
		System.out.println("신발 던져 에이 몰라");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person_1042 person = new person_1042();
		
		// 신발, 옷 사이즈 출력
		System.out.println("신발사이즈 = " + person.SIZE_SHOES + ", 옷 사이즈 = " + person.SIZE_CLOTHES);
		
		// 모든 메소드 출력
		person.wearing_shoes();
		// 정적메소드는 객체로 바로 호출
		clothes_1042.wearing_clothes();
		
		// 오버라이딩한 메소드 출력
		person.throwing();
		person.tearing();
		
	}

}
