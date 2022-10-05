package PROJECT221015_이소현;

public class Q07 {
	 
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3);
        System.out.println(p.toString() +"입니다.");
        
        p.moveUp();    //z축으로 위쪽 이동
        System.out.println(p.toString() +"입니다.");
        
        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() +"입니다.");
        
        p.move(100,200,300);
        System.out.println(p.toString() +"입니다.");
 
    }
 
}
 
class Point3D extends Point{
    private int z;
    
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        // TODO Auto-generated constructor stub
    }
    
    public void moveUp() {
        z++;
    }
    public void moveDown() {
        z--;
    }
 
    public void move(int x, int y, int z) {
        move(x,y);
        this.z = z;
    }
    
    public int getZ() {
        return z;
    }
    public String toString() {
        String str = "("+getX()+","+getY()+","+getZ()+")의 점";
        return str;
    }
    
    
}
