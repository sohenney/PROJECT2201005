package PROJECT221015_이소현;

interface Shape1{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle5 implements Shape1{
	private int radius;
	public Circle5(int radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("반지름이 " + this.radius + "인 원입니다.");
	}
	public double getArea() {
		return PI * radius * radius;
	}
}

public class Q13 {
	public static void main(String args[]) {
		Shape1 donut = new Circle5(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}