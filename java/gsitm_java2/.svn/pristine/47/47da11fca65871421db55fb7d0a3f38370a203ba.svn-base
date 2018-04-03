package com.gsitm.java.ex06;

public class Tiger_1063 {
	private static boolean tigerfeed;
	
	Tiger_1063(){
		this.tigerfeed = false;
	}

	public boolean isTigerfeed() {
		return tigerfeed;
	}

	public void setTigerfeed(boolean tigerfeed) {
		this.tigerfeed = tigerfeed;
	}
	
	//현재 호랑이 밥먹었는지 상태
	public boolean nowtiger() {
		System.out.println("현재 호랑이의 밥먹었는지 상태는"+this.isTigerfeed()+"입니다.");
		return this.isTigerfeed();
	}
	
	//밥안먹었으면 밥주는 행동
	public void givetiger() {
		if(!(this.isTigerfeed())) {
			this.setTigerfeed(!(this.isTigerfeed()));
			System.out.println("밥을 준 후 현재 호랑이의 밥먹었는지 상태는"+this.isTigerfeed()+"입니다.");
		}
	}
}
