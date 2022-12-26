package mypackage;

import otherpackage.OtherClass;

public class MainClass {

	public static void main(String[] args) {

		MyClass my = new MyClass();
		my.packageInt = 1;
		my.protectedInt = 2;
		my.publicInt = 3;
		// my.privateInt = 4; // private 는 접근 불가

		my.publicMethod();
		my.protectedMethod();
		my.packageMethod();
		// my.privateMethod(); // private 는 접근 불가
		
		OtherClass other = new OtherClass();
		
		
	}
}