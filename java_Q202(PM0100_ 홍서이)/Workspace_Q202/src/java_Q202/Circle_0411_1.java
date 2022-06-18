package java_Q202;

public class Circle_0411_1 {

	int radius; 					// 반지름 필드
	String name; 				// 이름 필드
	

	public Circle_0411_1() { }			// 생성자

	public double getArea() { 	// 면적 계산 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_0411_1 pizza = new Circle_0411_1(); 	// Circle 객체 생성
		pizza.radius = 10; 						// 피자의 반지름 = 10
		pizza.name = "자바피자"; 			// 피자의 이름
		double area = pizza.getArea(); 		// 피자의 면적
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle_0411_1 donut = new Circle_0411_1();
		donut.radius = 2;
		donut.name = "동전";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		Circle_0411_1 ball = new Circle_0411_1();
		ball.radius = 5;
		ball.name = "컵";
		area = ball.getArea();
		System.out.println(ball.name + "의 면적은 " + area);
		
		Circle_0411_1 bread = new Circle_0411_1();
		bread.radius = 10;
		bread.name = "축구공";
		area = bread.getArea();
		System.out.println(bread.name + "의 면적은 " + area);
		
		Circle_0411_1 cake = new Circle_0411_1();
		cake.radius = 15;
		cake.name = "농구공";
		area = cake.getArea();
		System.out.println(cake.name + "의 면적은 " + area);
	}

}
