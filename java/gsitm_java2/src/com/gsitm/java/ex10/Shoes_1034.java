package com.gsitm.java.ex10;

/**
* <pre>
* 1. 패키지명 : com.gsitm.java.ex10
* 2. 타입명 : Shoes_1034.java
* 3. 작성일 : 2018. 4. 3. 오후 3:58:14
* 4. 작성자 : JongJoo
* 5. 설명 :다중 인터페이스 황용하기.
* </pre>
*/
public interface Shoes_1034 {
	
	int C_SIZE = 260;
	
	void throw2();
	
	default void wear() {
		System.out.println("신발신다");
	}
	
	
}
