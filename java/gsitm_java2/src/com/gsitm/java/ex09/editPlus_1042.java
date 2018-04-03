package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : editPlus_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박소현
* @프로그램 설명           : 자식클래스(edit plus) 
*/
public class editPlus_1042 extends memo_1042 {

	@Override
	public void addOns() {
		// TODO Auto-generated method stub
		System.out.println("FTP 빌드");
		write();
		read();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		editPlus_1042 edit = new editPlus_1042();
		
		edit.addOns();
	}

}
