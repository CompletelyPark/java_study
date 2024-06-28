
public class threadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		프로그램을 시작하면 현재의 코드를 작동시키는 main thread가 생성돼 실행된다.
		
		System.out.print(Thread.activeCount()+"\n");
		
//		현재 실행중인 thread를 thread 객체로 만들어서 리턴
		Thread cur = Thread.currentThread();
		System.out.print(cur + "\n" + cur.getState() + cur.isAlive());
		System.out.print(cur.getPriority());
//		thread 식별자, thread 이름, thread 우선순위, thread 그룹이름 순서로 출력
		
//		Runnable 구현한 클래스로 객체 생성
		CalThreadRun ctr = new CalThreadRun();
		Thread ct = new Thread(ctr);
//		Runnable r = new Runnable();	// 인터페이스라 안됨
			
//		working thread 시작
		ct.start();
		
//		main thread 에서 계산
		int sum = 0;
		for(int i =0;i<100;i++) {
			sum+=i;
			System.out.println(cur.getName() + ", " + i + ", " + sum);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(sum);
		
		try {
//			working thread가 종료할 떄까지 현재 thread(main)이 멈춘다
			ct.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum + ctr.sum);
	}
	
}

//	working thread 만들기 2
//	Runnable 인터페이스를 implements 한다 
class CalThreadRun implements Runnable  {
	
//	필드, 생성자 가능
	int sum;
	
	@Override
	public void run() {
		Thread curThread = Thread.currentThread();
		
//		실제 working thread가 수행하고 싶은 기능 작성

//		501~1000 합계
		sum = 0;
		for(int i =501;i<1001;i++) {
			sum+=i;
			System.out.println(curThread.getName() + ", " + i + ", " + sum );
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	run method의 내부코드가 종료하면 working thread도 종료
	
}

