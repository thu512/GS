package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 임혜성
* @프로그램 설명           : 사육사는 밥을 먹었는지 확인하는 체크 클래스
*/
public class Trainer_1061 {
	//동물이 밥을 먹었는지 체크하는 메소드
	public void animalEatCheck(Object animal) {
		//먹은 것을 체크하는데 사자일 시
		if(animal instanceof Rion_1061) {
			//사자가 밥을 먹었는지 먹지 않았는지 static으로 확인
			if(Rion_1061.rionEatCheck == false) {
				System.out.println("사자가 밥을 안 먹어 밥을 주었습니다.");
				//사자가 밥을 안먹어 static 변수 true로 변환하여 밥 먹은 행위를 보여줌
				Rion_1061.rionEatCheck = true;
			} else {
				System.out.println("사자가 밥을 먹었습니다.");
			}
		}
		
		//먹은 것을 체크하는데 호랑이 일시 
		if(animal instanceof Tiger_1061){
			//호랑이가 밥을 먹었는지 먹지 않았는지 static으로 확인
			if(Tiger_1061.tigerEatCheck == false) {
				System.out.println("호랑이가 밥을 안 먹어 밥을 주었습니다.");
				//호랑이가 밥을 안먹어 static 변수 true로 변환하여 밥 먹은 행위를 보여줌
				Tiger_1061.tigerEatCheck = true;
			} else {
				System.out.println("호랑이가 밥을 먹었습니다.");
			}
		}
	}
	public static void main(String [] args) {
		//현재 사육사 객체 생성
		Trainer_1061 trainer = new Trainer_1061();
		//호랑이 객체 생성 후 밥 먹었는지 체크
		trainer.animalEatCheck(new Rion_1061());
		//사자 객체 생성 후 밥 먹었는지 체크
		trainer.animalEatCheck(new Tiger_1061());
	}
}
