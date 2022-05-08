package BackJoon;

import java.util.Scanner;

public class 별찍기_2447 {

    public static void star(int N){
        N = (int) Math.cbrt(N);

        if(N == 1){
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
            return;
        }

        star(N/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        star(N);
    }
}
