package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method3 m3 = new Method3();
		//월급 입력
		int salary = 5000000;
		m3.sal(salary);
		System.out.println(salary);
		
		//m3.hap(10,20);
		
		Member member = new Member();
		member.name="suji";
		member.age=30;
		member.email="qwerty@.com";
		m3.info2(member);
		
		
	}

}
