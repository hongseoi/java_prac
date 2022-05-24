package BackJoon;

import java.util.Scanner;

public class BJ10809_indedof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        for(char c = 'a'; c<='z'; c++)
            System.out.println(S.indexOf(c)+" ");
    }
}
