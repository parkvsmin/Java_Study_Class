package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {
		Resume re = new Resume(); //생성자호출
		Car car1 = new Car();
		car1.color="Black";
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();
		

	}

}
