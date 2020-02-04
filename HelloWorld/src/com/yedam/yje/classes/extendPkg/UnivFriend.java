package com.yedam.yje.classes.extendPkg;

public class UnivFriend extends Friend {
	// 필드
	private String university;

	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		// TODO Auto-generated constructor stub
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("학교친구 이름은 " + super.getName());
		System.out.println("학교친구 전화번호는 " + super.getPhone());
		System.out.println("학교는 " + university);
	}

}
