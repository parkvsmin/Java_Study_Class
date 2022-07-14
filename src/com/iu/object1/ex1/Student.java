package com.iu.object1.ex1;

public class Student {

	String name;
	int num;
	int nums;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//총점 계산 하는 메서드
	public void setTotal() {
		this.total = this.kor+this.eng+this.math; //파란색 멤버변수 //갈색or하늘 지역변수
		this.setAvg();
	}
	public void setAvg() {
		this.avg = this.total/3.0;
	}
	
}
