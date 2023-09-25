package java2.P82;

public class Car {
	String color;
	int cc;

	Car() {

	}

	Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
	}

	public static void main(String[] args) {
		Car MyCar1 = new Car();
		Car MyCar2 = new Car("black", 3000);
	}
}
