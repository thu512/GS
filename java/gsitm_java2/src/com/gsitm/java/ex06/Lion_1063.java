package com.gsitm.java.ex06;

public class Lion_1063 {
	private static boolean lionfeed;
	
	Lion_1063(){
		this.lionfeed = false;
	}

	public boolean isLionfeed() {
		return lionfeed;
	}

	public void setLionfeed(boolean lionfeed) {
		this.lionfeed = lionfeed;
	}
	
	//현재 사자 밥먹었는지 상태
	public boolean nowlion() {
		System.out.println("현재 사자의 밥먹었는지 상태는"+this.isLionfeed()+"입니다.");
		return this.isLionfeed();
	}
	
	//밥안먹었으면 밥주는 행동
	public void givelion() {
		if(!(this.isLionfeed())) {
			this.setLionfeed(!(this.isLionfeed()));
			System.out.println("밥을 준 후 현재 사자의 밥먹었는지 상태는"+this.isLionfeed()+"입니다.");
		}
	}
}
