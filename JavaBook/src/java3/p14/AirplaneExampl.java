package java3.p14;

public class AirplaneExampl {
	public static void main(String[] args) {
		SuperAirPlane sa = new SuperAirPlane();
		sa.takeOff();
		sa.fly();
		sa.flyMod = SuperAirPlane.SUPER;
		sa.fly();
		sa.flyMod = SuperAirPlane.NORMAL;
		sa.fly();
		sa.land();
	}
}
