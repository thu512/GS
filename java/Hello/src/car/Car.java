package car;


public class Car {
	protected String name="";
	public static int num=2;
	public Car(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
