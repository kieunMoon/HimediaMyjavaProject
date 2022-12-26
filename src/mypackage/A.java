package mypackage;

public class A {

	final int CONST_NUM_TEN;
	static final int CONST_NUM_NINE;
	
	void changeConst() {
//		CONST_NUM_TEN = 100;
//		CONST_NUM_NINE = 99;
	}

	A() {
		CONST_NUM_TEN = 10;
//		CONST_NUM_NINE = 9;
	}
	
	static {
		CONST_NUM_NINE = 9;
	}
	
}
