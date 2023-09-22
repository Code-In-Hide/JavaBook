package java2.p65;

public class RunnigAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
		//ani1.name = "cat";
		ani1.setName ("cat2");
		ani1.setAge(10);
		
		System.out.println(ani1.getName());
		System.out.println(ani1.getAge());
	}
}