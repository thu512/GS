package com.gsitm.java.ex08;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName         : BabyCat_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @�ۼ���            : �嵿��
 * @���α׷� ����      :  ��������̴� cry()�� �������Ͽ� ���޶�� ��ϴ�.
 */
public class BabyCat_1062 extends MomCat_1062{

	@Override
	public void cry() {
		System.out.println("����");
	}
	
	public void cry2() {
		super.cry();
	}
	

	
	public static void main(String[] args) {
		BabyCat_1062 babyCat_1062= new BabyCat_1062();
		babyCat_1062.cry();
		babyCat_1062.cry2();
		
		
	}
	
}
