package com.gsitm.java.ex05;

public class Human_1042 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteCon_1042 remoteCon1 = new RemoteCon_1042();
		
		remoteCon1.onoffTv(true);
		remoteCon1.status();
		
		System.out.println("----------------------------");
		
		RemoteCon_1042 remoteCon2 = new RemoteCon_1042();
		
		remoteCon2.onoffTv(false);
		remoteCon2.status();
		
	}

}
