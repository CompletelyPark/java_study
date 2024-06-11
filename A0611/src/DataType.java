
public class DataType {
/*
 * 현재 클래스 명 DataType
 * 자바 프로그램 소스는 반드시 1개 이상의 class가 있어야 함
 * 단독으로 실행시킬 수 있는 클래스는 반드시 main 메서드가 있어야함
 * public이 파일이름, public은 한개의 파일에 하나만 올 수 있다
 * 
 */
	// <- 한줄의 주석 표현시 사용
	/*
	 여러 줄 주석처리
	 */
	
	/*
	 *  표현하는 값의 종류
	 *  1. 숫자
	 *  	정수 integer - 소숫점이 없는 수 (-5, 365, 0, 1200, ...)
	 *  	실수 float - 소숫점이 있는 수 (-3.14, -0.0025, ...)
	 *  2. 문자 데이터
	 *  	단일 문자 character - 한개의 문자로 구성 ('A','o','가','5', ...)
	 *  	문자열 string - 한 개 이상의 문자를 연속해서 나타낼때 ("", "A", "ABCD", "까나따라", ...)
	 *  3. 논리 데이터
	 *  	논리값 boolean - 논리적인 상태, 참/거짓, yes/no, on/off, 등 2가지
	 *  					참 = true, 거짓 = false
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 값 출력할 때 System.out.println(출력할 내용); <- 사용한다
		// 데이터 값이 프로그램 소스에 아래와 같이 직접 표현돼 있을 때 literal 이라고 한다
		
		System.out.println(100); // 정수
		System.out.println(3.14);// 실수
		System.out.println('A'); // 단일문자
		System.out.println("BC");// 문자열
		System.out.println(true);// 논리값	
	}
	void test() {
		
	}
}

class Test{
	void display() {
		//
	}
	
}
