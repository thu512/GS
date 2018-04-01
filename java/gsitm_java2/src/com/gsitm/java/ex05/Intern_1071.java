package com.gsitm.java.ex05;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : Intern_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 3. 30. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 클래스 만들기 디폴트, 이름, 이름나이, 이름나이지망
*/
public class Intern_1071 {

		String name;
		int age;
		String applySite;
		
		Intern_1071(){
			
		}
		
		Intern_1071(String name){
			this(name,26,"shared service");			
		}
		
		Intern_1071(String name, int age){
			this(name,age,"shared service");
		}
		
		Intern_1071(String name, int age,String applySite){
			this.name=name;
			this.age=age;
			this.applySite=applySite;
		}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Intern_1071 intern1= new Intern_1071("진민영");
			Intern_1071 intern2= new Intern_1071("민영",26);
			Intern_1071 intern3= new Intern_1071("영",26,"shared service");
			
			System.out.println(intern1.name);
			System.out.println(intern2.name);
			System.out.println(intern3.name);
			
		}

}
