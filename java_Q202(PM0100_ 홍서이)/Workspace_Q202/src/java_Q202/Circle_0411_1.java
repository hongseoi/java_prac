package java_Q202;

public class Circle_0411_1 {

	int radius; 					// ������ �ʵ�
	String name; 				// �̸� �ʵ�
	

	public Circle_0411_1() { }			// ������

	public double getArea() { 	// ���� ��� �޼ҵ�
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_0411_1 pizza = new Circle_0411_1(); 	// Circle ��ü ����
		pizza.radius = 10; 						// ������ ������ = 10
		pizza.name = "�ڹ�����"; 			// ������ �̸�
		double area = pizza.getArea(); 		// ������ ����
		System.out.println(pizza.name + "�� ������ " + area);

		Circle_0411_1 donut = new Circle_0411_1();
		donut.radius = 2;
		donut.name = "����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		
		Circle_0411_1 ball = new Circle_0411_1();
		ball.radius = 5;
		ball.name = "��";
		area = ball.getArea();
		System.out.println(ball.name + "�� ������ " + area);
		
		Circle_0411_1 bread = new Circle_0411_1();
		bread.radius = 10;
		bread.name = "�౸��";
		area = bread.getArea();
		System.out.println(bread.name + "�� ������ " + area);
		
		Circle_0411_1 cake = new Circle_0411_1();
		cake.radius = 15;
		cake.name = "�󱸰�";
		area = cake.getArea();
		System.out.println(cake.name + "�� ������ " + area);
	}

}
