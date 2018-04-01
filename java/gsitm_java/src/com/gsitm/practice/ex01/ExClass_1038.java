package com.gsitm.practice.ex01;//path를 알려줌. default로 하면 협업이 불가능하기 때문에 사용하지 않음
//src - com - gsitm - practice - ex01 : hierarchy형태로 뽑아낸 형태
//도메인을 거꾸로 뒤집은 형태가 패키지 명. www는 생략

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1038.java 
* @Project             : gsitm_java 
* @Package             : com.gsitm.practice.ex01
* @Date                : 2018. 3. 28. 오전 10:54:57
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*/
public class ExClass_1038 {
	//public : 제약 없음. 아무데서나 가져다 사용 가능
	//private : 나 혼자 쓰겠다이므로 클래스를 만들때는 사용 불가능 but 생성자는 만들 수 있음
	//default : 
	public static void main(String[] args) {
		System.out.println("김효상");
		System.out.println();//sysout + ctrl + space
	}
}
// public > protected > default(선언 안한거) < private