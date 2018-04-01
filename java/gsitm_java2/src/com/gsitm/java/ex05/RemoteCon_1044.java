/**
 * 
 */
package com.gsitm.java.ex05;

/**
 *    @과목명 : GS ITM 인턴사원 자바교육  @FileName : RemoteCon_10.java  @Project :
 * gsitm_java2  @Date : 2018. 3. 30.   @작성자 : 성동원  @프로그램 설명 : 
 */
public class RemoteCon_1044 {

	
	public boolean onPower(Boolean power) {
		if (power == true) {
			System.out.println("전원 켜져있어");
			return true;
		} else {
			System.out.println("전원 꺼져있어");
			return false;
		}
	}

}
