package classes;
      //자바문법(class) //인스턴스(Student)
public class Student {
	// 필드(속성)
	private String name; //private 필드를 직접 접근 제한  외부로부터숨김 
	private int age;
	private int height;
	private int weight;
	// 생성자(인스턴스를 만들면서 필드값을 초기화)
	Student(){ // default 생성자 초기값은 없다.
	}
	Student(String name){ //인스턴스
		      //메소드
		this.name = name; //필드값을 초기화 할때 매개체와 구분
	}
	Student(String name, int age, int height, int weight){ //4개의 필드값을 모두 초기화
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 메소드(동작 및 기능) return값이 항상 필요
	void study() {   //void는 return값 불필요.
		System.out.println("공부한다.");
	}

	void eat() {
		System.out.println("밥을 먹는다");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void setAge(int age) { //int형 데이터 타입
		if (age >= 0)
		    this.age = age;
		else 
			this.age = 0;
	}
	// 필드 반환 메소드
	int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//Source -> Generate Getters and Setters
}//end of method
