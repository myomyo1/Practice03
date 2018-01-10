package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			String friendInfo = sc.nextLine(); // 친구정보 입력받기
			String[] friend_info = friendInfo.split(" "); // 입력받은 친구정보 공백으로 분리
			Friend f = new Friend(); // Friend 클래스 객체생성 , 데이터넣기
			f.setName(friend_info[0]);
			f.setHp(friend_info[1]);
			f.setSchool(friend_info[2]);
			friendArray[i] = f;
		}

		// 친구정보 출력
		for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showInfo();
		}

		sc.close();
	}

}
