

public class integerliteralex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정수 literal을 나타낼 때 기본으로 10진수 사용
		int a = 13;
		
//		경우에 따라 2, 8, 16 진수로 표현할 수 있따
		
		int b = 0b1101;
		
		int c = 015;
		
		int d = 0xd;
		System.out.printf(" %d %d %d \n", b,c,d);

		System.out.printf(" %d %o %x ", a,a,a);
	}

}
