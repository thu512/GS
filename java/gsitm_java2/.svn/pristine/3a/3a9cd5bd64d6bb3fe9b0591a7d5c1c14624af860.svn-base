package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Person_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 백기반
* @프로그램 설명           : 다중 인스턴스
*/
public class Person_1043 implements shoes_1043, clothes_1043{
	
		public void throwShoes(){
			System.out.println("신발 던져!!");
		}
		
		public void ripClothes(){
			System.out.println("옷찢어 !!");
		}
		
		public static void main(String[] args) {
			Person_1043 person = new Person_1043();
			System.out.println(person.wearShoes(true));
			System.out.println(clothes_1043.wearClothes(true));
			person.throwShoes();
			person.ripClothes();
			
		}
}
