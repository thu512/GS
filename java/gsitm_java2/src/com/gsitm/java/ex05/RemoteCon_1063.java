package com.gsitm.java.ex05;

import java.util.Scanner;

public class RemoteCon_1063 {
	private Tv_1063 tv;
	int turn;
	Scanner sc;
	public RemoteCon_1063() {
		this.tv = new Tv_1063();
		this.turn = 0;
		this.sc = new Scanner(System.in);
	}
	//현재 전원 알아주는 메소드
	public boolean switchpower() {
		this.tv.setPower(!(this.tv.isPower()));
		System.out.println("현재 파워는"+this.tv.isPower()+"입니다.");
		return this.tv.isPower();
	}
	//tv전원 키고 끄는 메소드
	public void turnpower() {
		while(true) {
			System.out.println("전원을 키려면 1을 끄려면 0을 눌러주세요.");
			turn = sc.nextInt();
			if(turn==1) {
				this.switchpower();
			}else if(turn==0) {
				System.out.println("티비를안봅니다.");
				break;
			}else {
				System.out.println("없는버튼입니다.");
			}
		}
	}
}
