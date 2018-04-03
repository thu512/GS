package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손혜성
* @프로그램 설명           : 동물들 밥주기(사육사) 
*/
public class Trainer_1046 {
	Lion_1046 myLion;
	Tiger_1046 myTiger;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer_1046 jiwoo = new Trainer_1046();
		
		jiwoo.checkAte();
	}
	
	public Trainer_1046() {
		myLion = new Lion_1046();
		myTiger = new Tiger_1046();
	}
	
	public void checkAte() {
		if(!myLion.isAte()) {
			System.out.println("사자가 밥을 먹지않았습니다.");
			this.feedLion();
		}
		else {
			System.out.println("사자는 배가 부릅니다.");
		}
		if(!myTiger.isAte()) {
			System.out.println("호랑이가 밥을 먹지않았습니다.");
			this.feedTiger();
		}
		else {
			System.out.println("호랑이는 배가 부릅니다.");
		}
	}
	
	public void feedLion() {
		myLion.setAte(true);
		System.out.println("사자에게 밥을 주었습니다.");
	}
	
	public void feedTiger() {
		myTiger.setAte(true);
		System.out.println("호랑이에게 밥을 주었습니다.");
	}

}
