package com.gsitm.java.ex09;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: EditPlus_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 4. 3. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 에디트 플러스
*/
public class EditPlus_1054 extends NotePad_1054{

	@Override
	protected void additionalFunction() {
		
		boolean loopFlag = false;
		Scanner sc = null;

		int inputs = 0;
		try {
			
			sc = new Scanner(System.in);
			
			while(!loopFlag) {
				System.out.println("[1] FTP");
				System.out.println("[2] Build");

				inputs = sc.nextInt();

				if(inputs == 1) {
					System.out.println("FTP를 진행합니다.");
				}
				else if(inputs == 2) {
					System.out.println("Build를 진행합니다.");
				}
				else {
					System.out.println("종료를 합니다.");
				}
				loopFlag = !loopFlag;
			}
		}catch(InputMismatchException e) {
			System.err.println("숫자만 입력해주세요.");
			e.toString();
		}finally {
			System.out.println(" 프로그램을 종료합니다");
			sc.close();
		}
	}

}
