package classes;

public class PeopleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People pp = new People("Daegu","한국");// 인스턴스
		System.out.println(pp.address);
		System.out.println(pp.country);
		
		People ple = new People(); // 인스턴스  
		ple.name = "윤재언";  //필드
		ple.age = 25;
		ple.height = 179;
		//출력
		System.out.println(ple.name);
		
		System.out.println(ple.age);
		System.out.println(ple.height);
		ple.exercise();
		ple.game();
		System.out.println(ple.showCountry());
	}
	

}
