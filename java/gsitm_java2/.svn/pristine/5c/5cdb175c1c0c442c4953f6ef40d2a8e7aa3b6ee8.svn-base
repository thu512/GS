package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김준혁
* @프로그램 설명         : 사육사가 밥을 주는 행동과 밥 먹었는지 체크하는 코드
*/
public class Trainer_1036 {
	
	Lion_1036 l = new Lion_1036();
	Tiger_1036 t = new Tiger_1036();
	
	public void isCheck() {				//밥 먹었는지 체크
		l.isEat();
		t.isEat();
	}
	public void feed() {					//밥 먹지 않았을때 먹이주기
		if(l.getlunchL() == false)
			l.setlaunchL(true);
		if(t.getlunchT() == false)
			t.setlaunchT(true);
	}
		
	public static void main(String[] args) {
		Trainer_1036 t = new Trainer_1036();
		t.isCheck();				//밥 먹었는지 체크 (둘다 먹지 않았음)
		t.feed();					//밥을 안먹었으므로 밥을 주는 행동
		t.isCheck();				//밥을 먹이고 난 후 밥 먹었는지 체크
	}

}
