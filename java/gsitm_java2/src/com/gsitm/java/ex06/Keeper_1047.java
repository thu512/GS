package com.gsitm.java.ex06;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Keeper_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 30. 
 * @작성자            : 송현석
 * @프로그램 설명                : 사육사와 사자 호랑이, 사육사는 checkTheEating을 통해 전달받은 객체가 호랑이인지 사자인지
 * 					   판단 후, 허기가 진 상태인지 알아낸다. 그 후 if문을 통해 만약 애들이 배가 고프면 fooding을 통해
 * 					   먹이를 먹인다.
 */
public class Keeper_1047 {

	boolean checkTheEating(Object obj) {//전달받은 객체가 호랑이인지 사자인지 판별후, 각자의 출출함을 표준출력과 동시에 리턴.
		if(obj instanceof Tiger_1047) {// 객체가 Tiger_1047의 객체인가?
			System.out.println(Tiger_1047.isEating);
			return Tiger_1047.isEating;//호랑이의 허기짐 리턴.
		}else if (obj instanceof Rion_1047) {//객체가 Rion_1047의 객체인가?
			System.out.println(Rion_1047.isEating);
			return Rion_1047.isEating;
		}
		return false;//syntax error 방지.
		
	}
	
	void fooding(Object obj) {// 객체에게 먹이를 주는 메소드.
		if(obj instanceof Tiger_1047) {//객체가 호랑이인지 판별
			((Tiger_1047) obj).eating();//객체를 호랑이로 형변환 후 호랑이의 .eating을 호출(먹이를먹임)
			System.out.println(Tiger_1047.isEating);
		}else if (obj instanceof Rion_1047) {//사자의 위와같은 로직.
			((Rion_1047) obj).eating();
			System.out.println(Rion_1047.isEating);
		}
	}
	
	public static void main(String[] args) {
		Keeper_1047 keeper = new Keeper_1047();
		Tiger_1047 tiger = new Tiger_1047();
		Rion_1047 rion = new Rion_1047();
		//이까지 객체들 생성.
		
		if(!keeper.checkTheEating(tiger)) {//호랑이가 배가 고픈상태인가? !연산자 사용.
			keeper.fooding(tiger);//배가 고프면 먹이를 줌.
		}
		if(!keeper.checkTheEating(rion)) {//사자가 배가고픈가?
			keeper.fooding(rion);//배고프면 먹이를 줌.
		}
		
	}

}

class Tiger_1047{
	public static boolean isEating = false;
	void eating(){//먹이를 먹음 메소드.
		this.isEating = true;
	}
}

class Rion_1047{
	public static boolean isEating = false;
	void eating(){
		this.isEating = true;
	}
}