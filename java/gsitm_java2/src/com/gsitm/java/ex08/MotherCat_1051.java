package com.gsitm.java.ex08;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : MotherCat_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @�ۼ���            : �����
 * @���α׷� ����      		: ��Ӵ� ����� Ŭ���� �Դϴ�.
 */
public class MotherCat_1051 {
	private String haircolor;
	public String arm, leg, shoulder;
	String cry = "�Ŀ�";
	
	public String getHaircolor() {
		return haircolor;
	}

	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}
	
	public void crying() {
		System.out.println(cry);
	}
	
	private void steal() {
		System.out.println("��ġ��");
	}
}
