package java4.p32;

public class Main {
	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		char p = ssn.charAt(7);
		
		switch (p) {
		case '1' :
		case '2' :
			System.out.println("남자 입니다.");
			break;
		case '3' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		}
	}
}
