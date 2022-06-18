package java_Q202;

public class Circle_0411_4 {
	int radius;
	public Circle_0411_4 (int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_0411_4  ob1 = new Circle_0411_4 (1);
		Circle_0411_4  ob2 = new Circle_0411_4 (2);
		Circle_0411_4 s;
		
		s = ob2;
		System.out.println(ob2);
		System.out.println(s);
		ob1=ob2;
		
		System.out.println(ob1);
		System.out.println("0b1.radius= "+ob1.radius);
		System.out.println("0b2.radius= "+ob2.radius);
	}

}
