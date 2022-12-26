package mybankv2;

class A {}

class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;

	public T getT() {return t;}

	public void setT(T t) {this.t = t;}

}

public class Main {
	
	static void method1(Goods<A> g) {}
	static void method2(Goods<?> g) {}
	static void method3(Goods<? extends B> g) {}
	static void method4(Goods<? super B>g) {}
	
	public static void main(String[] args) {
		//제네릭 타입으로 A객체만 사용 가능
		method1(new Goods<A>());
		
		//제네릭 타입으로 모두 사용 가능
		method2(new Goods<D>());
		
		//제네릭타입으로 B 또는 B의 자식들만 가능
		method3(new Goods<B>());
		
		//제네릭 타입으로 B 또는 B의 부모만 가능
		method4(new Goods<B>());
		
	}
}