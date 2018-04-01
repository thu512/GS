package com.gsitm.java.ex05;

public class Human_1051 {
	public static void main(String[] args) {
		Tv_1051 tvState = new Tv_1051();
		System.out.println("리모컨은 현재 : "+tvState.state);
		RemoteCon_1051 remote = new RemoteCon_1051();
		System.out.println("사람이 리모컨을 들고 tv 상태를"+remote.remoteOnOff()+"했습니다.");
	}
}
