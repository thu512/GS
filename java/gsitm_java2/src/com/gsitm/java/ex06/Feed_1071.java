package com.gsitm.java.ex06;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : feed.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 3. 30. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 사자와 호랑이에게 먹이를 주었는지 확인하기
*/
public class Feed_1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keeper keeper = new Keeper();
		if(Tiger.feedTiger) {
			System.out.println("호랑이는 밥을 먹었습니다.");
		}else {
			System.out.println("호랑이는 밥을 먹지 않았습니다.");
		}
		
		if(Lion.feedLion) {
			System.out.println("사자는 밥을 먹었습니다.");
		}else {
			System.out.println("사자는 밥을 먹지 않았습니다.");
		}
		
		keeper.chk();
		
		if(Tiger.feedTiger) {
			System.out.println("호랑이는 밥을 먹었습니다.");
		}else {
			System.out.println("호랑이는 밥을 먹지 않았습니다.");
		}
		
		if(Lion.feedLion) {
			System.out.println("사자는 밥을 먹었습니다.");
		}else {
			System.out.println("사자는 밥을 먹지 않았습니다.");
		}
		
		
	}

}

 class Tiger{
	static public boolean feedTiger = false;

}

 class Lion{
	static public boolean feedLion = false;
	
}

 class Keeper{
	void chk() {
		if(!Tiger.feedTiger) {
			keeper("tiger");
		}
		if(!Lion.feedLion){
			keeper("lion");
		}
	}
	
	void keeper(String s) {
		
		if(s.equals("tiger")) {
			Tiger.feedTiger= true;
		}else {
			Lion.feedLion=true;
		}
	}
	
}
