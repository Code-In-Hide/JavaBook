package java2.sedanfactory;

import java2.component.Tire;

public class Sedan {
	public static void main(String[] args) {
//		java2.component.Tire compoTire = new java2.component.Tire();
		Tire compoTire = new Tire();
		compoTire.setSize(20);
		compoTire.setBigSize();

		System.out.println(compoTire.getSize());
		System.out.println("Size " + compoTire.getSize());
		System.out.println("BigSize " + compoTire.getBigSize());
	}
}
