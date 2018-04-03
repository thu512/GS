package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Main_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 장진영
* @프로그램 설명           : 사자와 호랑이 먹이 체크 후 먹이 주는 메인 
*/
public class Main_1064 {
	public static void main(String[] args) {
		ZooKeeper_1064 keeper = new ZooKeeper_1064();
		Animal_1064 animal = new Animal_1064();
		System.out.print("사자 : ");
		Animal_1064.lion = keeper.giveFeed(Animal_1064.lion);
		System.out.print("호랑이 : ");
		Animal_1064.tiger =keeper.giveFeed(Animal_1064.tiger);
		Animal_1064.tiger =keeper.giveFeed(Animal_1064.tiger);
		Animal_1064.tiger =keeper.giveFeed(Animal_1064.tiger);
	}
}
