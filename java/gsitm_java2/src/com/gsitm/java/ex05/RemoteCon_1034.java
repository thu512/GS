package com.gsitm.java.ex05;

/**
* <pre>
* 1. 패키지명 : com.gsitm.java.ex05
* 2. 타입명 : RemoteCon_1034.java
* 3. 작성일 : 2018. 3. 30. 오후 2:54:26
* 4. 작성자 : JongJoo
* 5. 설명 : 티비 키는 프로그램
* </pre>
*/
public class RemoteCon_1034 {
	
	Tv_1034 tv = new Tv_1034();
	public boolean on() {
		System.out.println("티비전원 on");
		return tv.check = true;
	}
	public boolean ofF() {
		System.out.println("티비전원 off");
		return tv.check = false;
	}
}
