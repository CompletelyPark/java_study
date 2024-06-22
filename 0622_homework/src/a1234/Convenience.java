package a1234;

public class Convenience {
	String[] product;		// 제품명
	int[] productCount;		// 제품 수량
	int[] productAmount; 	// 제품 금액
	int[] sellProductCount = new int[20];	// 판매 제품 누적 수량
	// 취급 품목 입력
	Convenience(String[] product1, int[] productCount1,
			int[] productAmount1){
		this.product = product1;
		this.productCount = productCount1;
		this.productAmount = productAmount1;
	}

	int checkCount=0; // 제품이 있다면 제품의 번호를 저장하는 변수
	// 2. 취급 품목 검사
	// checkP는 입력된 제품명 
	boolean CheckProduct(String checkP) {
		boolean check = false;
		for(int i =0; i < product.length; i++) {
			if(product[i].equals(checkP)) {
				check = true; // 입력한 물품이 취급 품목이라면
				checkCount = i;
			}
		}
		return check;
	}
	
	// 취급 품목 개수 검사
	int CheckCountProduct(String checkP) {
		int check = 0;
		if(CheckProduct(checkP))
			check = productCount[checkCount];
		return check;
	}
	
	// 취급 품목 금액 출력
	int Amount(String checkP, int count) {
		int sum1 =0;
		int check1 = CheckCountProduct(checkP);
		if(CheckProduct(checkP) && (check1>0)) {
			if(count<=check1) sum1 = count * productAmount[checkCount];
			else sum1 = check1 * productAmount[checkCount];
		}		
		return sum1;
	}
	
	// 잔돈 출력 및 판매 제품 누적
	int ChangeAmount(String checkP, int Amount1, int count) {
		int Amount2 =  Amount1 - Amount(checkP,count); // 잔돈
		int check1 = CheckCountProduct(checkP); // 취급 품목 개수
		if(check1>=count) {
			sellProductCount[checkCount] += count;
			productCount[checkCount] -= count;
		}
		else {
			sellProductCount[checkCount] += check1;
			productCount[checkCount] = 0;
		}
		if(productCount[checkCount]<=0)
			productCount[checkCount]=0;
		return Amount2;
	}
	
}
