package java2.p18;

public class AdvForExample {
	public static void main(String[] args) {
		int [] scores = {9, 7, 8 ,9 ,8};
		
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		System.out.println("sum : " + sum);
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(scores[i] + " ");
		}
		System.out.println();
		for (int i = 0; i <scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
		System.out.println();
	}
}