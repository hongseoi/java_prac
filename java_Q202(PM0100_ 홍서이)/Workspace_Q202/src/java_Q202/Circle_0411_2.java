package java_Q202;

public class Circle_0411_2 {

	int radius;
	String name;

	public Circle_0411_2() { // �Ű� ���� ���� ������
		radius = 1; name = ""; // radius �ʱⰪ = 1
	}
	public Circle_0411_2(int r, String n) { // �Ű� ���� �ִ� ������
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Circle_0411_2 pizza = new Circle_0411_2(10, "�ڹ�����");

		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);

		Circle_0411_2 donut = new Circle_0411_2();
		donut.name = "����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
