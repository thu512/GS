package com.gsitm.java.ex10;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Shoes_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @�ۼ���            : �����
 * @���α׷� ����      		: �Ź� �������̽� �Դϴ�. ��� ����, ����Ʈ �޼ҵ� ����, �߻�޼ҵ� ����
 */
public interface Shoes_1051 {
	int SIZE_SHOES = 260;
	
	default void shoesWear () {
		System.out.println("�Ź߽Ŵ�.");
	}
	
	void shoesThrow();
}
