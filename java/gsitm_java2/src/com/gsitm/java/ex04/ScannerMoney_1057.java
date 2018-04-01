package com.gsitm.java.ex04;
import java.util.Scanner;
/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : ScannerMoney_1057.java 
* @Project              : gsitm_java2 
* @Date                 : 2018. 3. 28. 
* @작성자                 : 이융성
* @프로그램 설명            : 키보드에 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원 동적, 100원 동전
                          50원 동전, 10원 동전, 1원 동전 각 몇개로 변환 되는가?
*/     
public class ScannerMoney_1057 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50000,10000,1000,500,100,50,10,1};
		int[] res = {0,0,0,0,0,0,0,0};
		int idx = 0;
		System.out.print("돈을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		for (int val : arr) {
			while(true) {
				if (money>=val) {
					money = money-val;
					res[idx]+=1;
				}
				else {
					idx++;
					break;
				}
			}
		}
		System.out.println("5만원권 : "+res[0]+" 1만원권 : "+res[1]+" 1000원권 : "+res[2]+" 500원 : "+res[3]+" 100원 : "+res[4]+" 50원 : "+res[5]+" 10원 : "+res[6]+" 1원 : "+res[7]);
	}
}
