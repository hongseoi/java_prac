package BackJoon;

import java.util.Scanner;

public class ConditionEX_2525 {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int m = sc.nextInt() + sc.nextInt();

    if(m>=60){
        while(m>=60){
            m-=60;
            h++;
            if(h>=24){
                h=0;
            }
        }
    }
    System.out.println(h+" "+m );

}
