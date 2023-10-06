package java4.p7;

public class MemberExample {
	public static void main(String[] args) {
		Member odj1 = new Member("blue");
		Member odj2 = odj1;
		Member odj3 = new Member("red");
		
		System.out.println(odj1.hashCode());
		System.out.println(odj2.hashCode());
		System.out.println(odj3.hashCode());
		
		if (odj1.equals(odj2)) {
			System.out.println("odj1과 odj2는 동등합니다.");
		} else {
			System.out.println("odj1과 odj2는 동등하지 않습니다.");
		}
		
		if(odj1.equals(odj3)) {
			System.out.println("odj1과 odj3는 동등합니다.");
		} else {
			System.out.println("odj1과 odj3는 동등하지 않습니다.");
		}
	}
}
