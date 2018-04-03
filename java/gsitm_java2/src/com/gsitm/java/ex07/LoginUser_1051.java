package com.gsitm.java.ex07;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : LoginUser_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 2.
 * @�ۼ���            : �����
 * @���α׷� ����      		: �̱��� ������ �̿��Ͽ� Ŭ���� ����
 */
public class LoginUser_1051 {
	private String name;
	private String sabun;
	private String power;
	private static LoginUser_1051 singleton = new LoginUser_1051();
	
	private LoginUser_1051() {}
	
	static LoginUser_1051 getInstance() {
		return singleton;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	
}
