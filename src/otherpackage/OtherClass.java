package otherpackage;

import mypackage.MyClass;

public class OtherClass {
	public static void main(String[] args) {

		MyClass my = new MyClass();
//		my.packageInt = 1;  // 패키지가 달라서 접근 불가
//		my.protectedInt = 2; // 상속관계가 없어서 접근 불가
		my.publicInt = 3;
		// my.privateInt = 4; // private 는 접근 불가

		my.publicMethod();
//		my.protectedMethod();  //상속22
//		my.packageMethod();  // 패키지 22
//		// my.privateMethod(); // private 는 접근 불가
		
		

	}
}
