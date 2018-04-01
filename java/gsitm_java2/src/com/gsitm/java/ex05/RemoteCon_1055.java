package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 이경화
* @프로그램 설명           : remotecon
*/
public class RemoteCon_1055 {
	
	public RemoteCon_1055() {
		
	}
	
	public boolean pressPower() {
		if(Tv_1055.power == false) Tv_1055.power = true;
		else Tv_1055.power = false;
		
		return Tv_1055.power;
	}	

}
