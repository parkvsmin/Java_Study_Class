package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스명(); (클래스명=생성자)
		//데이터타입 변수명
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버변수 접근
		//변수명.멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name="오크";
		monster.level=5;
		monster.hp=100;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//---------------------------------
		
		Monster monster2 = new Monster();
		System.out.println(monster2);
		
		monster2.name="고블린";
		monster2.level=5;
		monster2.hp=100;
		System.out.println(monster==monster2);
		
		Weapon sword = new Weapon();
		sword.name="단검";
		sword.damage=10;
		sword.inchant=1;
		
		monster.weapon = sword;
		
		System.out.println("몬스터가 들고있는 무기이름 :"+monster.weapon.name);
		
		System.out.println("몬스터2가 들고있는 무기이름 :"+monster2.weapon.name);
		
		System.out.println(monster2.name);
		System.out.println(monster2.level);
		System.out.println(monster2.hp);
		
		System.out.println("프로그램 종료");

	}

}
