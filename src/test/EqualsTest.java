package test;

class Person1 {
	private String name;

	Person1(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person1 person = (Person1) obj;
			if(person.name == this.name) {
				return true;
			}

		}
		return false;
	}
}

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Person1 p1 = new Person1("홍길동");
		Person1 p2 = new Person1("홍길동");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		Person1 p3 = p1;
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3));	
	}

}

