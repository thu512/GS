package com.gsitm.java.ex06;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : ZooKeeper_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 30.
 * @�ۼ���            : �����
 * @���α׷� ����      		: �����簡 ���� �Ծ����� Ȯ���ϴ� ������.
 */
public class ZooKeeper_1051 {

	public static void main(String[] args) {
		RiceChk_1051 chk = new RiceChk_1051();

		System.out.println("���� : " + Animal_1051.lionchk);
		System.out.println("ȣ���� : " + Animal_1051.tigerchk);
		
		// feedCheck �Լ��� ���� �������� �������� ���� ���δ�.
		chk.feedCheck(new Animal_1051());
		
		System.out.println("���� : " + Animal_1051.lionchk);
		System.out.println("ȣ���� : " + Animal_1051.tigerchk);
		
		
	}
}
