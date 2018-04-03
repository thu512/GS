package com.gsitm.java.ex09;
/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자              : 이창주
* @프로그램 설명       : 에딧플러스 자식 클래스
*/
public class EditPlus_1060 extends Memojang_1060{

	@Override
	public void option() {
		// TODO Auto-generated method stub
		System.out.println("FTP");
		System.out.println("빌드");
	}
	
	public static void main(String[] args) {
		EditPlus_1060 ep = new EditPlus_1060();
		ep.option();
		
	}
}
