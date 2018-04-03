package com.gsitm.java.ex10;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: People.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 이상훈
* @프로그램 설명			: 사람 메인메서드
*/
public class People implements Clothes_1056, Shose_1056{

	@Override
	public void throwShose() {
		// TODO Auto-generated method stub
		System.out.println("사람이 신발을 던집니다.");
	}

	@Override
	public void tearClothes() {
		// TODO Auto-generated method stub
		System.out.println("사람이 옷을 찢습니다.");
	}
	
	public static void main(String[] args) {
		People people = new People();
		System.out.println(Shose_1056.SHOSE_SIZE);
		System.out.println(Clothes_1056.CLOTHES_SIZE);
		people.putOnShose();			// 디폴트 메서드
		Clothes_1056.putOnClothes();	// 스태틱 메서드
		people.tearClothes();			// 구현
		people.throwShose();			// 구현
	}
}
