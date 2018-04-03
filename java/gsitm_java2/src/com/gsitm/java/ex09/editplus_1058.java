package com.gsitm.java.ex09;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: editplus_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 4. 3. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class editplus_1058 extends memo_1058{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("자식 부가기능");
	}
	public void print() {
		super.read();
		super.write();
		this.add();
	}

    public static void main(String[] args) {
    	editplus_1058 edit = new editplus_1058();
    	edit.print();
    }
		
}
