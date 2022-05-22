package BackJoon;

import java.util.Scanner;

public class BJ1065 {

    public static int hansu(int N){
        int count = 0;

        if(N<100){
            return N;
        }
        else{
            count = 99;
            for(int i=100; i<=N; i++){
                int n3 = i/100;
                int n2 = (i/10)%10;
                int n1 = i%10;

                if((n3-n2)==(n2-n1))count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(hansu(sc.nextInt()));
        sc.close();
    }
}
