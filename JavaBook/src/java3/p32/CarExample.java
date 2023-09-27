package java3.p32;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankokkTire로 교체");
				car.tires[0] = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 HankokkTire로 교체");
				car.tires[1] = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankokkTire로 교체");
				car.tires[3] = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 HankokkTire로 교체");
				car.tires[4] = new HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------------");
		}
	}
}
