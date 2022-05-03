package BackJoon;
import java.util.Scanner;

public class factorial_10872 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int sum = factorial(N);
        System.out.println(sum);
    }

    public static int factorial(int N){
        if(N<=1) return 1;
        return N*factorial(N-1);
    }
}
