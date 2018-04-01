package com.gsitm.practice.ex02;
import java.util.Scanner;


public class ScannerFor_1040 {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		int a=0;
		
		try {
		System.out.println("정수를 입력하세요.");
		a= scanner.nextInt();
		}catch(Exception e){
		 System.out.println("정수를 입력하세요...ㅎㅎ");
		}finally {
			System.out.println("입력받은 값: " +a);
			int b= Math.abs(a);
		for(int i=0; i<b; i++) {
			System.out.print("#");
		}
		scanner.close(); // 인스턴스를 삭제해주는 것  입출력은 그래서 try catch로 해줘야함
		}
	}

}
