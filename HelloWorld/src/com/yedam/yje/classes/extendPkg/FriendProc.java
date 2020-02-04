package com.yedam.yje.classes.extendPkg;

import java.util.Scanner;

public class FriendProc {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public Friend getFriend(String searchname) {
		Friend friend = null;
		for (Friend f : friends) {
			if (f != null && f.getName().equals(searchname)) {
				friend = f;
			}
		}
		return friend;
	}

	public void addFriend() {
		System.out.println("1.대학친구 | 2.회사동료 | 3.그 외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		System.out.print("이름입력: ");
		String name = scn.nextLine();
		System.out.print("번호입력: ");
		String phone = scn.nextLine();
		Friend friend = null;
		if (subMenu == 1) {
			// 1)대학친구
			System.out.print("학교입력: ");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ);
		} else if (subMenu == 2) {
			// 2)회사동료
			System.out.print("회사입력: ");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);
		} else if (subMenu == 3) {
			// 3)그 외
			friend = new Friend(name, phone);
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	public void listFriend() {
		for (Friend friend : friends) { // Friend 클래스를 선언한 변수에다 friends[] 배열크기만큼 담는다.
			if (friend != null) // for문이기 때문에 [0]부터 [최대크기] 까지 차례차례 담는다. if 문으로 인해 null 제외
				friend.showInfo();
		}
	}

	public void updateFriend() {
		System.out.println("찾으실 이름을 입력하세요: ");
		String name = scn.nextLine();
		getFriend(name);
		Friend f = getFriend(name);
		if (f == null) {
			System.out.println("열심히 찾아봤지만 없어요ㅠㅠ");
		} else {
			System.out.println("변경할 번호를 입력하세요: ");
			String phone = scn.nextLine();
			f.setPhone(phone);
		}
	}

	public void delFriend() {
		System.out.println("삭제하고자 하는 이름을 입력하세요: ");
		String name = scn.nextLine();
		boolean isExist = false; // 처음에 false를 둔다
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				isExist = true; // 이 실행문이 진행된다면 논리데이터를 true로 바꿔준다.
			}
		}
		if (isExist) {
			System.out.println("삭제되었습니다."); // if를 써서 true조건일 경우, "삭제되었습니다" 라고 출력된다.
		} else {
			System.out.println("해당 조건의 값이 없습니다."); // false조건일 경우, 실행문이 쓰여지지 않았으니 "값이 없습니다"라고 출력된다.
		}

	}

	public void exec() {
		while (true) {
			System.out.println("===============================");
			System.out.println("1.입력|2.리스트|3.수정|4.삭제|9.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) { // 입력
				addFriend();
			} else if (menu == 2) { // 리스트
				listFriend();
			} else if (menu == 3) { // 수정
				updateFriend();
			} else if (menu == 4) { // 삭제
				delFriend();
			} else if (menu == 9) { // 종료
				break;
			}
		} // while문의 끝
		System.out.println("프로그램 종료.");
	}// exec 메소드의 끝
}// 클래스의 끝