/**
 * 
 */
package com.gsitm.java.ex08;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: CatSon.java
* @Project			: gsitm_java2
* @Date				: 2018. 4. 3. 
* @작성자				: 성동원
* @프로그램 설명		: 자식 고양이 클래스 / 어미 고양이 클래스를 상속받는다.
*/
/*상속에서 자식은 부모의 필드 값 / 메서드들을 private을 제외하고는 다 가질 수 있다.
그리고 자식에서 더 추가할 수 있기 때문에, 부모를 확장한다(extend)라고 볼 수 있다.*/
public class CatSon_1044 extends CatParents_1044{
	
	//부모의 cry() 메서드를 자신에 맞게 재 정의 했다.
	@Override
	public void cry() {
		//부모의 인스턴스를 나타내는 super를 통해서 부모객체에 접근을 했다. 이후 부모의 cry() 메서드를 호출했다.
		super.cry();
		System.out.println("음매");	
	}

}
