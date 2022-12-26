package polymorphism;

class Fruit {
}

class Apple extends Fruit {
}

class Grape extends Fruit {
}

class Kiwi extends Fruit {
}

public class FruitSample {

	public static void main(String[] args) {

		String s1 = new String("문자열");
		Apple a1 = new Apple();
		Grape g1 = new Grape();
		Kiwi k1 = new Kiwi();

		String[] s2 = { new String(), new String(), new String() };
		Apple[] a2 = { new Apple(), new Apple(), new Apple() };
		Grape[] g2 = { new Grape(), new Grape(), new Grape() };
		Kiwi[] k2 = { new Kiwi(), new Kiwi(), new Kiwi() };
		
		int count1 = a2.length + g2.length + k2.length;
		
		Fruit[] f2 = { new Apple(), new Apple(), new Apple(), new Grape(), new Grape(), new Grape(),new Kiwi(), new Kiwi(), new Kiwi()};
		
		int count2 = f2.length;
		
		
	}

}
