package java_Q202;
import java.util.Scanner;

public class Grading_0321_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {			
		System.out.printf("������ �Է��ϼ���: ");
		int score = sc.nextInt();
		if(score>=90) {
			grade="A";
		} else if(score>= 80) {
			grade ="B";
		} else if(score>=70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade ="F";
		}
		System.out.println((i+1)+"��° �л��� ������ "+grade+"�Դϴ�.");
		}
		sc.close();
	}
}
