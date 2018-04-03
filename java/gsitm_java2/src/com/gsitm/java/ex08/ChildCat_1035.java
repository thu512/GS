package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ChildCat_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class ChildCat_1035 extends ParentCat_1035 {
	@Override
	public void cry() {
		System.out.println("����");
	}
	
	public static void main(String[] args) {
		ParentCat_1035 pc = new ParentCat_1035();
		ChildCat_1035 cc = new ChildCat_1035();
		System.out.println("��� ����� �� : "+pc.getHair());
		System.out.println("��� ����� �� : "+pc.isArm());
		System.out.println("��� ����� ��� : "+pc.isShoulder());
		pc.cry();
		
		System.out.println("���� ����� �� : "+cc.getHair());
		System.out.println("���� ����� �� : "+cc.isArm());
		System.out.println("���� ����� ��� : "+cc.isShoulder());
		cc.cry();
	
		
		
		
	}
}
