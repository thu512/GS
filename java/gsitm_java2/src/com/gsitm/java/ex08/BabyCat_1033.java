package com.gsitm.java.ex08;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : BabyCat_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @�ۼ���            : ������
 * @���α׷� ����                : �Ʊ����� Ŭ���� - ��������� Ŭ������ ��ӹ���. cry()�޼ҵ� �������̵���. ���� ��ġ.
 */
public class BabyCat_1033 extends MommyCat_1033 {
	
	@Override
	public void cry() {
		System.out.println("����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MommyCat_1033 mom = new MommyCat_1033();
		BabyCat_1033 baby = new BabyCat_1033();
		mom.cry();
		baby.cry();
	}

}