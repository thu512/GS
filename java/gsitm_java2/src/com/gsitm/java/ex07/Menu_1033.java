package com.gsitm.java.ex07;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Menu.java
 * @Project         : gsitm_java 
 * @Date            : 2018. 4. 2. 
 * @�ۼ���            : ������
 * @���α׷� ����                : �α��� ���� ���� ���
 */
public class Menu_1033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser_1033 user1 = LoginUser_1033.getInstance();
		user1.setName("������");
		System.out.println("�̸�: " + user1.getName());
		user1.setEid("1033");
		System.out.println("���: " + user1.getEid());
		user1.setAuthority("���");
		System.out.println("����: " + user1.getAuthority());
	}

}
