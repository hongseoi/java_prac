package java_Q202;
import java.util.Scanner;

public class Circlescanner {
	
	int radius;
	int name;
	
	public Circlescanner(){}
	
	public double getArea() {
		return 3.14*radius*radius;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlescanner pizza = new Circlescanner();
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		pizza.radius = sc.nextInt();
		pizza.name = sc.nextLine();
		
		sc.close();

	}

}
