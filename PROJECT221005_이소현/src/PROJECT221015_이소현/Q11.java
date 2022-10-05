package PROJECT221015_이소현;

import java.util.Scanner;

public class Q11 {
 
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("두 정수와 연산자를 입력하시오>>");
          int a=sc.nextInt();
          int b=sc.nextInt();
          String cal=sc.next();
            
            switch(cal) {
            case "+":
                Add add=new Add();
                add.setValue(a,b);
                System.out.println(add.calculate());
                break;
            case "-":
                Sub sub=new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case "*":
                Mul mul=new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case "%":
                Div div=new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
            default :
                System.out.print("제대로 입력하세요.");
                
                
            }
          
    }
}
abstract class Calc{
    int a;
    int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int calculate();    //계산결과 리턴해야하니까 int를 반환형으로 했습니다.
}
    
class Add extends Calc{
    public int calculate() {
        return a+b;
    }
    
}
 
class Sub extends Calc{
    public int calculate() {
        return a-b;
    }
}
 
class Mul extends Calc{
    public int calculate() {
        return a*b;
    }
}
 
class Div extends Calc{
    public int calculate() {
        if(b ==0) {
            System.out.println("0으로는 나눌 수 없습니다.");
            return -1;
        }
        return a/b;
    }
}