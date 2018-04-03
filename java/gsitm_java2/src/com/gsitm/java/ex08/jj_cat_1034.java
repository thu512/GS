package com.gsitm.java.ex08;

/**
 * <pre>
* 1. 패키지명 : com.gsitm.java.ex08
* 2. 타입명 : jj_cat_1034.java
* 3. 작성일 : 2018. 4. 3. 오전 10:45:32
* 4. 작성자 : JongJoo
* 5. 설명 : 오버라이딩 연습 예제
 * </pre>
 */
public class jj_cat_1034 extends jj_momCat_1034 {

	@Override
	public String mCry() {

		return "음메";
	}

	public String momCry() {
		return super.mCry();

	}

	public static void main(String[] args) {

		jj_cat_1034 jj = new jj_cat_1034();
		System.out.println("자식 클래스 : " + jj.mCry());
		System.out.println("부모 클래스 : " + jj.momCry());

	}
}
