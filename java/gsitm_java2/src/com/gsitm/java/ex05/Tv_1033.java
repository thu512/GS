package com.gsitm.java.ex05;

public class Tv_1033 { //Tv��� ��ü(�繰)�� ����ž�!
	
	boolean isOn = false; //�����ִ� ������ �ʱ�ȭ
	
	public boolean getPower() {
		return isOn;
	}
	
	public void setPower(boolean isOn) {
		this.isOn = isOn;
		if(isOn == false) {
			isOn = true;
			System.out.println("����");
		}
		else {
			isOn = false;
			System.out.println("����");
		}
	}
}
