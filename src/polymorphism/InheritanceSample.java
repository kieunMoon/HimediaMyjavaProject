package polymorphism;

class A {

	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}

}

class B extends A {
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}



public class InheritanceSample {

	public static void main(String[] args) {
			
		A a = new A();
		a.print1();
		a.print2();
		
		B b = new B();
		b.print1();
		b.print2();
		b.print2(100);
		// {
//			// 업 캐스팅
//			Kiwi1 b1 = new Kiwi1();
//			Fruit1 a1 = b1;
//
//			GreenKiwi c1 = new GreenKiwi();
//			Kiwi1 b2 = c1;
//			Fruit1 a2 = c1;
//		}
//		// 다운 캐스팅
//		{
//			int i = 10;
//			byte b = (byte) i;
//
//			GreenKiwi greenkiwi = new GreenKiwi();
//			Kiwi b1 = greenkiwi;
//
//			Fruit1 a2 = new Kiwi1();
//			Kiwi1 b2 = (Kiwi1) a2;
//
//		}
//
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//
//		A ab = new B();
//		A ac = new C();
//		A ad = new D();
//
//		B bc = new C();
//		B bd = new D();

		// 올바르지 않은 방법 // 부모 참조변수 = new 자식 으로 해야함
//			B ba = new A();
//			
//			C ca = new A();
//			C cb = new B();
//			
//			D da = new A();
//			D db = new B();
//			

	}

}