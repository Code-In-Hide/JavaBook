package java2.p95;

class Person {
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "Keybaek");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "USA";
//	The final field cannot be assigned.
//		p1.ssn = "654321-7654321";

		p1.name = "LeeSoonsin";

	}
}
