package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 강혜정
* @프로그램 설명           : 리모콘 전원을 켤 클래스 
*/
public class RemoteCon_1028 {
	Tv_1028 tvP;

		
	public RemoteCon_1028(){
		tvP = new Tv_1028();		
	}
	
	public boolean powerOn() {
		System.out.println("remoteCon 클래스 실행 : 전원을 켰습니다.");
		tvP.setPower(true);
		if(tvP.getPower()==true) {
			System.out.println("TV 켜졌음");
		}
		return true; 
	}
}
