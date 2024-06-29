package Profile;

import java.util.Scanner;

public class ProfileTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		ProfileManager pm = new ProfileManager();
		Profile profile = new Profile();

//		for(int i =0;i<2;i++) {
			profile.setName(a.nextLine());
			profile.setGen(a.nextLine());
			profile.setMobile(a.nextLine());
			profile.setE_mail(a.nextLine());
			profile.setHome(a.nextLine());
			profile.setFriend(a.nextLine());
			profile.setMemo(a.nextLine());
			profile.setBirth(a.nextLine());
			pm.add(profile);
//		}
		
		System.out.println(pm.list.toString());
		System.out.println("=================================");
		
		boolean run = true;
		while(run) {
			System.out.print("search, print, add, modify ,delete, end\n");
			String s1 = "";
			s1 = a.nextLine();
			if(s1.equals("search")) {
				System.out.print("name, mobile, email\n");
				String s = "";
				s = a.nextLine();
				if(s.equals("name")) {
					System.out.println("이름으로 검색: ");
					String name = "";
					name = a.nextLine();
					System.out.println(pm.SearchName(name));
				}	
				else if(s.equals("mobile")) {	
					System.out.println("모바일로 검색: ");
					String mobile = "";
					mobile = a.nextLine();
					System.out.println(pm.SearchMobile(mobile));
				}
				
				else if(s.equals("email")) {
					System.out.println("EMail로 검색: ");
					String e_mail = "";
					e_mail = a.nextLine();
					System.out.println(pm.SearchEmail(e_mail));
				}
			}
			else if(s1.equals("add")) {
				System.out.print("add\n");
				Profile profile1 = new Profile();
				profile1.setName(a.nextLine());
				profile1.setGen(a.nextLine());
				profile1.setMobile(a.nextLine());
				profile1.setE_mail(a.nextLine());
				profile1.setHome(a.nextLine());
				profile1.setFriend(a.nextLine());
				profile1.setMemo(a.nextLine());
				profile1.setBirth(a.nextLine());
				
				pm.add(profile1);
			}
				
			else if(s1.equals("modify")){
				System.out.print("modify\n");
				System.out.print("name, gen, mobile, email, home, friend, memo\n");
				String s2 = "";
				s2 = a.nextLine();
				String phone1 = "";
				phone1 = a.nextLine();
				if(s2.equals("name")) {
					System.out.println("이름 수정: ");
					String name1 = "";
					name1 = a.nextLine();
					pm.setname(phone1, name1);
				}	
				else if(s2.equals("gen1"))	{
					System.out.println("성별 수정: ");
					String gen1;
					gen1 = a.nextLine();
					a.nextLine();
					pm.setgen(phone1, gen1);
				}
				else if(s2.equals("Mobile")) {
					System.out.println("mobile 수정: ");
					String mobile1 = "";
					mobile1 = a.nextLine();
					pm.setemail(phone1,mobile1);
				}
				else if(s2.equals("email")) {
					System.out.println("EMail 수정: ");
					String e_mail1 = "";
					e_mail1 = a.nextLine();
					pm.setemail(phone1,e_mail1);
				}
				else if(s2.equals("home")) {
					System.out.println("home 수정: ");
					String home1 = "";
					home1 = a.nextLine();
					pm.sethome(phone1,home1);
				}
					
				else if(s2.equals("friend")) {
					System.out.println("관계 수정: ");
					String friend1 = "";
					friend1 = a.nextLine();
					pm.sethome(phone1,friend1);
				}
					
				else if(s2.equals("memo")) {
					System.out.println("memo 수정: ");
					String memo1 = "";
					memo1 = a.nextLine();
					pm.sethome(phone1,memo1);
				}
				System.out.println(pm.list.toString());		
			}
			else if(s1.equals("delete")){
				System.out.print("delete\n");
				String phone2="";
				phone2 = a.nextLine();
				pm.delete(phone2);
				if(pm.cnt!=0)System.out.println(pm.list.toString());
			}
			else if(s1.equals("end")){ 
				System.out.print("end\n");
				System.out.println(pm.list.toString());
				run = false;
			}
			else if(s1.equals("print")) {
				if(pm.cnt!=0)System.out.println(pm.list.toString());
			}
		}
	}
}
