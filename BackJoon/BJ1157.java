package BackJoon;

import java.util.Scanner;

public class BJ1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[26];
        String s = sc.next();

        for(int i=0; i<s.length(); i++){
            //대문자범위 65~90
            if('A'<= s.charAt(i)&& s.charAt(i)<='Z'){
                arr[s.charAt(i)-'A']++;
            }
            //소문자범위 97~122
            else{
                arr[s.charAt(i)-'a']++;
            }
        }

        //최대값 출력
        int max=-1;
        char ch = '?';

        for(int i=0; i<26; i++){
            if(max<arr[i]){
                max = arr[i];
                ch = (char)(i+65);
            }
            else if (arr[i]==max)
                ch = '?';


        }

        System.out.println(ch);

    }
}
