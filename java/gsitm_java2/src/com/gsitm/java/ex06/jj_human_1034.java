package com.gsitm.java.ex06;

/**
 * <pre>
* 1. 패키지명 : com.gsitm.java.ex06
* 2. 타입명 : jj_human_1034.java
* 3. 작성일 : 2018. 3. 30. 오후 3:53:58
* 4. 작성자 : JongJoo
* 5. 설명 : 동물원에서 밥먹었는지 확인하는 프로그램.
 * </pre>
 */
public class jj_human_1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
	}

	private static void check() {
		// TODO Auto-generated method stub

		jj_zoo_1034 zoo = new jj_zoo_1034();

		switch (zoo.check()) {
		case 0:
			System.out.println("사자 호랑이 둘다 밥 먹음");
			break;
		case 1:
			System.out.println("사자만 밥먹음");
			jj_animals_1034.tiger=true;
			System.out.println("호랑이 밥줌.");
			break;
		case 2:
			System.out.println("호랑이만 밥먹음");
			jj_animals_1034.lion=true;
			System.out.println("사자밥줌.");
			break;
		default:
			System.out.println("둘다 밥안먹음.");
			jj_animals_1034.tiger =true;
			jj_animals_1034.lion=true;
			System.err.println("둘다 밥줌.");
		}

	}
}
