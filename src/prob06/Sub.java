package prob06;

public class Sub {
	private int a;
	private int b;

	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}

	int calculate(){
		return a - b;
	}
}