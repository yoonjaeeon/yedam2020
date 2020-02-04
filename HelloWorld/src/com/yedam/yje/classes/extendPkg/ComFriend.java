package com.yedam.yje.classes.extendPkg;

public class ComFriend extends Friend{
	//필드
	private String company;

	public ComFriend(String name, String phone, String company) {
		super(name, phone);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("회사친구 이름은 " + super.getName());
		System.out.println("회사친구 전화번호는 " + super.getPhone());
		System.out.println("회사는 " + company);
	}
	

}
