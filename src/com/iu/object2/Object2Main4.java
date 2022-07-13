package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name="iu";
		member.age=10;
		member.email="iu@naver.com";
		
		Member member1 = new Member();
		member1.name="suji";
		member1.age=20;
		member1.email="suji@google.com";
		
		Member member2 = new Member();
		member2.name="choa";
		member2.age=30;
		member2.email="choa@daum.net";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member1;
		members[2] = member2;
		
		Method4 m4 = new Method4();
		m4.info(members);
		
		System.out.println(members.length);

	}
}
