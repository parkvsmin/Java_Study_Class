package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {
	Scanner sc;
	//객체 생성
	StudentView sv;
	StudentService studentService;
	Student [] students;
	
	public StudentController() {
		sc = new Scanner(System.in);
		sv = new StudentView();
		studentService = new StudentService();
	}
	
	
	//start 메서드를 선언
	public void start() {
		
		boolean check=true;
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select= sc.nextInt();
			switch (select) {
			case 1: 
				System.out.println("1");
				break;
			case 2 :
				System.out.println("2");
				break;
			case 3 :
				System.out.println("3");
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default:
				System.out.println("종료중");
				check=!check;
			}
		}
		
		
	}

}