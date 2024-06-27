import java.util.ArrayList;
import java.util.List;

public class ProfileManager {

//	생성자
	List<Profile> list = new ArrayList();
	
//	추가
	public void add(String name, char gen, String mobile, String e_mail, String home, String friend, String memo,
			String birth, String etc) {
		list.add(new Profile(name, gen, mobile, e_mail, home, friend, memo, birth,etc));
	}
	
	
//	main에서 for문 돌리고
//	해당 for문에서 나오는 객체를 여기 class로 하나씩 옮겨서
//	탐색 하는데 해당 값을 index를 반환하게 해야하나
	
//	탐색
	
	
	public String SearchName() {
		
		return  list.toString();
	}
	public String SearchMobile(String mobile1) {
		
		return  list.toString();
	}
	public String SearchEmail(String EMail) {
		
		return  list.toString();
	}
	public String SearchHome(String Home) {
		
		return  list.toString();
	}
	public String SearchBirth(String Birth) {
		
		return  list.toString();
	}
	
//	수정
	public void set() {
		
	}
	
	
	
//	삭제 
	public void delete() {
		list.remove(SearchName());
	}
	
	
}
