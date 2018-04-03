package test;

import car.Car;

public class Test extends Car{
	
	public Test(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		Car c = new Car("bmw");
		Car c1 = new Car("benz");
//		Car c2=c;
		System.out.println(c.num);
		
		
		String i1 = "test";
		
		
		System.out.println();
		
	}
	
	public double cal(int a, int b) {
		super.name="dsa";
		Test t = new Test("sad");
		t.name="sda";
		int result = 0;
		return result;
	}
	public float cal(float a, float b) {
		int result = 0;
		return result;
	}
	
}

