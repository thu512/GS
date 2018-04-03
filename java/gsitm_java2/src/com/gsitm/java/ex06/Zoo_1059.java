package com.gsitm.java.ex06;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Zoo_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자              : 이종건
* @프로그램 설명       : 1. 클래스 3개 파일 생성
2. 동물원에서는 사자와 호랑이가 밥을 먹었는지 체크하는 
3. 밥먹었는지 여부는 static, isEaten?
4. 사육사는 체크하고 체크한 값을 출력하라.
5. ex06폴더에 클래스명_사번으로 생성.
6. 4시 10분까지.
7. 밥 안먹었으면 밥주는 행동까지.
*/
public class Zoo_1059 {
	Animal_1059 lion = new Animal_1059("lion");
	Animal_1059 tiger = new Animal_1059("tiger");
	
	boolean checkEaten() {
		if(lion.isEaten && tiger.isEaten) {
			System.out.println("모두 밥을 다 먹었습니다.");
		} else if(lion.isEaten) {
			System.out.println("사자가 밥을 먹었습니다.");
		} else if(tiger.isEaten){
			System.out.println("호랑이가 밥을 먹었습니다.");
		} else {
			System.out.println("모두 밥을 먹지 않았습니다.");			
		}
		
		return true;
	}
}
