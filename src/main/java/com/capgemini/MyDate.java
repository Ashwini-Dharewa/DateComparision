package com.capgemini;

public class MyDate {
	
	int dd;
	int mm;
	int yyyy;
	
	public MyDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public int getMm() {
		return mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	@Override
	public String toString() {
		return "DatePojo [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	

}
