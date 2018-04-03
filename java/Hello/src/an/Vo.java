package com.gsitm.java.ex08;

public class Vo {
    @IntMaxValCheck(val=99999)
    private int intVal=100;

	public int getIntVal() {
		return intVal;
	}
	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}
}