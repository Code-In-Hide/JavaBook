package java3.p14;

public class SuperAirPlane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPER = 2;

	public int flyMod = NORMAL;

	public void fly() {
		if (flyMod == SUPER) {
			System.out.println("초음속비행중 . . .");
		} else {
			super.fly();
		}
	}
}
