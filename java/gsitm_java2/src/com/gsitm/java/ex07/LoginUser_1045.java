package com.gsitm.java.ex07;


public class LoginUser_1045 {
    private static LoginUser_1045 singleton = new LoginUser_1045();
    private  String name = "손원락";
    private  String id = "it1045";
    private  String authority = "admin";
    
    private LoginUser_1045() {}
    public static LoginUser_1045 getInstance() {
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}



}