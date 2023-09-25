package java2.component;

public class Tire {
	private int size;
	private int bigsize;
	
	public Tire() {
		System.out.println("Tire Constructor");
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setBigSize() {
		this.bigsize = size * 2;
	}
	
	public int getBigSize() {
		return bigsize;
	}
}
