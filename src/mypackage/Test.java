package mypackage;

public class Test {
	
	
	void abc() {
		System.out.println("instance Method");
	}
	
	static void bcd() {
		System.out.println("static Method");
	}
	
	
	public static void main(String[] args) {
		
		MyClass a = new MyClass();
		MyClass a2 = new MyClass();
		
		a.m = 5;
		a2.m = 6;
		
		System.out.println(a.m);
		System.out.println(a2.m);
		
		a.n= 7;
		a2.n= 8;
		MyClass.n = 5;
		
		
		System.out.println(a.n);
		System.out.println(a2.n);
		Test.bcd();
		
		
		
	}

}
