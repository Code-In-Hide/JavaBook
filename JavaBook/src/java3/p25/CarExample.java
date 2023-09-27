package java3.p25;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못괸 속도 변경
		myCar.setSpeed(-20);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(40);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
