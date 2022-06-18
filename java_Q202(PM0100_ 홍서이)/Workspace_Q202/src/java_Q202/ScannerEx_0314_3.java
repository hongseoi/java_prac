package java_Q202;

import java.util.Scanner;

public class ArithmeticOperator_0314_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        long time = sc.nextLong();

        long sec = time % 60;
        long min = ((time%1440)/60)% 60;
        long hour = (time%1440)/60/60;
        long day = time/(1440*60);

        System.out.print("입력하신 숫자는 ");
        if(day != 0){
            System.out.print(day + "일");
        }
        if(hour != 0){
            System.out.print(hour + "시간");
        }
        if(min != 0){
            System.out.print(min + "분");
        }
        if(sec != 0){
            System.out.print(sec + "초");
        }
        System.out.println("입니다");

    }
}