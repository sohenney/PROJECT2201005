package PROJECT221015_이소현;

import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Q611 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
 
        
        System.out.print(">>");
        sb.append(sc.nextLine());
        
        while(true) {
            System.out.print("명령: ");   //ssss!aaa 형식으로 작성 ssss->aaa로 바꾸는것.
            String s = sc.next();
            if(s.contentEquals("그만")) break;
            
            String str[] = s.split("!");    // !를 기준으로 나눴습니다.
            
            if(str.length != 2) System.out.println("잘못된 명령어 입니다!");    // 규칙이랑 다를때
            else {
                if(str[0].length() ==0 || str[1].length() ==0) System.out.println("잘못된 명령어 입니다!");     //위에서는 이걸 거르지 못합니다.
                else {
                    int index = sb.indexOf(str[0]);
                    if(index == -1) {
                        System.out.println("찾을 수 없습니다!");
                    }else {
                        sb.replace(index, index+str[0].length(), str[1]);
                        System.out.println(sb);
                    }
                }
            }
            
        }
    }
 
}
 
