package REST.SpringRESTassignments.Q6;

public class calculator {
     int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "calculator [a=" + a + ", b=" + b + "]";
	}
}
