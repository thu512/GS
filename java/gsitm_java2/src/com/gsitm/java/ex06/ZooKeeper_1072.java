package com.gsitm.java.ex06;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ZooKeeper_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 3. 30.
 * @작성자			: 차주현
 * @프로그램 설명	:
 */
public class ZooKeeper_1072 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger_1072 tiger = new Tiger_1072();
		Lion_1072 lion = new Lion_1072();
		
		ZooKeeper_1072 zooKeeper = new ZooKeeper_1072();
		zooKeeper.checkEat(tiger, lion);
//		zooKeeper.checkEat(new Animal_1072[] {tiger, lion});
	}
	/**
	 * @param tiger
	 * @param lion
	 */
	public void checkEat(Tiger_1072 tiger, Lion_1072 lion) {
		if(!tiger.isEat) {
			System.out.println("호랑이가 굶주렸습니다.");
			feedTiger(tiger);
		}
		if(!lion.isEat) {
			System.out.println("사자가 굶주렸습니다.");
			feedLion(lion);

		}
	}
	/**
	 * @param tiger
	 */
	public void feedTiger(Tiger_1072 tiger) {
		System.out.println("호랑이에게 먹이를 줍니다.");
		tiger.isEat = true;
		System.out.println("호랑이가 배불러합니다.");
	}
	/**
	 * @param lion
	 */
	public void feedLion(Lion_1072 lion) {
		System.out.println("사자에게 먹이를 줍니다.");
		lion.isEat = true;
		System.out.println("사자가 배불러합니다.");
	}

//	public void checkEat(Animal_1072[] animals) {
//		for(Animal_1072 animal : animals) {
//			if(!animal.isEat()) {
//				System.out.println(animal.getName() + "이(가) 굶주렸습니다.");
//				this.feedAnimal(animal);
//			}
//		}
//	}
//	public void feedAnimal(Animal_1072 animal) {
//		System.out.println(animal.getName() + "에게 먹이를 줍니다.");
//		animal.setEat(true);
//		System.out.println(animal.getName() + "이(가) 배불러합니다.");
//	}
}
