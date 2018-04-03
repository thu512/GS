package com.gsitm.java.ex09;

class CallbackTest{
	public static void main(String[] args) {
		Sum sum = new Sum();
		Sum.Callback cb = new Sum.Callback() {			
			@Override
			public void onMaxNumber(int number, int exceed) {
				// TODO Auto-generated method stub
				System.out.println("number="+number+", exceed"+exceed);
			}
		};
		
		sum.setCallback(cb);
		
		for(int i=0;i<11;i++) {
			sum.addNumber(i);
		}
		
		System.out.println(sum.getTotal());
	}
}