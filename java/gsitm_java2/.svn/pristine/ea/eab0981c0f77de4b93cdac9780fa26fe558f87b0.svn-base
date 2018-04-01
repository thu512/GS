package com.gsitm.java.ex05;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1067.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 조국
* @프로그램 설명           : RemoteCon 클래스
*/
public class RemoteCon_1067 {
	private Tv_1067 tv;
	private Scanner scan;
	private int inputValue;
	
	public RemoteCon_1067() {
		System.out.println("Tv 객체 생성");
		this.tv = new Tv_1067();
		this.scan = new Scanner(System.in);
		this.inputValue = 0;
	}
	
	public boolean switchPower() {
		this.tv.setPower(!this.tv.isPower());
		System.out.println("현재 tv의 상태는 " + this.tv.isPower());
		
		return this.tv.isPower();
	}

	public void pickupRemote() {
		System.out.println("리모컨을 조작합니다(1: 전원, 2 종료)");
		
		label: while(true) {
			this.inputValue = scan.nextInt();
			
			switch (inputValue) {
			case 1:
				this.switchPower();
				break;
			case 2:
				System.out.println("TV를 안봅니다.");
				break label;
			default:
				System.out.println("리모컨에 없는 버튼입니다ㅠ");
				break;
			}
		}
	}
}
