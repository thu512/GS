package com.gsitm.java.ex05;

import java.util.Scanner;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Human_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 이창주
* @프로그램 설명       : 휴먼 클래스
*/
public class Human_1060 {
	public static void main(String[] args) {
		RemoteCon_1060 rc = new RemoteCon_1060();
		Tv_1060 tv = Tv_1060.getInstance();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("tv전원");
			sc.nextLine();
			rc.powerOnOff(tv);
			System.out.println();
		}
		
	}
}
