package java5.p61;

public class DKStack {
	private int[] ar;
	private int top;

	public DKStack() {
		ar = new int[10];
		top = -1;
	}

	public void push(Coin coin) {
		ar[++top] = coin.getValue();
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public Coin pop() {
		Coin coin = new Coin(ar[top--]);
		return coin;
	}
}
