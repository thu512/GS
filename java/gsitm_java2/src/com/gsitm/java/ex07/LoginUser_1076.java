package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 최준우
* @프로그램 설명           : Singleton 생성
*/
public class LoginUser_1076 {
	
	private String name;
	private int empno;
	private boolean admin;
	
	private static LoginUser_1076 singleton = null; 
	
	private LoginUser_1076() {
		System.out.println("인스턴스를 생성하였습니다...");
	}
	public static LoginUser_1076 getInstance(){
        if(singleton == null){
            singleton = new LoginUser_1076(); // 객체가 생성되어 있지 않다면 객체를 생성하여 static에 주소 저장
        }
        return singleton; //객체가 생성되어 있다면 해당 객체의 주소를 리턴
    }

	//getter setter 설정
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	//출력 toString 
	@Override
	public String toString() {
		return "LoginUser_1076 [name=" + name + ", empno=" + empno + ", admin=" + admin + "]";
	}
	
	
	

}
