package PROJECT221015_이소현;

import java.util.Scanner;

class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
}

public class Q03 {
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); 
		toDollar.run();
	}
}