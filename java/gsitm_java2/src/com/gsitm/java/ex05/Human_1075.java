package com.gsitm.java.ex05;

import java.util.Scanner;

/**
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ScannerUpper_1075.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 30.
 * @작성자			: 최영롱
 * @프로그램 설명	: main 함수에서 리모컨 전원을 키고 끄는 것
 */
public class Human_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv_1075 tv = new Tv_1075();
		tv.setPower(false);//초기값 꺼져있음
		
		RemoteCon_1075 remoteCon = new RemoteCon_1075();
		//키기
		boolean onOffResult = remoteCon.powerSwitch(tv);
		System.out.println(onOffResult);
		//끄기
		onOffResult = remoteCon.powerSwitch(tv);
		System.out.println(onOffResult);
	}
}
