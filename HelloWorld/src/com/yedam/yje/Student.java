package com.yedam.yje;

public class Student {
	private String name; //이름
	private String no; //학번
	private int eScore; //영어점수
	private int mScore; //수학점수
	//생성자
	public Student() {
	}
	public Student(String name, String no, int eScore, int mScore) {
		super();
		this.name = name;
		this.no = no;
		this.eScore = eScore;
		this.mScore = mScore;
	}
//메소드
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public int geteScore() {
		return eScore;
	}


	public void seteScore(int eScore) {
		this.eScore = eScore;
	}


	public int getmScore() {
		return mScore;
	}


	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", eScore=" + eScore + ", mScore=" + mScore + "]";
	}
}
	

	