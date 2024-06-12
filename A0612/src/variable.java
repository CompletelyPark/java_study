import java.util.Scanner;

public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 선언
//		int score;
//		System.out.println(score);
//		변수를 선언하고 유효값이 저장돼 있지 않으면 변수를 읽을 수 없다.
		
//		변수 선언과 동시에 초기화를 시킨다. 초기값이 유효한 값이 된다.
//		int score = 85;
//		System.out.println(score);

		int score;
//		변수를 읽어오기 전에 유효한 값을 대입
		score = 85;
//		System.out.println(score);
		
	/*
	* 변수 명을 사용해 변수의 내용값을 읽어오는 표현 R-value read, right
	* 변수 명을 사용해 변수의 내용값을 변경하는 표현 L-value write, left
	* 이 후 변수를 사용하는 모든 표현에서
	* 대입 연산자의 왼쪽에 변수가 사용되면 L-value
	* 대입 연산자의 오른쪽에 변수가 사용되면 R-value
	* 그 외의 모든 표현에서 변수 사용시 R-value
	*/
		
		
//		아래 total 변수는 선언되지 않았기 때문에 컴파일 에러
//		System.out.println(total);
	int total;
	
	Scanner a = new Scanner(System.in);
	total = a.nextInt();
	if (total>score) {
		System.out.println(total);
	}
	else System.out.println(score);
	}
}
