//	키보드로 주민번호 입력
//
//	주민번호 검증 로직
//	정상적인 주민번호인지 판별
//	앞자리 6자리 생년월일 
//	뒷자리 1자리 성별 1,2,3,4 + 행정센터 번호 뒤 4자리 + 신고한 순번 뒤 1자리 (보통 1,2,3) 
//	+ 검증 숫자 1자리 계산방법
//		   123456-1234567 
//	각자리에 234567-892345 곱해서 합계 계산 
//	합계를 11로 나누어서 나머지 구하기 -> 11 - 나머지 -> 결과값 0부터 9까지 는 검증 숫자 값
//	나머지가 10 -> 0 11 -> 1
//	검증코드값 비교 

public class work_0626 {
	String s1 = null;
	String s2 = "234567-892345";
	
	work_0626(){
		
	}
	
	work_0626(String s11){
		this.s1 = s11;
	}
	
	int Year() {
		int year1 = s1.charAt(0)-48;
		int year2 = s1.charAt(1)-48;
		int year = year1 * 10 + year2;
		return year;
	}
	
	int month = 0;
	boolean Month() {
		int month1 = s1.charAt(2)-48;
		int month2 = s1.charAt(3)-48;
		month = month1 * 10 + month2;
		if(month<0 && month >12)	return false;
		else return true;
	}
	
	boolean Day() {
		int Day1 = s1.charAt(4)-48;
		int Day2 = s1.charAt(5)-48;
		int Day = Day1 * 10 + Day2;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			if(Day >= 1 && Day <= 31)return true;
			else return false;
		else if (month == 2)
			if(Day >= 1 && Day <= 28)return true;
			else return false;
		else
			if(Day >= 1 && Day <= 30)return true;
		else return false;
		
		
	}
	boolean gen() {
		int gen = s1.charAt(7)-48;
		if(this.Year()>0&& this.Year()<=24) 
			if (gen ==3 || gen == 4) return true;
			else return false;
		else 
			if (gen ==1 || gen == 2) return true;
			else return false;
	}
	
	boolean lastCode1() {
		int x = s1.charAt(12)-48;
		if(x==1||x==2||x==3) return true;
		else return false;
	}
	
	boolean lastCode2() {
		int sum = 0;
		for(int i = 0;i<13;i++) {
			if(i==6)continue;
			sum+=(s1.charAt(i)-48)*(s2.charAt(i)-48);
		}
		int remain = sum%11;
		remain = 11 - remain;
		if(remain ==10 || remain ==11)
			remain-=10;
		if(remain==s1.charAt(13)-48)
			return true;
		else return false;
	}
	
}
