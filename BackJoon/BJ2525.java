package BackJoon;

import java.util.Scanner;

public class BJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int add = sc.nextInt();

        int sum = hour*60 + min + add;
        hour = sum/60;
        min = sum%60;

        if(hour >=24) hour = hour-24;

        System.out.println(hour + " " + min);

    }
}
