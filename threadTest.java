
public class threadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		프로그램을 시작하면 현재의 코드를 작동시키는 main thread가 생성돼 실행된다.
		
		System.out.print(Thread.activeCount()+"\n");
		
//		현재 실행중인 thread를 thread 객체로 만들어서 리턴
		Thread cur = Thread.currentThread();
		System.out.print(cur + "\n" + cur.getState() + cur.isAlive());
		System.out.print(cur.getPriority());
//		thread 식별자, thread 이름, thread 우선순위, thread 그룹이름 순서로 출력
		
		
//		main thread 계산이 끝나기 전에 working thread 만든다
//		working thread 제작
		CalThread ct = new CalThread();
//		thread 시작
//		바로 시작이 아닌 실행 가능할 때 실행한다
		ct.start();
		
		
//		main thread 에서 계산
		int sum = 0;
		for(int i =0;i<100;i++) {
			sum+=i;
			System.out.println(cur.getName() + ", " + i + ", " + sum);
		}
		System.out.print(sum);
		
		try {
//			working thread가 종료할 떄까지 현재 thread(main)이 멈춘다
			ct.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

//	working thread 만들기 1
class CalThread extends Thread {
	
//	필드, 생성자 가능
	int sum;
	
	@Override
	public void run() {
//		실제 working thread가 수행하고 싶은 기능 작성

//		501~1000 합계
		sum = 0;
		for(int i =501;i<1001;i++) {
			sum+=i;
			System.out.println(this.getName() + ", " + i + ", " + sum );
		}
	}
	
//	run method의 내부코드가 종료하면 working thread도 종료
	
}

