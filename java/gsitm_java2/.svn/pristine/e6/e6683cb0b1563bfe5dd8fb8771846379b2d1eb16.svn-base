package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 조국
* @프로그램 설명           : 사육사 클래스(메인)
*/
public class Trainer_1067 {
	private Scanner scan;
	private int selectNum;
	
	public Trainer_1067() {
		this.scan = new Scanner(System.in);
		this.selectNum = 0;
	}
	
	public void init() {
		System.out.println("==========동물원 프로그램 실행==========");
		System.out.println("사자와 호랑이 모두 밥을 안 준 상태입니다.");
		System.out.println();
		this.feedTigerAndLion();
	}
	
	// 호랑이와 사자 밥 주기 메소드
	public void feedTigerAndLion() {
		System.out.println("사자와 호랑이 중 밥을 주고 싶은 동물을 선택하세요.");
		System.out.println("1: 사자, 2: 호랑이");
		
		this.selectNum = this.scan.nextInt();
		switch (this.selectNum) {
		case 1:
			System.out.println("사자에게만 밥을 줍니다.");
			System.out.println();
			Tiger_1067.setFeed(true);
			break;
		case 2:
			System.out.println("호랑이에게만 밥을 줍니다.");
			System.out.println();
			Lion_1067.setFeed(true);
			break;
		default:
			System.out.println("잘못된 입력이기 때문에 둘 다 굶었습니다ㅠ");
			System.out.println();
			break;
		}
	}
	
	public boolean checkedFeed() {
		if(Tiger_1067.isFeed() && Lion_1067.isFeed()){
			System.out.println("사자와 호랑이 모두 밥을 줬습니다.");
		} else {
			// 사자가 밥을 안먹었으면
			if(!Tiger_1067.isFeed()) {
				System.out.println("사자가 밥을 안먹었기 때문에 밥을 줍니다~");
				Tiger_1067.setFeed(!Tiger_1067.isFeed());
			}
			// 호랑이가 밥을 안먹었으면
			if(!Lion_1067.isFeed()) {
				System.out.println("호랑이가 밥을 안먹었기 때문에 밥을 줍니다~");
				Lion_1067.setFeed(!Lion_1067.isFeed());
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Trainer_1067 trainer = new Trainer_1067();
		
		trainer.init();
		
		if(trainer.checkedFeed()) {
			System.out.println("사자와 호랑이 모두 밥을 먹었습니다.");
		}
	}
}
