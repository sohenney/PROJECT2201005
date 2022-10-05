package PROJECT221015_이소현;

public class Q601 {
	 
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3,50);
        MyPoint q = new MyPoint(4,50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은점");
        else
            System.out.println("다른점");
    }
 
}
 
class MyPoint{
    private int x,y;
    
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString() {        //toString을 적고 적지않고 차이를 보세요! 
        return "Point("+x+","+y+")";
    }
 
}
