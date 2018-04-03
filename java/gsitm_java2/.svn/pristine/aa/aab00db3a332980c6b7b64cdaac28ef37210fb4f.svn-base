package com.gsitm.java.ex08;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : MomCat_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 송현석
 * @프로그램 설명                : 어미고양이와 새끼고양이 실습. 새끼고양이는 어미고양이의 필드와 메소드를 상속받는다.
 */
public class MomCat_1047 {
	private String Color;
	public String legs,arms,shols;
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getArms() {
		return arms;
	}
	public void setArms(String arms) {
		this.arms = arms;
	}
	public String getShols() {
		return shols;
	}
	public void setShols(String shols) {
		this.shols = shols;
	}
	public void weep() {
		System.out.println("야옹");
	}
	public MomCat_1047() {
		Color = "brown";
		legs = "2";
		arms = "2";
		shols = "shape";
	}
	private void steal() {
		
	}
	
	public static void main(String[] args) {
		MomCat_1047 momCat = new MomCat_1047();
		BabyCat_1047 babyCat = new BabyCat_1047();
		System.out.println("어미고양이 털 색 : "+momCat.getColor());//부모 클래스 필드 값 확인
		System.out.println("새끼고양이 털 색 : "+babyCat.getColor());//자식 클래스 필드 값 확인, 상속이 이뤄졌음을 알 수 있다.
		momCat.weep();
		babyCat.weep();// 오버라이드 되어 새끼고양이가 다르게 우는것을 확인 할 수 있다.
		
	}
	
}