package com.gsitm.java.ex07;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Menu_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 2.
 * @�ۼ���            : �����
 * @���α׷� ����      		: LoginUserŬ������ �����ϰ� ����,���� �̿� �ϴ� Ŭ����
 */
public class Menu_1051 {

	public static void main(String[] args) {
		LoginUser_1051 loginUser = LoginUser_1051.getInstance();
		LoginUser_1051 loginUser2 = LoginUser_1051.getInstance();
		//LoginUser_1051 loginUser3 = new LoginUser_1051();
		
		loginUser.setName("�����");
		loginUser.setSabun("1051");
		loginUser.setPower("���ϻ��");
		
		System.out.println(loginUser.getName());
		System.out.println(loginUser.getPower());
		System.out.println(loginUser.getSabun());
		
		System.out.println(loginUser2.getName());
		System.out.println(loginUser2.getPower());
		System.out.println(loginUser2.getSabun());
		
//		System.out.println(loginUser3.getName());
//		System.out.println(loginUser3.getPower());
//		System.out.println(loginUser3.getSabun());
	}
}
