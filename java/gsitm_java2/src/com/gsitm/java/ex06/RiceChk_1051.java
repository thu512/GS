package com.gsitm.java.ex06;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : RiceChk_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 30.
 * @�ۼ���            : �����
 * @���α׷� ����      		: �����鿡�� ���� �Կ�����, �ȸԿ����� Ȯ���ϴ� Ŭ����
 */
public class RiceChk_1051 {

	public void feedCheck(Animal_1051 animal) {
		if(animal.lionchk) {
			System.out.println("���ڰ� ���� �Ծ����ϴ�.");
		}else {
			System.out.println("���ڰ� ���� �ȸԾ����ϴ�.");
			animal.lionchk = true;
		}
		
		if(animal.tigerchk) {
			System.out.println("ȣ���̰� ���� �Ծ����ϴ�.");
		}else {
			System.out.println("ȣ���̰� ���� �ȸԾ����ϴ�.");
			animal.tigerchk = true;
		}
	}
}
