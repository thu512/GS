package com.gsitm.java.ex05;

public class Human_1051 {
	public static void main(String[] args) {
		Tv_1051 tvState = new Tv_1051();
		System.out.println("�������� ���� : "+tvState.state);
		RemoteCon_1051 remote = new RemoteCon_1051();
		System.out.println("����� �������� ��� tv ���¸�"+remote.remoteOnOff()+"�߽��ϴ�.");
	}
}
