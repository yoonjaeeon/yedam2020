package com.yedam.yje.classes.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
// Animal animal = new Animal(); // 추상 클래스는 직접 인스턴스 생성 불가.
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();

		Dog dog = new Dog();
		dog.sound();
		cat.breathe();

		Animal animal = null;
		animal = cat;
		animal.sound();

		animal = dog;
		animal.sound();

		System.out.println("=========================");
		animalSound(cat);
		animalSound(dog);
	}

	static void animalSound(Animal animal) { // 매개값
		animal.sound();
	}
}
