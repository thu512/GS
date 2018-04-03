package com.gsitm.java.ex07;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : LoginUser_1033.java
 * @Project         : gsitm_java 
 * @Date            : 2018. 4. 2. 
 * @�ۼ���            : ������
 * @���α׷� ����                : �α��� ���� �̱���
 */
public class LoginUser_1033 {
	
	// ���� �ʵ�
	private static LoginUser_1033 singleton = new LoginUser_1033();
	private String name = null;
	private String eid = null;
	private String authority = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	// ������
	private LoginUser_1033() {
		
	}
	
	// ���� �޼ҵ�
	static LoginUser_1033 getInstance() {
		return singleton;
	}
}
