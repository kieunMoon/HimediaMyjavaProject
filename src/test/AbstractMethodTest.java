package test;

abstract class Animal {
	abstract void cry();
}

class Dog extends Animal {
	void cry() {
		System.out.println("왈왈");
	}
}

public class AbstractMethodTest {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.cry();

		Animal a2 = new Dog();
		a2.cry();

		Animal a3 = new Dog();
		a3.cry();

		Animal a4 = new Animal() {
			void cry() {
				System.out.println("안ㄴ녕");
			}
		};
		a4.cry();

	}

}