package com.gsitm.java.ex05;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Human_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 3. 30.
 * @작성자			: 차주현
 * @프로그램 설명		:
 */
public class Human_1072 {
	private RemoteCon_1072 con;
	/**
	 * @param con
	 */
	Human_1072(RemoteCon_1072 con) {
		this.con = con;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		방법 1.
		Tv_1072 tv = new Tv_1072();
		RemoteCon_1072 con1 = new RemoteCon_1072(tv);
//		방법 2.
//		RemoteCon_1072 con2 = new RemoteCon_1072();
		
		Human_1072 human = new Human_1072(con1);
		human.turnOnUsingCon();
		
	}
	
	public void turnOnUsingCon() {
		this.getCon().turnOnTv();
	}
	public RemoteCon_1072 getCon() {
		return con;
	}
}
