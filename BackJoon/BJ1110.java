package BackJoon;

import java.util.Scanner;

public class BJ1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cycle=0;
        int newN = N;

        while(true){
            cycle++;
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            if (N==newN){
                break;
            }

        }
        System.out.println(cycle);


    }
}
