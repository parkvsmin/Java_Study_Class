package com.iu.object2;

public class Method3 {
	
	public void sal(int salary) {
		System.out.println("월급계산");
		System.out.println(salary*0.967);
		salary=20;
		
	}
	
	public void hap(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	// info : 이름 나이 이메일주소 받아서 출력
	public void info(String name,int age,int mail) {
		System.out.println(name+age+mail);
	}
	
	public void info2(Member member) {
		
		System.out.println(member.age);
		System.out.println(member.name);
		System.out.println(member.email);
		
	}

}
