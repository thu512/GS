package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : CatChild_1049.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 오병준
* @프로그램 설명           : 고양이자식
*/
public class CatChild_1049 extends CatMom_1049{
	
	@Override
	public void crying() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		CatMom_1049 catMom = new CatMom_1049();
		CatChild_1049 catCild = new CatChild_1049();
		catMom.crying();
		catCild.crying();

	}//end main()

}//end Class
