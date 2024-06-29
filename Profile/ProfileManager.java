package Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileManager {

//	생성자
	List<Profile> list = new ArrayList();
	
	int cnt=0;
	
//	추가
	public void add(Profile arr) {
		list.add(arr);
		cnt++;
	}
	
//	main에서 for문 돌리고
//	해당 for문에서 나오는 객체를 여기 class로 하나씩 옮겨서
//	탐색 하는데 해당 값을 index를 반환하게 해야하나
	
//	탐색
	public String SearchName(String name1) {
		String s = "xxx";
		for(Profile pr:list) {
			if(pr.name.equals(name1)) s = pr.toString();
		}
		return s;
	}
	public String SearchMobile(String mobile1) {
		String s = "xxx";
		for(Profile pr:list) {
			if(pr.mobile.equals(mobile1)) s = pr.toString();
		}
		return s;
	}
	public String SearchEmail(String EMail) {
		String s = "xxx";
		for(Profile pr:list) {
			if(pr.e_mail.equals(EMail)) s = pr.toString();
		}
		return s;
	}

//	수정 기본키 핸드폰번호
//	수정 이름
	public void setname(String phone, String name) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setName(name);
			}
		}
	}	
//	수정 성별
	public void setgen(String phone, String gen) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setGen(gen);
			}
		}
	}	
//	수정 모바일
	public void setmobile(String phone, String mobile) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setMobile(mobile);
			}
		}
	}	
//	수정 email
	public void setemail(String phone, String name) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setName(name);
			}
		}
	}
//	수정 주소
	public void sethome(String phone, String home) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setHome(home);
			}
		}
	}
//	수정 관계
	public void setfriend(String phone, String friend) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setFriend(friend);
			}
		}
	}
//	수정 메모
	public void setmemo(String phone, String memo) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setMemo(memo);
			}
		}
	}	
//	수정 생일
	public void setbirth(String phone, String birth) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				pr.setBirth(birth);
			}
		}
	}

//	삭제 
	public void delete(String phone) {
		for(Profile pr:list) {
			if(pr.mobile.equals(phone)) {
				list.remove(pr);
				cnt--;
				break;
			}
		}
	}
	
	
}
