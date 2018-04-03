package com.gsitm.java.ex06;

import java.util.Scanner;

public class Trainer_1054 {

	private static boolean zooTutorialFlag = true;

	static Scanner sc = new Scanner(System.in);
	static Lion_1054 lion = null;
	static Tiger_1054 tiger = null;
	
	public static void main(String[] args) {



		do{

			startZooIntro();



		}while(zooTutorialFlag);


	}
	private static void startZooIntro() {

		int selectorInput;

		System.out.println("동물원에 오신것을 환영합니다!");
		System.out.println("사육사는 어떤 행동을 할까요?");
		System.out.println("[1]\t사자의 상태를 본다");
		System.out.println("[2]\t호랑이의 상태를 본다");
		System.out.println("[3]\t둘다 확인한다");
		System.out.println("[4]\t종료한다");

		selectorInput = sc.nextInt();

		lookOverSelection(selectorInput);
	}
	private static void lookOverSelection(int selectorInput) {

		switch(selectorInput) {

		case 1: lookAnimal("lion");
		break;
		case 2: lookAnimal("tiger");
		break;
		case 3: lookAnimal("all");
		break;
		case 4: zooTutorialFlag = !zooTutorialFlag;
		break;
		default :
			System.out.println("항목이 없습니다 입력을 확인해주세요");
			break;
		}
	}
	private static void lookAnimal(String target) {

		switch(target) {
		case "lion" : getLionStatus();
			break;
		case "tiger" : getTigerStatus();
			break;
		case "all" : getAllStatus();
			break;
		default :
			System.out.println("에러가 발생했습니다.");
			break;
		}

	}
	private static void getTigerStatus() {
		if(tiger == null) {
			tiger = new Tiger_1054();
		}
		tiger.checkHungryStatus();
		feedTigerProcess();
	}
	private static void getLionStatus() {
		if(lion == null) {
			lion = new Lion_1054();
		}
		lion.checkHungryStatus();
		feedLionProcess();
	}
	private static void getAllStatus() {
		getTigerStatus();
		getLionStatus();
		
	}
	
	private static void feedLionProcess() {
		System.out.println("밥을 주시겠습니까?");
		System.out.println("[1]\t예");
		System.out.println("[2]\t아니오");
		int temp = sc.nextInt();
		if(temp==1) {
			Lion_1054.setLionHungryStatus(true);
			lion.checkHungryStatus();
		}
	}
	private static void feedTigerProcess() {
		System.out.println("밥을 주시겠습니까?");
		System.out.println("[1]\t예");
		System.out.println("[2]\t아니오");
		int temp = sc.nextInt();
		if(temp==1) {
			Tiger_1054.setTigerHungryStatus(true);
			tiger.checkHungryStatus();
		}
	}
	
}
