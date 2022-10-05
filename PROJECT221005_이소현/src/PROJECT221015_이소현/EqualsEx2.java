package PROJECT221015_이소현;

class Rect1 {
	int width;
	int height;
	public Rect1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect1 p = (Rect1)obj;
		if (width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Rect1 a = new Rect1(2,3);
		Rect1 b = new Rect1(3,2);
		Rect1 c = new Rect1(3,4);
		if(a.equals(b))
			System.out.println("a is equal to b");
		if(a.equals(c))
			System.out.println("a is equal to c");
		if(b.equals(c))
			System.out.println("b is equal to c");
	}
}