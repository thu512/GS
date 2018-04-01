package com.gsitm.java.ex04;
import java.util.Scanner;
/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1041.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 박민주
* @프로그램 설명           : 
*/
public class ScannerMoney_1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int z = 0;
		int i50000 = 0; //50,000원  
		int i10000 = 0; //10,000원
		int i1000 = 0;  //1,000원
		int i100 = 0;   //100원
		int i50 = 0;	//50원
		int i10 = 0;    //10원
		int i1 = 0;     //1원
		
		i50000 = i / 50000 ; 
		z = i % 50000;
		i10000 = z / 10000;
		z %= 10000;
		i1000 = z / 1000;
		z %= 1000;
		i100 = z / 100;
		z %= 100;
		i50 = z / 50;
		z %= 50;
		i10 = z / 10;
		i1 = z % 10;
		
		System.out.println("오만원권:" + i50000);
		System.out.println("만원권:" + i10000);
		System.out.println("천원권:" + i1000);
		System.out.println("백원:" + i100);
		System.out.println("오십원:" + i50);
		System.out.println("십원:" + i10);
		System.out.println("일원:" + i1);
	}

}
