import java.util.Scanner;

public class work0626Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 =	"";
		Scanner a = new Scanner(System.in);
		s1 = a.nextLine();
		work_0626 work = new work_0626(s1);
		if(!work.Month()) {
			System.out.println("해당하는 출생 월 x");
		}
		else {
			if(!work.Day()) {
				System.out.println("해당하는 출생 일 x");
			}
			else {
				if(!work.gen()) {
					System.out.println("성별 일치 x");
				}
				else {
					if(!work.lastCode1()) {
						System.out.println("마지막 2번째 일치 x");
					}
					else {
						if(!work.lastCode2())
							System.out.println("마지막 코드 일치 x");
						else {
							System.out.println("정상 주민번호");
						}
					}
				}
			}
		}
			
	}

}
