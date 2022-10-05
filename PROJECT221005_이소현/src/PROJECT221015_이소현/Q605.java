package PROJECT221015_이소현;

import java.util.Calendar;
import java.util.Scanner;
 
public class Q605 {
 
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);
        int am_pm = c.get(Calendar.AM_PM);
        
        System.out.println("현재 시간은 "+hour+"시 "+min+"분입니다.");
        if(am_pm ==Calendar.AM && hour>=4 && hour<12) {
            System.out.println("Good Morning");
        }else if(am_pm ==Calendar.PM && hour<=6) {
            System.out.println("Good Afternoon");
        }else if(am_pm == Calendar.AM_PM && hour>6 && hour<=10) {
            System.out.println("Good Evening");
        }else {
            System.out.println("Good Night");
        }
 
    }
 
}