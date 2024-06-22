package a1234;

import java.util.Scanner;

public class ConvenienceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] product = new String[5];	// 제품명
		int[] productCount = new int[5];	// 제품 수량
		int[] productAmount = new int[5];	// 제품 금액
		
		for(int i = 0; i<5;i++) {
			product[i] = scanner.next();
			productCount[i] = scanner.nextInt();
			productAmount[i] = scanner.nextInt();
		}
		
		Convenience con = new Convenience(product,productCount,
				productAmount);
		
		String product1 = "";
		while(!product1.equals("quit")) {
			int count = 0;
			int amount = 0;
			
			System.out.println("제품 명을 입력하세요");
			product1 = scanner.next();
			
			if(!con.CheckProduct(product1)) {
				if(!product1.equals("quit"))
					System.out.println("없는 제품입니다");
				continue;
			}
			else {
				System.out.println("현재 해당 제품의 개수는 " + con.CheckCountProduct(product1));
				con.CheckCountProduct(product1);
				count = scanner.nextInt();
				amount = scanner.nextInt();
				System.out.println("2-1");
				System.out.print("총 금액은 " + con.Amount(product1, count) + "입니다\n");
				System.out.println("2-1-1");
				System.out.print("잔돈 " + con.ChangeAmount(product1, amount, count) + "입니다\n");
			}
		}
		System.out.println("종료");
	}

}
