package java_Q202;
import java.util.Scanner;

public class CoffeePrice_0328_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴��� �����ϼ��� ->");
		System.out.println("0�� �Է��Ͻø� �����մϴ�.");
		System.out.println("-------------------\n[Ŀ��]\n����������, īǪġ��, ī���\n"
				+ "[����ũ]\nġ������ũ, ��ũ������ũ, Ƽ��̼�\n"
				+ "[����]\n��ī��, ��Ű, ���鷻");
		
		String order ="";
		int price = 0;
		int totalPrice = 0;
		
			while(order!="0") {
				order = sc.next();			
				switch(order) {
					case "0":
						System.out.println("�޴� ������ �Ϸ�Ǿ����ϴ�.");
						System.out.println("�� �ݾ���"+totalPrice+"�Դϴ�.");
						price=0;
						break;
					case "����������":
						price = 3500;
						totalPrice=price+totalPrice;
						break;
					case "īǪġ��":
					case "ī���":
						price = 4000;
						totalPrice=price+totalPrice;
						break;
					case "ġ������ũ":
					case "Ƽ��̼�":
						price = 5500;
						totalPrice=price+totalPrice;
						break;
					case "��ũ������ũ":
						price = 6000;
						totalPrice=price+totalPrice;
						break;
					case "��ī��":
						price = 3000;
						totalPrice=price+totalPrice;
						break;
					case "��Ű":
					case "���鷻":
						price = 2500;
						totalPrice=price+totalPrice;
						break;
					default:
						System.out.println("�޴��� �����ϴ�.");
						price=0;
						
				}
				if(price !=0) {
					System.out.println(order+"��(��)"+price+"���Դϴ�.");
				}
			}

	
		sc.close();
	}

}
