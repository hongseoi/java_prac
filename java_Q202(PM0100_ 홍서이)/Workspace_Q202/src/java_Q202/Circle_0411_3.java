package java_Q202;

	public class Circle_0411_3 {
		int radius;
		public Circle_0411_3(int radius) {
			this.radius = radius;
		}
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_0411_3 ob1 = new Circle_0411_3(1);
		Circle_0411_3 ob2 = new Circle_0411_3(2);
		Circle_0411_3 ob3= new Circle_0411_3(3);
		
		System.out.println("ob1 =" + ob1.radius);
		System.out.println("ob2 =" + ob2.radius);
		System.out.println("ob3 =" + ob3.radius);
		System.out.println();
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		System.out.println("반지름 변경");
		System.out.println("ob1 =" + ob1.radius);
		System.out.println("ob2 =" + ob2.radius);
		System.out.println("ob3 =" + ob3.radius);

	}

}
