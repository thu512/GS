package com.gsitm.java.ex05;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Tv_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ����� �������� �̿��Ͽ� Ƽ�� Ű�� ������ Ƽ��
 */
public class Tv_1047 {
	boolean power;
	int sound;
	int channel;
	public Tv_1047() {
		this.power = false;
		this.sound = 10;
		this.channel = 7;
	}
	
	public void turnOn() {
		power = !power;
		System.out.println(power);
	}
}
