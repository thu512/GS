package com.gsitm.java.ex05;

import java.util.InputMismatchException;
import java.util.Scanner;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 주형진
* @프로그램 설명           : TV 전원 On/Off 프로그램
*/
public class Human_1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("tv를 키시겠습니까?(true/false)");
			boolean onOff = sc.nextBoolean();
			RemoteCon_1070 remocon = new RemoteCon_1070(onOff);
			if(remocon.switchOnOff()) {
				Tv_1070 TV = new Tv_1070();
				TV.TvWatching();
			} 
		} catch(InputMismatchException ie) {
			System.out.println("리모컨을 제대로 작동시켜주세요.");
		} 
	}
}

class Tv_1070{
	Tv_1070(){
		System.out.println("TV전원이 켜졌습니다.");
	}
	void TvWatching() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("tv 시청중... tv를 끄시겠습니까?(true/false)");
			try {
				boolean onOff = sc.nextBoolean();
				if(onOff) {
					System.out.println("tv 전원이 꺼졌습니다.");
					break;
				}
			} catch(InputMismatchException ie) {
				System.out.println("리모컨을 제대로 작동시켜주세요.");
				break;
			}
		}
	}
}

class RemoteCon_1070{
	private boolean power;
	RemoteCon_1070(boolean onOff){
		power = onOff;
	}
	boolean switchOnOff() {
		return power;
	}
}