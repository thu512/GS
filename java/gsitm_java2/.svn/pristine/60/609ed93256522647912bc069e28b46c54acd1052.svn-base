package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 손원락
* @프로그램 설명           : 사육사의 호랑이와 사자의 식사체크 프로그램
*/
public class Trainer_1045 {
	boolean t;
	boolean l;
	
	public void chkEat(Tiger_1045 t, Lion_1045 l) {
		this.t = t.eat;
		this.l = l.eat;
	
		if(this.t == true) {
			System.out.println("호랑이는 배가 부릅니다.");
		} else if(this.t == false) {
			System.out.println("호랑이는 배가 고픕니다");
		}
		
		if(this.l == true) {
			System.out.println("사자는 배가 부릅니다.");
		} else if(this.l == false) {
			System.out.println("사자는 배가 고픕니다");
		}

	}

	public void tigerEat() {
		Tiger_1045.eat = true;
		System.out.println("호랑이에게 밥을 줬습니다.");
	}

	public void lionEat() {
		Lion_1045.eat = true;
		System.out.println("사자에게 밥을 줬습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger_1045 t = new Tiger_1045();
		Lion_1045 l = new Lion_1045();
		Trainer_1045 trainer = new Trainer_1045();
		trainer.chkEat(t,l);
		trainer.tigerEat();
		trainer.lionEat();
		trainer.chkEat(t,l);
		System.out.println(Tiger_1045.eat); 
		System.out.println(Lion_1045.eat); 
		
	}

}
