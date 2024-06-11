// 특정 패키지에 속하는 자바 소스 프로그램은 반드시 첫 문장으로 
// 아래와 같이 소속돼 있는 패키지를 명시해야만 한다

package ch01.sec08;
/*
 *  패키지 명은 점. 을 이용해 계층적 구조를 표현한다
 *  물리적으로 패키지명을 계층적인 디렉토리로 표현된다
 *  아래의 hello.java의 실제 위치는 A0611/src/ch01/sec08/hello.java 임
 */
public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("현재 hello.java는 ch01.sec08패키지에 속해있다");
	}

}
