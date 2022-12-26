package test;

public class Person {
	private String name;
	private String phone;
	private String number;
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void print() {
		System.out.println(getName() + getNumber());
	}
	Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}




}



