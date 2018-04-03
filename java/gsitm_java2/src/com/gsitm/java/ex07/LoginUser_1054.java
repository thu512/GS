package com.gsitm.java.ex07;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: LoginUser_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 4. 2. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 싱글톤 실습 객체
*/
public class LoginUser_1054 {

	private static LoginUser_1054 loginUser = new LoginUser_1054();

	private String userName;
	private String userNo;
	private String userAuthority;


	private LoginUser_1054() {
		this.userName = "이경민";
		this.userNo = "1054";
		this.userAuthority = "인턴사원";
	}

	static LoginUser_1054 getInstance() {
		return loginUser;
	}
	public void printUserInfo() {
		System.out.println("이름 : " + this.userName + " 사번 : " + this.userNo + " 직책 : " + this.userAuthority);
	}

	// ================getters/setters=========================
	/**
	 * userName Getter
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * userName Setter
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * userNo Getter
	 * @return the userNo
	 */
	public String getUserNo() {
		return userNo;
	}
	/**
	 * userNo Setter
	 * @param userNo the userNo to set
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	/**
	 * userAuthority Getter
	 * @return the userAuthority
	 */
	public String getUserAuthority() {
		return userAuthority;
	}
	/**
	 * userAuthority Setter
	 * @param userAuthority the userAuthority to set
	 */
	public void setUserAuthority(String userAuthority) {
		this.userAuthority = userAuthority;
	}



}
