package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Student student = new Student();
		System.out.println(student);
		
		System.out.println(student.name);
		System.out.println(student.nums);
		System.out.println(student.kor);
		System.out.println(student.eng);
		System.out.println(student.math);
		System.out.println(student.total);
		System.out.println(student.avg);
		;
//		Student st1 = new Student();
//		st1.name="iu";
//		st1.nums=1;
//		System.out.println("프로그램 종료");
//		
//		Student st2 = new Student;
//		Student st3 = new Student;
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		for(int i=0;i<3;i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i] = st;
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		System.out.println("프로그램 종료");
	}

}
