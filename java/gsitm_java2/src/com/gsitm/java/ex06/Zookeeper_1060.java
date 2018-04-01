package com.gsitm.java.ex06;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Zookeeper.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 이창주
* @프로그램 설명       : 사육사 클래스 -> 호랑이 사자 밥먹었는지 체크
*/
public class Zookeeper_1060 {
	
	public boolean checkFull(Object zoo) {
		if(zoo instanceof Lian_1060) {
			if(Lian_1060.isFull()) {
				System.out.println("사자는 배가 부릅니다.");
			}else {
				System.out.println("사자는 배가 고픕니다.");
			}
			return Lian_1060.isFull();
		}else if(zoo instanceof Tiger_1060) {
			if(Tiger_1060.isFull()) {
				System.out.println("호랑이는 배가 부릅니다.");
			}else {
				System.out.println("호랑이는 배가 고픕니다.");
			}
			return Tiger_1060.isFull();
		}
		return false;
	}
	
	public void giveRice(Object zoo) {
		if(zoo instanceof Lian_1060) {
			Lian_1060.setFull(true);
			System.out.println("사자에게 밥을 주었습니다.");
		}else if(zoo instanceof Tiger_1060) {
			Tiger_1060.setFull(true);
			System.out.println("호랑이에게 밥을 주었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zookeeper_1060 zk = new Zookeeper_1060();
		
		
		Lian_1060 lian = new Lian_1060();	
		Tiger_1060 tiger = new Tiger_1060();
		
		if(!zk.checkFull(lian)) {
			zk.giveRice(lian);
			zk.checkFull(lian);
		}
		
		
		if(!zk.checkFull(tiger)) {
			zk.giveRice(tiger);
			zk.checkFull(tiger);
		}
		
	}

}
