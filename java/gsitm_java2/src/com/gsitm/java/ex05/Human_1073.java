package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 채유진
* @프로그램 설명           : tv전원 실습 human
*/
public class Human_1073 {

	public static void main(String[] args){
		RemoteCon_1073 rc = new RemoteCon_1073();
		boolean isPowerOn = rc.powerOnOff(new Tv_1073());
		System.out.println(isPowerOn);
	}
}
