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
			System.out.println("ȣ���̴� ���� �Ծ����.");	
		}else {
			System.out.println("ȣ���̴� �������.");
		}
	}

	static void checkLion(){
		if(Lion_1040.lionFull==true) {	
			System.out.println("���ڴ� ���� �Ծ����.");	
		}else {
			System.out.println("���ڴ� �������.");
		}
	}
	static void feedTiger(){
		if(Tiger_1040.tigerFull==false) {	
			System.out.println("ȣ���̿��� ���� �ݴϴ�.");
			Tiger_1040.tigerFull=true;
		}else {
			System.out.println("ȣ���̴� �̹� ���� �Ծ����.");
		}
	}
	
	static void feedLion(){
		if(Lion_1040.lionFull==false) {	
			System.out.println("���ڿ��� ���� �ݴϴ�.");
			Lion_1040.lionFull=true;
		}else {
			System.out.println("���ڴ� �̹� ���� �Ծ����.");
		}
	}

}
