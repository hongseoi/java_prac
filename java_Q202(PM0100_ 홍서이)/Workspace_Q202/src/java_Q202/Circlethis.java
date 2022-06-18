package java_Q202;

public class Circlethis {
	int radius;
	public Circlethis(int radius) {
		this.radius = radius;
	}
	
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circlethis ob1 = new Circlethis(1);
		Circlethis ob2 = new Circlethis(2);
		
		ob1.set(4);

	}

}
