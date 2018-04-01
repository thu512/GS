package com.gsitm.java.ex04;
import java.util.Scanner;

public class ScannerMoney_1073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("금액을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int money = Integer.parseInt(inputString);

		int[] mArray= new int[8];
		int mNum=50000;
		for(int i=0; i<8;i++) {
			//짝수일때(오만원, 오백원, 50원)
			if(i%2==0) {
				if(mNum==5000) {
					i++;
					mNum = mNum/5;
					mArray[i]=0;
				}else {
				mArray[i]=money/mNum;
				money=money-mArray[i]*mNum;
				mNum = mNum/5; //5로 나눈 값
				}
			}
			//홀수일때 (만원, 천원, 백원, 10원)
			if(i%2==1) {
				mArray[i]=money/mNum;
				money=money-mArray[i]*mNum;
				mNum = mNum/2; //2로 나눈 값
			}
		}
		
		System.out.print("> 오만원권  "+mArray[0]+"개,");
		System.out.print("만원권  "+mArray[1]+"개,");
		System.out.print("천원권  "+mArray[3]+"개,");
		System.out.print("500원짜리 동전  "+mArray[4]+"개,");
		System.out.print("100원짜리 동전 "+mArray[5]+"개,");
		System.out.print("50원짜리 동전 "+mArray[6]+"개,");
		System.out.print("10원짜리 동전 "+mArray[7]+"개,");
		System.out.print("1원짜리 동전 "+money+"개"); //1원짜리는 그냥 잔돈으로 출력
	}

}
