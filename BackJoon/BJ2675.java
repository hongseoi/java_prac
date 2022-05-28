package BackJoon;

import java.util.Scanner;

public class BJ2675 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int z=0; z < T; z++){

            int R = sc.nextInt();
            String s = sc.next();

            //문자열 잘라서 하나씩 반복해 출력하기
            for(int i=0; i<s.length(); i++){
                //CharAt 함수 이용
                for(int k=0; k<R; k++){
                    System.out.print(s.charAt(i));
                }
            }

            System.out.println();
        }

    }

}
