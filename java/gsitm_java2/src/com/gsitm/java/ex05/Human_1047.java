package com.gsitm.java.ex05;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Human_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ����� �������� ���� ������ Ű�� ���� �� ����� �ش��ϴ� Ŭ����.
 */
public class Human_1047 {
	public Human_1047() {
		
	}
	
	public void turnOnRemote(RemoteCon_1047 rmc) {
		rmc.turnOn();
	}
	public static void main(String args[]) {
		Human_1047 human = new Human_1047();
		Tv_1047 tv = new Tv_1047();
		RemoteCon_1047 remocon = new RemoteCon_1047(tv);
		human.turnOnRemote(remocon);
		human.turnOnRemote(remocon);
	}
}
