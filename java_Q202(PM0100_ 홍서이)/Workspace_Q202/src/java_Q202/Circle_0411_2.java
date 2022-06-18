package java_Q202;

public class Circle_0411_2 {

	int radius;
	String name;

	public Circle_0411_2() { // 매개 변수 없는 생성자
		radius = 1; name = ""; // radius 초기값 = 1
	}
	public Circle_0411_2(int r, String n) { // 매개 변수 있는 생성자
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_0411_2 pizza = new Circle_0411_2(10, "자바피자");

		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle_0411_2 donut = new Circle_0411_2();
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
