package com.gsitm.java.ex05;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : Human_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 3. 30. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 리모컨 전원을 키다 메소드를 호출
*/
public class Human_1071 {
	
	void pressRemote(RemoteCon_1071 remote,Tv_1071 tv) {
		remote.turnOn(tv);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human_1071 human = new Human_1071();
		RemoteCon_1071 remoteCon = new RemoteCon_1071();
		Tv_1071 tv= new Tv_1071();
		
		human.pressRemote(remoteCon, tv);
		
		System.out.println(tv.power);

	}

}
