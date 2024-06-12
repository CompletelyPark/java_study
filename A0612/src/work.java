
public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 세 숫자중 가장 큰 수
		int a = 3;
		int b = 2;
		int c = 1;
		int max1 = a;
		if (a<b) {
			if(b<c) max1 = c;
			else max1 = b;
		}
		else if (b<a) {
			if(a<c) max1 = c;
			else  max1 = a;
		}
		System.out.println(max1);
		
		// 2. 중간값
		int mid1 = a;
		if (a<b) {
			if(b<c) mid1 = b;
			else {
				if(a<c) mid1 = c;
				else mid1 = a;
			}
		}
		else if (b<a) {
			if(a<c) mid1 = a;
			else {
				if (b<c) mid1=c;
				else mid1 = b;
			}
		}
		System.out.println(mid1);
		
		// 3. 1~100까지 합
		int sum1 =0;
		for(int i =1;i<=100;i++) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		// 4. 1~100까지 홀수 합
		int sum2 = 0;
		for (int i =1;i<=100;i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);
		
		// 5. 1 + (1+2) + (1+2+3) + ... (1 + 2 + 3+ ... 10)
		
		int sum3 =0;
		for (int i =1;i<=10;i++) {
			for(int j =1;j<=i;j++) {
				sum3+=j;
			
			}
		}
		System.out.println(sum3);
	}

}
