package BackJoon;

import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];
        for(int i=0; i<arr.length; i++) arr[i] = -1;

        String S = sc.nextLine();

        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);

            //이부분부터 이해못함
            if(arr[ch - 'a']==-1){
                arr[ch-'a']=i;
            }
        }
        for(int val:arr) System.out.println(val + " ");


=    }
}
