package com.gsitm.java.ex07;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: LogInUser_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 2. 
* @작성자					: 이상훈
* @프로그램 설명			: Singleton pattern
*/
public class LogInUser_1056 {
	/* Sington type1: 컴파일 하자마자 자동으로 메모리에 올리는 방법
	 * 
	 * 코드가 무겁지 않을 때 사용하기 좋다. 멀티쓰레드 환경에서도 문제없이 동작하고 사용법도 간편하다.
	 * 다만 코드가 무겁고 자주 호출되지 않는다면 꽤 많은 메모리가 항상 잡혀있는 문제가 발생한다.
	 * */
	static LogInUser_1056 logInType1 = new LogInUser_1056();
	
	private String name;
	private String empNo;
	private String authority;
	
	private LogInUser_1056() {
		this.name = "미정";
		this.empNo = "미정";
		this.authority = "미정";
	}
	
	public static LogInUser_1056 getInstanceType1() {
		return logInType1;
	}

		
	
	/* Sington type2: lazy initialization를 활용하여 호출할 때 객체를 메모리에 올리는 방법
	 * 
	 * 호출과 동시에 생성하기 때문에 필요할 때만 메모리에 올릴 수 있는 방법.
	 * 하지만 멀티스레드 환경에서 객체를 만드는 과정에서 여러개의 인스턴스가 생성될 수 있으므로 보완이 필요한 방법이다.
	 * */
	static LogInUser_1056 logInType2;

	public static LogInUser_1056 getInstanceType2() {
		if(logInType2==null) {
			logInType2 = new LogInUser_1056();		
		}
		return logInType2;
	}
	
	/* Sington type3: Synchronized를 활용해 멀티쓰레드 환경에서 두 개 이상의 객체가 생성되는 것을 막는 방법(type2를 포함)
	 * 
	 * 하지만 동기화는 프로그램의 성능을 대폭 낮추기 때문에 이것을 사용함에 있어서 신중해야한다. 잘못 남용된 synchronized는 전체 성능에 악영향을 준다.
	 * */
	static LogInUser_1056 logInType3;
	
	public static synchronized LogInUser_1056 getInstanceType3() {
		if(logInType3==null) {
			logInType3 = new LogInUser_1056();
		}
		return logInType3;
	}
	
	/* Sington type4: Synchronized를 처음 객체 생성할 때만 적용하고, 그 후에는 type2와 같이 활용하는 방법
	 * 
	 * 멀티스레드 환경에서는 가장 좋은 방법이지만 특정 자바버전 이하에서는 volatile 키워드가 제대로 동작하지 않기 때문에 유의해야한다.
	 * */
	
	// static volatile LogInUser_1056 logInType1 = new LogInUser_1056();
	static LogInUser_1056 logInType4;
	
	public static LogInUser_1056 getInstanceType4() {
		if(logInType4==null) {
			synchronized(LogInUser_1056.class) {
				if (logInType4==null) {
					logInType4 = new LogInUser_1056();
				}
			}
		}
		return logInType4;
	}

	
	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}// end of class
