package com.yedam.yje.classes.extendPkg;

public class Friend {
	// 필드
	private String name;
	private String phone;

	public Friend(String name, String phone) { //정의된 생성자
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public void showInfo() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는" + phone);
	}
}
