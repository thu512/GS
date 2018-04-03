package com.gsitm.java.ex07;

public class OuterClass_1058 {


	public static void main(String[] args) {
		LoginUser_1058 singletone = LoginUser_1058.getInstance();
		String name;
		String id;
		String authority;
		name = singletone.getName();
		id = singletone.getId();
		authority = singletone.getAuthority();
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("authority : " + authority);
	}
}
