package com.gsitm.java.ex04;

import java.util.*;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1028.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 강혜정
* @프로그램 설명           : 
*/
public class ScannerMoney_1028 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int money=sc.nextInt();
		int arr[] = {0,0,0,0,0,0,0,0};
		
		while(money>=50000)
		{
			arr[0]++;
			money-=50000;
		}
		while(money>=10000)
		{
			arr[1]++;
			money-=10000;
		}
		while(money>=1000)
		{
			arr[2]++;
			money-=1000;
		}
		while(money>=500)
		{
			arr[3]++;
			money-=500;
		}
		while(money>=100)
		{
			arr[4]++;
			money-=100;
		}
		while(money>=50)
		{
			arr[5]++;
			money-=50;
		}
		while(money>=10)
		{
			arr[6]++;
			money-=10;
		}
		while(money>=1)
		{
			arr[7]++;
			money-=1;
		}
		
		System.out.println("50000원 : "+arr[0]+"개");
		System.out.println("10000원 : "+arr[1]+"개");
		System.out.println("1000원 : "+arr[2]+"개");
		System.out.println("500원 : "+arr[3]+"개");
		System.out.println("100원 : "+arr[4]+"개");
		System.out.println("50원 : "+arr[5]+"개");
		System.out.println("10원 : "+arr[6]+"개");
		System.out.println("1원 : "+arr[7]+"개");
	}
}

