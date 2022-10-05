package PROJECT221015_이소현;

import java.util.Scanner;

public class Q609 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            int user = sc.nextInt();
            if(user==4) {
                break;
            }
            
            int com = (int)(Math.random()*3+1);
            switch(user) {
            case 1:
                if (com ==1) {
                    System.out.println("철수(가위) : 컴퓨터(가위)");
                    System.out.println("비겼습니다.");
                }else if(com ==2) {
                    System.out.println("철수(가위) : 컴퓨터(바위)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }else {
                    System.out.println("철수(가위) : 컴퓨터(보)");
                    System.out.println("철수가 이겼습니다.");
                }
                break;
            case 2:
                if (com ==1) {
                    System.out.println("철수(바위) : 컴퓨터(가위)");
                    System.out.println("철수가 이겼습니다.");
                }else if (com ==2) {
                    System.out.println("철수(바위) : 컴퓨터(바위)");
                    System.out.println("비겼습니다.");
                }else {
                    System.out.println("철수(바위) : 컴퓨터(보)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                break;
            case 3:
                if (com ==1) {
                    System.out.println("철수(보) : 컴퓨터(가위)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }else if (com ==2) {
                    System.out.println("철수(보) : 컴퓨터(바위)");
                    System.out.println("철수가 이겼습니다.");
                }else {
                    System.out.println("철수(보) : 컴퓨터(보)");
                    System.out.println("비겼습니다.");
                }
                break;
            }
        }
        
 
    }
 
}