package BackJoon;

import java.util.Scanner;

public class BJ2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a==b) && (b==c) &&(a==c)){
            System.out.println(10000+a*1000);
        }
        else if((a==b)||(b==c)){
            System.out.println(b*100+1000);
        }
        else if((a==c)){
            System.out.println(a*100+1000);
        }
        else{
            System.out.println(Math.max(a, Math.max(b,c))*100);
        }
    }
}
