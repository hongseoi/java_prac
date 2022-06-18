package java_Q202;
import java.util.Scanner;

public class CoffeePrice_0328_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 선택하세요 ->");
		System.out.println("0을 입력하시면 종료합니다.");
		System.out.println("-------------------\n[커피]\n에스프레소, 카푸치노, 카페라떼\n"
				+ "[케이크]\n치즈케이크, 생크림케이크, 티라미수\n"
				+ "[스낵]\n마카롱, 쿠키, 마들렌");
		
		String order ="";
		int price = 0;
		int totalPrice = 0;
		
			while(order!="0") {
				order = sc.next();			
				switch(order) {
					case "0":
						System.out.println("메뉴 선택이 완료되었습니다.");
						System.out.println("총 금액은"+totalPrice+"입니다.");
						price=0;
						break;
					case "에스프레소":
						price = 3500;
						totalPrice=price+totalPrice;
						break;
					case "카푸치노":
					case "카페라떼":
						price = 4000;
						totalPrice=price+totalPrice;
						break;
					case "치즈케이크":
					case "티라미수":
						price = 5500;
						totalPrice=price+totalPrice;
						break;
					case "생크림케이크":
						price = 6000;
						totalPrice=price+totalPrice;
						break;
					case "마카롱":
						price = 3000;
						totalPrice=price+totalPrice;
						break;
					case "쿠키":
					case "마들렌":
						price = 2500;
						totalPrice=price+totalPrice;
						break;
					default:
						System.out.println("메뉴에 없습니다.");
						price=0;
						
				}
				if(price !=0) {
					System.out.println(order+"은(는)"+price+"원입니다.");
				}
			}

	
		sc.close();
	}

}
