package java5.p61;

public class StackExample {
	public static void main(String[] args) {
//		Stack<Coin> coinBox = new Stack<Coin>();
		DKStack coinBox = new DKStack();
		
		coinBox.push(new Coin(20));
		coinBox.push(new Coin(70));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "  + coin.getValue() + " 원");
		}
	}
}
