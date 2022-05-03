package BackJoon;
import java.io.*;

public class factorialbuffer_10872 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = factorial(N);

        System.out.println(sum);

    }

    public static int factorial(int N){
        if(N<=1) return 1;
        return N*factorial(N-1);
    }
}
