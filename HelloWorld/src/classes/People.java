package classes;

public class People {
	//필드
	String name; 
	int age;
	int height; 
	String address;
	String country;
	//생성자
	People(){ //기본 생성자 정이
	}
	People(String address, String country){
		this.address = address;
		this.country = country;
	}
	//메소드
	void exercise() {
		System.out.println("운동을 한다.");
	}
	void game() {
		System.out.println("게임을 한다.");
	}
	String showCountry() {
		return "나라";
	}

}
