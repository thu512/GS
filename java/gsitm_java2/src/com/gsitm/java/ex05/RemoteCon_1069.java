package com.gsitm.java.ex05;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: RemoteCon_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 조현우
* @프로그램 설명			: 리모콘 클레스 TV 상태를 바꿔준다.
*/
public class RemoteCon_1069 {
	public boolean changePower(Tv_1069 tvState) {
		if(tvState.state == true) {
			tvState.state = false;
			return tvState.state;
		} else {
			tvState.state = true;
			return tvState.state;
		}
		
	}
}