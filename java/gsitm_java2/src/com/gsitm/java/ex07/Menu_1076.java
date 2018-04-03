package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Menu_1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 최준우
* @프로그램 설명           : 싱글턴 생성
*/
public class Menu_1076 {

		
		public static void main(String[] args) {
			System.out.println("start");
			LoginUser_1076 obj1 = LoginUser_1076.getInstance();  //getInstance를 통해 obj1 객체 생성
			LoginUser_1076 obj2 = LoginUser_1076.getInstance();  //getInstance를 통해 obj2 객체 생성
			
			if(obj1==obj2) {  // 객체가 같은지 비교
				System.out.println("같은 객체 입니다...");
			    obj1.setEmpno(1076); //setter로 설정
			    obj1.setAdmin(true);
			    obj1.setName("최준우");
			    System.out.println(obj1.toString());  //저장된 getter setter 출력
			    System.out.println(obj2.toString());
			}
			else {
				System.out.println("다른 객체 입니다...");
			}
			
			
			
		}
		
		
		

}
