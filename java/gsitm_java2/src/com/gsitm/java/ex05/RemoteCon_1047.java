package com.gsitm.java.ex05;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : RemoteCon_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ����� �������� �̿��Ͽ� Ƽ�� Ű�� ���� �� ������.
 */
public class RemoteCon_1047 {
	boolean power;
	Tv_1047 targetTv;
	public RemoteCon_1047(Tv_1047 tv) {
		this.power = false;
		targetTv = tv; 
	}
	
	public void turnOn() {
		this.power = true;
		targetTv.turnOn();
	}
	
	public void controlTv() {
		
	}
}
