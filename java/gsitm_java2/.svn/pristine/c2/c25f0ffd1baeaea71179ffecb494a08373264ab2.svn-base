package com.gsitm.java.ex09;

class Sum{
	interface Callback{
		void onMaxNumber(int number, int exceed);
	}
	
	private int num = 0;
	private int maxNum = 50;
	private Callback cb;
	
	public void setCallback(Callback cb) {
		this.cb = cb;
	}
	
	public int addNumber(int add) {
		num = num + add;
		System.out.println(num);
		if(cb!=null) {
			if(num >= maxNum) {
				cb.onMaxNumber(num, num-maxNum);
			}
		}
		
		return num;
	}
	
	public int getTotal() {
		return num;
	}
}