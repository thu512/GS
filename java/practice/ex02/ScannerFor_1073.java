package com.gsitm.practice.ex02;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1073.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 채유진
* @프로그램 설명           : ex02
*/
public class ScannerFor_1073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString=scanner.nextLine();
		int num = Integer.parseInt(inputString);
		
		for(int i=0; i<num;i++) {
			System.out.print('#');
		}
			
	}

}
