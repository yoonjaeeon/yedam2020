package com.yedam.yje.classes.extendPkg;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone() {
		super(); // 부모 클래스의 생성자를 호출
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 DMB방송 수신.");

	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널:" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신 종료.");
	}

}
