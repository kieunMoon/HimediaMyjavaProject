package test;

public class PrintMain {

	static void println(int value) {
		System.out.println(value);
	}
	static void println(boolean value) {
		System.out.println(value);
	}
	static void println(double value) {
		System.out.println(value);
	}
	static void println(String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		
		PrintMain printer = new PrintMain();
		
		PrintMain.println(10);
		PrintMain.println(true);
		PrintMain.println(5.7);
		PrintMain.println("홍길동");
		
		

	}
	

}
