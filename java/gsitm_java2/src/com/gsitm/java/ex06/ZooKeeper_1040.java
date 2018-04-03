package com.gsitm.java.ex06;

public class ZooKeeper_1040 {

	public static void main(String[] args) {

		checkTiger();
		checkLion();
		feedTiger();
		feedLion();
		
		
	}

	static void checkTiger(){
		if(Tiger_1040.tigerFull==true) {	
			System.out.println("호랑이는 밥을 먹었어요.");	
		}else {
			System.out.println("호랑이는 굶었어요.");
		}
	}

	static void checkLion(){
		if(Lion_1040.lionFull==true) {	
			System.out.println("사자는 밥을 먹었어요.");	
		}else {
			System.out.println("사자는 굶었어요.");
		}
	}
	static void feedTiger(){
		if(Tiger_1040.tigerFull==false) {	
			System.out.println("호랑이에게 밥을 줍니다.");
			Tiger_1040.tigerFull=true;
		}else {
			System.out.println("호랑이는 이미 밥을 먹었어요.");
		}
	}
	
	static void feedLion(){
		if(Lion_1040.lionFull==false) {	
			System.out.println("사자에게 밥을 줍니다.");
			Lion_1040.lionFull=true;
		}else {
			System.out.println("사자는 이미 밥을 먹었어요.");
		}
	}

}
