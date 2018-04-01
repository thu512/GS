package com.gsitm.practice.ex03;
import java.util.Scanner;

//toUpperCase
public class ScannerUpper_1040 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String a=" ";
		
		try{
		System.out.println("영문자를 입력하세요: ");	
		a= scanner.nextLine();
		char aa=a.charAt(0);
		if(aa<65 || aa>122) {
			throw new Exception("영문자가 아닙니다.");
			}
		}
		catch(Exception e){
			System.out.println("올바른 입력이 아닙니다.");
		}finally {	
			
			if(a.length()>=2) {
			a= a.substring(0, 1);	
			}
			String b= a.toUpperCase();
			System.out.println("변환된 영문자: "+ b);
						
		}
		
	}

}
