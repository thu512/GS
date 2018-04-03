package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ZooKeeper_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 장진영
* @프로그램 설명           : 사자와 호랑이가 먹이를 먹었는지 확인 후 먹이 주는 메소드 구현 
*/
public class ZooKeeper_1064 {
	//boolean animal
	public boolean check(boolean animal) {
		if(animal == true) {
			System.out.println("먹이를 이미 먹었습니다.");
			return true;
		} else {
			System.out.println("먹이를 안먹었습니다.");
			return false;
		}
	}
	
	public boolean giveFeed(boolean animal) {
		if(check(animal) == false) {
			//animal = true;
			System.out.println("먹이를 주었습니다.");
			return true;
		}
		return true;
	}
}
