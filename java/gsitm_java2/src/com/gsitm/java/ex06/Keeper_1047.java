package com.gsitm.java.ex06;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : Keeper_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @�ۼ���            : ������
 * @���α׷� ����                : ������� ���� ȣ����, ������� checkTheEating�� ���� ���޹��� ��ü�� ȣ�������� ��������
 * 					   �Ǵ� ��, ��Ⱑ �� �������� �˾Ƴ���. �� �� if���� ���� ���� �ֵ��� �谡 ������ fooding�� ����
 * 					   ���̸� ���δ�.
 */
public class Keeper_1047 {

	boolean checkTheEating(Object obj) {//���޹��� ��ü�� ȣ�������� �������� �Ǻ���, ������ �������� ǥ����°� ���ÿ� ����.
		if(obj instanceof Tiger_1047) {// ��ü�� Tiger_1047�� ��ü�ΰ�?
			System.out.println(Tiger_1047.isEating);
			return Tiger_1047.isEating;//ȣ������ ����� ����.
		}else if (obj instanceof Rion_1047) {//��ü�� Rion_1047�� ��ü�ΰ�?
			System.out.println(Rion_1047.isEating);
			return Rion_1047.isEating;
		}
		return false;//syntax error ����.
		
	}
	
	void fooding(Object obj) {// ��ü���� ���̸� �ִ� �޼ҵ�.
		if(obj instanceof Tiger_1047) {//��ü�� ȣ�������� �Ǻ�
			((Tiger_1047) obj).eating();//��ü�� ȣ���̷� ����ȯ �� ȣ������ .eating�� ȣ��(���̸�����)
			System.out.println(Tiger_1047.isEating);
		}else if (obj instanceof Rion_1047) {//������ ���Ͱ��� ����.
			((Rion_1047) obj).eating();
			System.out.println(Rion_1047.isEating);
		}
	}
	
	public static void main(String[] args) {
		Keeper_1047 keeper = new Keeper_1047();
		Tiger_1047 tiger = new Tiger_1047();
		Rion_1047 rion = new Rion_1047();
		//�̱��� ��ü�� ����.
		
		if(!keeper.checkTheEating(tiger)) {//ȣ���̰� �谡 ���»����ΰ�? !������ ���.
			keeper.fooding(tiger);//�谡 ������ ���̸� ��.
		}
		if(!keeper.checkTheEating(rion)) {//���ڰ� �谡���°�?
			keeper.fooding(rion);//������� ���̸� ��.
		}
		
	}

}

class Tiger_1047{
	public static boolean isEating = false;
	void eating(){//���̸� ���� �޼ҵ�.
		this.isEating = true;
	}
}

class Rion_1047{
	public static boolean isEating = false;
	void eating(){
		this.isEating = true;
	}
}